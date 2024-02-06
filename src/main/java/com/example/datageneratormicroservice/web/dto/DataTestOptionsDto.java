package com.example.datageneratormicroservice.web.dto;

import com.example.datageneratormicroservice.entity.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class DataTestOptionsDto {
    private int delayInSeconds;
    private Data.MeasurementType[] measurementType;
}
