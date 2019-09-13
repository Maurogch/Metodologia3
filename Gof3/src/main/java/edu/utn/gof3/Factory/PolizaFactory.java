package edu.utn.gof3.Factory;

import edu.utn.gof3.model.Auto;
import edu.utn.gof3.model.ResponsabilidadCivil;
import edu.utn.gof3.model.Terceros;
import edu.utn.gof3.model.TodoRiesgo;

public interface PolizaFactory {
    Terceros crearTerceros(Auto auto);
    ResponsabilidadCivil crearResponsabilidadCivil(Auto auto);
    TodoRiesgo crearTodoRiesgo(Auto auto);
}
