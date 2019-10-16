import re


class Cliente:
    """
    Constructor with typing
    """
    def __init__(self, nombre: str, edad: int, email: str):
        self.nombre = nombre
        self.edad = edad
        self.email = email

    """
    ToString method
    """
    def __repr__(self):
        return f'Cliente(nombre: {self.nombre!r}, edad: {self.edad!r}, email: {self.email!r})'

    """
    Method will check via regex if mail is valid, if it is not valid match will be none
    match.group() will return an array of the matches, we don't need that here
    """
    def check_email(self):
        match = re.search(r'\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,}\b', self.email, re.I)
        if match is None:
            return False
        else:
            return True


