import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {
    private Map<Cliente, cuenta> clientesCuentas;

    public Banco() {
        this.clientesCuentas = new HashMap<>();
    }

    public void agregarCliente(Cliente cliente, cuenta cuenta) {
        clientesCuentas.put(cliente, cuenta);
    }

    public List<Transacciones> depositar(Cliente cliente, double valor) {
        List<Transacciones> transacciones = new ArrayList<>();
        cuenta cuenta = clientesCuentas.get(cliente);
        if (cuenta != null) {
            cuenta.setSaldo(cuenta.getSaldo() + valor);
            transacciones.add(new Transacciones(valor, "Depósito"));
        }
        return transacciones;
    }

    public List<Transacciones> retirar(Cliente cliente, double valor) {
        List<Transacciones> transacciones = new ArrayList<>();
        cuenta cuenta = clientesCuentas.get(cliente);
        if (cuenta != null && cuenta.getSaldo() >= valor) {
            cuenta.setSaldo(cuenta.getSaldo() - valor);
            transacciones.add(new Transacciones(valor, "Retiro"));
        }
        return transacciones;
    }

    public double consultarSaldo(Cliente cliente) {
        cuenta cuenta = clientesCuentas.get(cliente);
        if (cuenta != null) {
            return cuenta.getSaldo();
        }
        return 0;
    }
}
