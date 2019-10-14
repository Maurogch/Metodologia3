from model.Cuenta import Cliente
from model.Cuenta import Cuenta
from repository.ClienteRepository import ClienteRepository

if __name__ == '__main__':

    clienteRepository = ClienteRepository()

    clienteRepository.add(Cliente("John", 18, "algo@algo.com"))
    clienteRepository.add(Cliente("Doe", 18, "algo@algo.com"))

    print(clienteRepository.get_all())




