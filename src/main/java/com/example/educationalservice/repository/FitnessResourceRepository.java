package com.example.educationalservice.repository;

import com.example.educationalservice.entity.FitnessResource;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.Optional;

public interface FitnessResourceRepository extends JpaRepository<FitnessResource,Long> {
    Optional<FitnessResource>findByUrlAndTitleAndPublishedOn(String url, String title, Date publishedOn);
}
