package br.com.farmacia.repository;

import br.com.farmacia.beans.Cliente;

public interface ClienteRep {

    // metodo para cadastrar cliente
    public boolean cadastrar(Cliente cliente);

    // metodo para alterar cliente
    public void alterar(Cliente cliente);

    // metodo para remover cliente
    public void remover(int codigo);

    // metodo para consultar cliente
    public Cliente consultar(int codigo) throws Exception;

    // metodo para exibir os dados de 1 cliente
    public void exibeCliente(Cliente cliente);

    // metodo para listar(exibir os dados de todos) clientes
    public void listar();
}
