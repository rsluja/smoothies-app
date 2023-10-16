package com.example.smoothies.controller;

import com.example.smoothies.repository.model.dto.SmoothieDto;
import com.example.smoothies.services.SmoothieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RequestMapping("/api")
@RestController
public class SmoothiesController {

    private SmoothieService smoothieService;

    SmoothiesController(SmoothieService smoothieService) {
        this.smoothieService = smoothieService;
    }


    @GetMapping("/smoothies")
    public List<SmoothieDto> getAllSmoothies() {
        return smoothieService.getAllSmoothies();
    }

    @DeleteMapping("/smoothie/{id}")
    public HttpStatus deleteSmoothieById(@PathVariable("id") Long id) {
        return smoothieService.deleteById(id);
    }

    @PutMapping(value = "/smoothie/{id}", consumes="application/json")
    public ResponseEntity<SmoothieDto> updateSmoothie(@RequestBody SmoothieDto smoothieToUpdate, @PathVariable("id") Long id) {
        return smoothieService.updateSmoothie(smoothieToUpdate, id);
    }
}
