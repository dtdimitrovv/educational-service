package com.example.educationalservice.client.config;

import com.rometools.rome.feed.rss.Channel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.feed.RssChannelHttpMessageConverter;

@Configuration
public class FeignClientConfig {
    @Bean
    public HttpMessageConverter<Channel> httpMessageConverter() {
        return new RssChannelHttpMessageConverter();
    }
}
