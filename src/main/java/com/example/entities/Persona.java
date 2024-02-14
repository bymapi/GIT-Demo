package com.example.entities;

import java.io.Serializable;
import java.time.LocalDate;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "personas")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Persona implements Serializable {

    // Id autogenerado incremental
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // Datos Personales
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private LocalDate fechaDeNacimiento;


    // Datos Laborales
    private double salario;
    private LocalDateTime horaYDateTime;

}
