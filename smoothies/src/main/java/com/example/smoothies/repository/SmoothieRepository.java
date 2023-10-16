package com.example.smoothies.repository;


import com.example.smoothies.repository.model.SmoothieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmoothieRepository extends JpaRepository<SmoothieEntity, Long> {


}
