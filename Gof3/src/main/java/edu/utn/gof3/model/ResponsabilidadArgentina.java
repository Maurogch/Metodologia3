package edu.utn.gof3.model;

import lombok.Data;

@Data
public class ResponsabilidadArgentina extends ResponsabilidadCivil {
    public ResponsabilidadArgentina(float precio, float porcentaje, Auto auto) {
        super(precio, porcentaje, auto);
    }
}
