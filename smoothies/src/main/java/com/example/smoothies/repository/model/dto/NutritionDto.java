package com.example.smoothies.repository.model.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class NutritionDto implements Serializable {

    String kcal;
    String fat;
    String saturates;
    String carbs;
    String sugars;
    String fibre;
    String protein;
    String salt;
}
