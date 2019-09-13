package edu.utn.gof3.Factory;

import edu.utn.gof3.model.Auto;
import edu.utn.gof3.model.ResponsabilidadCivil;
import edu.utn.gof3.model.ResponsabilidadMercosur;
import edu.utn.gof3.model.Terceros;
import edu.utn.gof3.model.TercerosMercosur;
import edu.utn.gof3.model.TodoRiesgo;
import edu.utn.gof3.model.TodoRiesgoMercosur;

public class MercosurFactory implements PolizaFactory {

    @Override
    public Terceros crearTerceros(Auto auto) {
        return new TercerosMercosur(100, 10, auto, 10);
    }

    @Override
    public ResponsabilidadCivil crearResponsabilidadCivil(Auto auto) {
        return new ResponsabilidadMercosur(150, 10, auto, 20);
    }

    @Override
    public TodoRiesgo crearTodoRiesgo(Auto auto) {
        return new TodoRiesgoMercosur(200, 10, auto,30);
    }
}
