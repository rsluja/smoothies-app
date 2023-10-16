package com.example.smoothies.repository.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "smoothie")
@Data
@Builder(toBuilder=true)
@NoArgsConstructor
@AllArgsConstructor
public class SmoothieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String description;

    String kcal;
    String fat;
    String saturates;
    String carbs;
    String sugars;
    String fibre;
    String protein;
    String salt;
}


