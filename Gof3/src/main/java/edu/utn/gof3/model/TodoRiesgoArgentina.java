package edu.utn.gof3.model;

import lombok.Data;

@Data
public class TodoRiesgoArgentina extends TodoRiesgo{
    public TodoRiesgoArgentina(float precio, float porcentaje, Auto auto) {
        super(precio, porcentaje, auto);
    }
}
