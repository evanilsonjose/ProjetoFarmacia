package br.com.farmacia.repository;

import br.com.farmacia.beans.Cliente;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClienteRepository implements ClienteRep {

    // instancia a lista de clientes
    List<Cliente> clientes = new ArrayList<>();

    // metodo para cadastrar cliente
    @Override
    public boolean cadastrar(Cliente cliente) {
        if (clientes.contains(cliente)) {
            System.out.println("O Cliente já existe!");
            return false;
        } else {
            clientes.add(cliente);
            System.out.println("Cliente cadastrado com sucesso");
            return true;
        }
    }

    // metodo para alterar cliente
    @Override
    public void alterar(Cliente cliente) {
        for (Cliente clienteCadastrado : clientes) {
            if (clienteCadastrado.getCodigo() == cliente.getCodigo()) {
                clienteCadastrado.setNome(cliente.getNome());
                clienteCadastrado.setRG(cliente.getRG());
                clienteCadastrado.setCPF(cliente.getCPF());
                clienteCadastrado.setDataNasc(cliente.getDataNasc());
                clienteCadastrado.setEndereco(cliente.getEndereco());
                clienteCadastrado.setTelefone(cliente.getTelefone());
            }
        }
        System.out.println("Cliente atualizado com sucesso!");
    }

    // metodo para remover cliente
    @Override
    public void remover(int codigo) {
        String msg = "Cliente não encontrado(a)!\n";
        for (Iterator<Cliente> iteratorCliente = clientes.iterator(); iteratorCliente.hasNext();) {
            Cliente clienteNext = iteratorCliente.next();
            if (clienteNext.getCodigo() == codigo) {
                iteratorCliente.remove();
                msg = "Cliente removido(a) com sucesso!\n";
            }
        }
        System.out.println(msg);
    }

    // metodo para consultar cliente
    @Override
    public Cliente consultar(int codigo) throws Exception {
        for (Cliente cliente : clientes) {
            if (cliente.getCodigo() == codigo) {
                return cliente;
            }
        }
        throw new Exception("Não existe cliente com o código informado!\n");
    }

    // metodo para exibir os dados de 1 cliente
    @Override
    public void exibeCliente(Cliente cliente) {
        System.out.println("Nome: " + cliente.getNome() + ", RG: " + cliente.getRG()
                + ", CPF: " + cliente.getCPF() + ", Data de Nasc.:" + cliente.getDataNasc() + ", \nEndereço: " + cliente.getEndereco()
                + ", Telefone: " + cliente.getTelefone() + "\n");
    }

    // metodo para listar(exibir os dados de todos) clientes
    @Override
    public void listar() {
        for (Cliente cliente : clientes) {
            System.out.println("Código: " + cliente.getCodigo() + ", Nome: " + cliente.getNome() + ", RG: " + cliente.getRG()
                    + ", CPF: " + cliente.getCPF() + ", Data de Nasc.:" + cliente.getDataNasc() + ", \nEndereço: " + cliente.getEndereco()
                    + ", Telefone: " + cliente.getTelefone() + "\n");
        }
    }

}
