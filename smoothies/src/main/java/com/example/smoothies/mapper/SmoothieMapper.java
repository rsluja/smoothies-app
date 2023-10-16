package com.example.smoothies.mapper;

import com.example.smoothies.repository.model.dto.NutritionDto;
import com.example.smoothies.repository.model.dto.SmoothieDto;
import com.example.smoothies.repository.model.SmoothieEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class SmoothieMapper {

    public SmoothieDto mapEntityToDto(SmoothieEntity smoothieEntity) {
        return SmoothieDto.builder()
                .id(smoothieEntity.getId())
                .name(smoothieEntity.getName())
                .description(smoothieEntity.getDescription())
                .nutritions(NutritionDto.builder()
                        .kcal(smoothieEntity.getKcal())
                        .fat(smoothieEntity.getFat())
                        .saturates(smoothieEntity.getSaturates())
                        .carbs(smoothieEntity.getCarbs())
                        .sugars(smoothieEntity.getSugars())
                        .fibre(smoothieEntity.getFibre())
                        .protein(smoothieEntity.getProtein())
                        .salt(smoothieEntity.getSalt())
                        .build())
                .build();

    }
    public List<SmoothieDto> mapEntitiesToDtos(List<SmoothieEntity> smoothies) {
        List<SmoothieDto> dtos = new ArrayList<>();
        smoothies.forEach(smoothieEntity -> dtos.add(mapEntityToDto(smoothieEntity)));
      return dtos;
    }

    public SmoothieEntity mapDtoToEntity(SmoothieDto dto) {
        SmoothieEntity entity = SmoothieEntity.builder()
                .id(dto.getId())
                .name(dto.getName())
                .description(dto.getDescription()).build();

        if (!ObjectUtils.isEmpty(dto.getNutritions())) {
            return entity.toBuilder()
                    .kcal(dto.getNutritions().getKcal())
                    .fat(dto.getNutritions().getFat())
                    .saturates(dto.getNutritions().getSaturates())
                    .carbs(dto.getNutritions().getCarbs())
                    .sugars(dto.getNutritions().getSugars())
                    .fibre(dto.getNutritions().getFibre())
                    .protein(dto.getNutritions().getProtein())
                    .salt(dto.getNutritions().getSalt())
                    .build();
        }
        return entity;
    }
}
