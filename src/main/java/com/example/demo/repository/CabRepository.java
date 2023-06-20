package com.example.demo.repository;

import com.example.demo.model.Cab;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CabRepository extends JpaRepository<Cab,Integer> {
}
