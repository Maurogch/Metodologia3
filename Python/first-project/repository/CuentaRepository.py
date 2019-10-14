class CuentaRepository:
    def __init__(self):
        self.list = []

    def add(self, item):
        self.list.append(item)

    def delete(self, item):
        self.list.remove(item)

    def get_all(self):
        return self.list

    def get_by_nombre(self, nombre):
        for f in self.list:
            if nombre == f.nombre:
                return f
        return None