### Primer TP de Python

Tp de introdución a python para materia Metodología de Sistemas 3

## Consignas

TP Python - Clases

1.	Genere las clases Cliente(nombre, edad, email) con todos sus atrib. en el constructor y Cuenta(numero, saldo, fecha_hora_alta, cliente),  aquí solo la fecha_hora_alta será obtenida automáticamente en el constructor (usar: from datetime import datetime, atrib= datetime.now()). Guardar ambas en el archivo models.py 
2.	Genere una clase repositorio de Clientes y uno de Cuentas
3.	Agregue un método en Cliente para que se valide el email del Cliente (que tenga un arroba en el string...),y en la Cuenta : retiro(importe), deposito(importe) y get_saldo.
4.	Genere otro archivo bank.py (haga import models) con un main y: 
1.	Instancie dos clientes y 4 cuentas (dos de cada) y agreguelos a los repositorios respectivos.
2.	Crear un método listar_cuentas(repositorio_cuentas) que me liste por consola todas las cuentas del banco con los nombres de los clientes
3.	Efectue depositos y retiros sobre determinadas cuentas y luego liste las cuentas para verificar sus saldos
4.	Elimine una cuenta del repositorio, valide que su saldo esté en 0, sino dispare una Excepción (raise Exception('...'))
