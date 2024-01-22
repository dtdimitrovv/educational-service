package com.example.educationalservice.service.cron;

import com.example.educationalservice.client.FitnessDataClient;
import com.example.educationalservice.entity.FitnessResource;
import com.example.educationalservice.repository.FitnessResourceRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class FitnessDataServiceImpl implements FitnessDataService {
    private final FitnessDataClient fitnessDataClient;
    private final FitnessResourceRepository fitnessResourceRepository;

    public FitnessDataServiceImpl(FitnessDataClient fitnessDataClient, FitnessResourceRepository fitnessResourceRepository) {
        this.fitnessDataClient = fitnessDataClient;
        this.fitnessResourceRepository = fitnessResourceRepository;
    }

    @PostConstruct
    @Scheduled(fixedDelay = 1, timeUnit = TimeUnit.DAYS)
    @Override
    public void sync() {
        this.fitnessDataClient
                .collect()
                .getItems()
                .forEach(item -> {
                    this.fitnessResourceRepository.findByUrlAndTitleAndPublishedOn(item.getLink(), item.getTitle(), item.getPubDate())
                            .ifPresentOrElse(dbItem -> {
                                dbItem.setUrl(item.getLink());
                                dbItem.setTitle(item.getTitle());
                                dbItem.setPublishedOn(item.getPubDate());
                                this.fitnessResourceRepository.save(dbItem);
                            }, () -> this.fitnessResourceRepository.save(new FitnessResource(item.getLink(), item.getTitle(), item.getPubDate())));
                });
    }
}
