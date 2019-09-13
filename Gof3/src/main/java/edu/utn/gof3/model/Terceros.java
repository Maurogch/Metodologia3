package edu.utn.gof3.model;

public abstract class Terceros extends Poliza{
    protected Terceros(float precio, float porcentaje, Auto auto) {
        super(precio, porcentaje, auto);
    }
}
