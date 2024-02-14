package com.example.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Telefono implements Serializable{

    private static final long serialVersionUID = 1L;

    private String numero;
    private String descripcion;

}
