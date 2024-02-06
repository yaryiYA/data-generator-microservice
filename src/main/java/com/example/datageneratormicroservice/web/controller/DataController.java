package com.example.datageneratormicroservice.web.controller;

import com.example.datageneratormicroservice.entity.Data;
import com.example.datageneratormicroservice.entity.test.DataTestOptions;
import com.example.datageneratormicroservice.service.KafkaDataService;
import com.example.datageneratormicroservice.service.TestDataService;
import com.example.datageneratormicroservice.web.dto.DataDto;
import com.example.datageneratormicroservice.web.dto.DataTestOptionsDto;
import com.example.datageneratormicroservice.web.mapper.DataMapper;
import com.example.datageneratormicroservice.web.mapper.DataTestOptionsMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/data")
@RequiredArgsConstructor
public class DataController {

    private final KafkaDataService kafkaDataService;
    private final DataMapper dataMapper;
    private final DataTestOptionsMapper dataTestOtionsMapper;
    private final TestDataService testDataService;


    @PostMapping("/send")
    public void send(@RequestBody DataDto dataDto) {

        Data data = dataMapper.toEntity(dataDto);
        kafkaDataService.send(data);
    }

    @PostMapping ("/test/send")
    public void send(@RequestBody DataTestOptionsDto dataTestOptionsDto) {
        DataTestOptions dataTest = dataTestOtionsMapper.toEntity(dataTestOptionsDto);
        testDataService.send(dataTest);

    }
}
