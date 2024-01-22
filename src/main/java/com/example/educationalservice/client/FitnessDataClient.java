package com.example.educationalservice.client;

import com.example.educationalservice.client.config.FeignClientConfig;
import com.rometools.rome.feed.rss.Channel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "fitnessDataClient", configuration = FeignClientConfig.class, url = "${fitness.data.url}")
public interface FitnessDataClient {
    @GetMapping(consumes = MediaType.APPLICATION_RSS_XML_VALUE)
    Channel collect();
}
