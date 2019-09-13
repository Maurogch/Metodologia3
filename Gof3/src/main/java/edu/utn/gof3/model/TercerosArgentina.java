package edu.utn.gof3.model;

import lombok.Data;

@Data
public class TercerosArgentina extends Terceros {
    public TercerosArgentina(float precio, float porcentaje, Auto auto) {
        super(precio, porcentaje, auto);
    }
}
