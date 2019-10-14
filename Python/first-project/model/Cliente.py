import re

class Cliente:
    def __init__(self, nombre, edad, email):
        self.nombre = None
        self.edad = None
        self.email = None

    def check_email(self):
        try:
            re.compile('^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$')
            return True
        except re.error:
            return False
