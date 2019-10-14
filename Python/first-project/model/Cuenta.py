from datetime import datetime
from model.Cliente import Cliente


class Cuenta:
    def __init__(self):
        self.numero = None
        self.saldo = None
        self.fecha_hora_alta = datetime.now()
        self.cliente = Cliente()


