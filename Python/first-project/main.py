from model.Cuenta import Cliente
from model.Cuenta import Cuenta
from repository.ClienteRepository import ClienteRepository
from repository.CuentaRepository import CuentaRepository
import uuid

if __name__ == '__main__':

    clienteRepository = ClienteRepository()
    cuentaRepository = CuentaRepository()

    cliente1 = Cliente("John Doe", 18, "algo@algo.com")
    cliente2 = Cliente("Cosme Fulanito", 25, "cosme@fulanito.com")

    clienteRepository.add(cliente1)
    clienteRepository.add(cliente2)

    cuentaRepository.add(Cuenta(uuid.uuid4(), 1000, cliente1))
    cuentaRepository.add(Cuenta(uuid.uuid4(), 1500, cliente1))
    cuentaRepository.add(Cuenta(uuid.UUID("785620fb-fe1a-4da5-9b77-7df0ab357b06"), 2000.5, cliente2))
    cuentaRepository.add(Cuenta(uuid.UUID("384fd525-ece5-48c6-a681-6c32dda80843"), 0, cliente2))

    # ToString of Class
    print(cuentaRepository.get_all(), "\n")

    # List Accounts
    cuentaRepository.listar_cuentas()

    # Checking email of first client, returns true
    print("Email valido: ", clienteRepository.get_all()[0].check_email(), "\n")

    # Deposit, withdraw and print balance
    print(cuentaRepository.get_all()[0].deposito(500))
    print(cuentaRepository.get_all()[0].retiro(245.32))
    print(cuentaRepository.get_all()[2].deposito(234.23))
    print(cuentaRepository.get_all()[2].retiro(224.52))
    print(cuentaRepository.get_all()[2].deposito(324.53))
    print(cuentaRepository.get_all()[2].retiro(215.12))
    print()

    cuentaRepository.listar_cuentas()

    # Try to delete account, should give exception
    try:
        print("Intentando borrar cuenta con balance distinto a 0")
        cuentaRepository.delete(uuid.UUID("785620fb-fe1a-4da5-9b77-7df0ab357b06"))
    except Exception as ex:
        # Print error message
        print("Error: ", str(ex))

    # Try to delete an account with balance 0, should let you
    try:
        cuentaRepository.delete(uuid.UUID("384fd525-ece5-48c6-a681-6c32dda80843"))
    except Exception as ex:
        print("Error: ", str(ex))

    print()
    print("Listado de cuentas luego de borrar cuenta")
    cuentaRepository.listar_cuentas()
