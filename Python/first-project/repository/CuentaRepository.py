from model.Cuenta import Cuenta
import uuid


class CuentaRepository:
    def __init__(self):
        self.list = []

    def add(self, item: Cuenta):
        self.list.append(item)

    """
    Expects an uuid.UUID("value")
    Deletes an account only if it has balance of 0
    Otherwise throw and exception
    """
    def delete(self, numero: uuid):
        for item in self.list:
            if item.numero == numero:
                if item.saldo != 0:
                    raise Exception('Cuenta con saldo distinto a 0')
                else:
                    self.list.remove(item)
                break

    def get_all(self):
        return self.list

    def get_by_nombre(self, nombre: str):
        for f in self.list:
            if nombre == f.nombre:
                return f
        return None

    def listar_cuentas(self):
        print("------------------------------------------------")
        print("Listado de Cuentas: ")
        for item in self.list:
            print(f'Cuenta numero: {item.numero}')
            print(f'Cliente: {item.cliente.nombre}')
            print(f'Creada el: {str(item.fecha_hora_alta)}')
            print(f'Saldo: ${item.saldo}\n')
        print("------------------------------------------------\n")
