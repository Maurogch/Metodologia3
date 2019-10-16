from model.Cliente import Cliente


class ClienteRepository:
    def __init__(self):
        self.list = []

    def add(self, item: Cliente):
        self.list.append(item)

    def delete(self, item: Cliente):
        self.list.remove(item)

    def get_all(self):
        return self.list

    def get_by_numero(self, numero: int):
        for f in self.list:
            if numero == f.numero:
                return f
        return None
