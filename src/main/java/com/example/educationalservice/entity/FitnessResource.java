package com.example.educationalservice.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="fitnessResources")
public class FitnessResource {
    private Long id;
    private String url;
    private String title;
    private Date publishedOn;

    public FitnessResource() {
    }

    public FitnessResource(String url, String title, Date publishedOn) {
        this.url = url;
        this.title = title;
        this.publishedOn = publishedOn;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public FitnessResource setId(Long id) {
        this.id = id;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public FitnessResource setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public FitnessResource setTitle(String title) {
        this.title = title;
        return this;
    }

    public Date getPublishedOn() {
        return publishedOn;
    }

    public FitnessResource setPublishedOn(Date publishedOn) {
        this.publishedOn = publishedOn;
        return this;
    }
}
