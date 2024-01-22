package com.example.educationalservice.service;

import com.example.educationalservice.entity.FitnessResource;
import com.example.educationalservice.repository.FitnessResourceRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FitnessResourceServiceImpl implements FitnessResourceService {
    private final FitnessResourceRepository fitnessResourceRepository;

    public FitnessResourceServiceImpl(FitnessResourceRepository fitnessResourceRepository) {
        this.fitnessResourceRepository = fitnessResourceRepository;
    }

    @Override
    public Page<FitnessResource> getAll(Pageable pageable) {
        return this.fitnessResourceRepository.findAll(pageable);
    }
}
