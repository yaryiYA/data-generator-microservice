package com.example.datageneratormicroservice.service;

import com.example.datageneratormicroservice.entity.test.DataTestOptions;

public interface TestDataService {

    void send(DataTestOptions dataTestOptions);
}
