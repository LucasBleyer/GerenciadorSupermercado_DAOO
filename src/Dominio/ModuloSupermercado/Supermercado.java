
package Dominio.ModuloSupermercado;

import Dominio.ModuloPessoa.Administrador;
import Dominio.ModuloPessoa.Cliente;

public class Supermercado {
    
    private Cliente cliente;
    private Administrador administrador;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
}
