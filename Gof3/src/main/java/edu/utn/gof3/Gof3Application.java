package edu.utn.gof3;

import edu.utn.gof3.Factory.ArgentinaFactory;
import edu.utn.gof3.Factory.MercosurFactory;
import edu.utn.gof3.Factory.PolizaFactory;
import edu.utn.gof3.model.Auto;
import edu.utn.gof3.model.Cliente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Gof3Application {

	public static void main(String[] args) {
		Auto auto1 = new Auto("Fiat","HWZ983", 20000);
		Auto auto2 = new Auto("Peugeote","ACA123", 12933);
		PolizaFactory polizaFactoryMercosur = new MercosurFactory();
		PolizaFactory polizaFactoryArgentina = new ArgentinaFactory();

		Cliente cliente1 = Cliente.builder().nombre("Juan Carlos").dni(9362673).poliza(polizaFactoryMercosur.crearTerceros(auto1)).build();
		Cliente cliente2 = Cliente.builder().nombre("Ana Laura").dni(9348727).poliza(polizaFactoryArgentina.crearTodoRiesgo(auto2)).build();

		System.out.println("Mercosur: " + cliente1.getPoliza().calcPrecio());
		System.out.println("Argentina: " + cliente2.getPoliza().calcPrecio());
	}

}
