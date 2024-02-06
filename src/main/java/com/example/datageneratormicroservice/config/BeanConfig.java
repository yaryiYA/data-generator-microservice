package com.example.datageneratormicroservice.config;

import com.jcabi.xml.XML;
import com.jcabi.xml.XMLDocument;
import lombok.SneakyThrows;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;
import java.util.Objects;

@Configuration
public class BeanConfig {

    @SneakyThrows
    @Bean
    public XML producerXML() {
        return new XMLDocument(
                Objects.requireNonNull(getClass().getResourceAsStream("/kafka/producer.xml")).readAllBytes()
        );
    }
}
