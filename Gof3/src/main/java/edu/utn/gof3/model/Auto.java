package edu.utn.gof3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Auto {
    private String marca;
    private String patente;
    private float valorDeclarado;
}
