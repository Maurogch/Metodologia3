package edu.utn.gof3.model;

import lombok.Data;

@Data
public class ResponsabilidadMercosur extends ResponsabilidadCivil {
    private float recargo;

    public ResponsabilidadMercosur(float precio, float porcentaje, Auto auto, float recargo) {
        super(precio, porcentaje, auto);
        this.recargo = recargo;
    }

    @Override
    public float calcPrecio(){
        float porcentajeAuto;
        float total;

        porcentajeAuto = auto.getValorDeclarado() * porcentaje / 100;

        total = precio + porcentajeAuto;
        total += total * recargo / 100;

        return total;
    }
}
