package com.example.educationalservice.controller;

import com.example.educationalservice.entity.FitnessResource;
import com.example.educationalservice.service.FitnessResourceService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FitnessResourceController {
    private final FitnessResourceService fitnessResourceService;

    public FitnessResourceController(FitnessResourceService fitnessResourceService) {
        this.fitnessResourceService = fitnessResourceService;
    }

    @GetMapping("/all")
    public Page<FitnessResource> getAll(Pageable pageable) {
        return this.fitnessResourceService.getAll(pageable);
    }
}
