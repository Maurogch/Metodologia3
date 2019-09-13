package edu.utn.gof3.Factory;

import edu.utn.gof3.model.Auto;
import edu.utn.gof3.model.ResponsabilidadArgentina;
import edu.utn.gof3.model.ResponsabilidadCivil;
import edu.utn.gof3.model.Terceros;
import edu.utn.gof3.model.TercerosArgentina;
import edu.utn.gof3.model.TodoRiesgo;
import edu.utn.gof3.model.TodoRiesgoArgentina;

public class ArgentinaFactory implements PolizaFactory {

    @Override
    public Terceros crearTerceros(Auto auto) {
        return new TercerosArgentina(100, 10, auto);
    }

    @Override
    public ResponsabilidadCivil crearResponsabilidadCivil(Auto auto) {
        return new ResponsabilidadArgentina(150, 10, auto);
    }

    @Override
    public TodoRiesgo crearTodoRiesgo(Auto auto) {
        return new TodoRiesgoArgentina(200, 10, auto);
    }
}
