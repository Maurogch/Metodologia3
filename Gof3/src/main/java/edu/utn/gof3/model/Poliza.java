package edu.utn.gof3.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Poliza {
    protected float precio;
    protected float porcentaje;
    protected Auto auto;

    public float calcPrecio(){
        float porcentajeAuto;

        porcentajeAuto = auto.getValorDeclarado() * porcentaje / 100;

        return precio + porcentajeAuto;
    }
}
