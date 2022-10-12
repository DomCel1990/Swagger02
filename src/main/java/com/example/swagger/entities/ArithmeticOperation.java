package com.example.swagger.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArithmeticOperation {
    private String name;
    private int minNumberOfOperands;
    private String description;
    private String[] properties;
}
