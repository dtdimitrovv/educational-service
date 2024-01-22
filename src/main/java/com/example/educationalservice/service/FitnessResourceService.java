package com.example.educationalservice.service;

import com.example.educationalservice.entity.FitnessResource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface FitnessResourceService {
    Page<FitnessResource> getAll(Pageable pageable);
}
