from datetime import datetime
from .Cliente import Cliente
import uuid


class Cuenta:
    def __init__(self, numero: uuid, saldo: float, cliente: Cliente):
        self.numero = numero
        self.saldo = saldo
        self.fecha_hora_alta = datetime.now()
        self.cliente = cliente

    def __repr__(self):
        return f'Cuenta(numero: {self.numero!r}, saldo: {self.saldo!r}, fecha_hora_alta: ' \
            f'{str(self.fecha_hora_alta)!r}, cliente: {self.cliente.__repr__()})\n'

    def retiro(self, importe: float):
        if self.saldo >= importe:
            self.saldo -= importe
            return f'${importe} retirado, nuevo saldo: ${self.saldo}'
        else:
            return "saldo insuficiente"

    def deposito(self, importe: float):
        self.saldo += importe
        return f'${importe} depositado, nuevo saldo: ${self.saldo}'

    def get_saldo(self):
        return self.saldo
