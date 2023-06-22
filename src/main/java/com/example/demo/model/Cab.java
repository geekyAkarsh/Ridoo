package com.example.demo.model;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "cab")
public class Cab {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    Integer perKmRate;

    Boolean available;
}
