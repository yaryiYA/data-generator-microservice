package com.example.datageneratormicroservice.entity.test;

import com.example.datageneratormicroservice.entity.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class DataTestOptions {
    private int delayInSeconds;
    private Data.MeasurementType[] measurementType;
}
