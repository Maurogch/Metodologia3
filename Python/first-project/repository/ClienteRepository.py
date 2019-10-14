class ClienteRepository:
    def __init__(self):
        self.list = []

    def add(self, item):
        self.list.append(item)

    def delete(self, item):
        self.list.remove(item)

    def get_all(self):
        return self.list

    def get_by_numero(self, numero):
        for f in self.list:
            if numero == f.numero:
                return f
        return None