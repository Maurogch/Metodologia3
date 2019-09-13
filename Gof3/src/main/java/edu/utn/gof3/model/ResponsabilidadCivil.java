package edu.utn.gof3.model;

public abstract class ResponsabilidadCivil extends Poliza{
    protected ResponsabilidadCivil(float precio, float porcentaje, Auto auto) {
        super(precio, porcentaje, auto);
    }
}
