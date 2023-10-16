package com.example.smoothies.services;

import com.example.smoothies.mapper.SmoothieMapper;
import com.example.smoothies.repository.model.dto.SmoothieDto;
import com.example.smoothies.repository.model.SmoothieEntity;
import com.example.smoothies.repository.SmoothieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SmoothieService {

    @Autowired
    private SmoothieRepository repository;
    @Autowired
    private SmoothieMapper smoothieMapper;

    public List<SmoothieDto> getAllSmoothies() {
        return smoothieMapper.mapEntitiesToDtos(repository.findAll());
    }


    public HttpStatus deleteById(Long id) {
        repository.deleteById(id);
        return HttpStatus.OK;
    }

    public ResponseEntity<SmoothieDto> updateSmoothie(SmoothieDto smoothieDto, Long id) {
        Optional<SmoothieEntity> fromDB = repository.findById(id);
        if (fromDB.isPresent()) {
            SmoothieEntity saved = repository.save(smoothieMapper.mapDtoToEntity(smoothieDto));
            return new ResponseEntity<>(smoothieMapper.mapEntityToDto(saved), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
