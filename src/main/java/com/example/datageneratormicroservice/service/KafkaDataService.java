package com.example.datageneratormicroservice.service;

import com.example.datageneratormicroservice.entity.Data;

public interface KafkaDataService {

    void send(Data data);
}
