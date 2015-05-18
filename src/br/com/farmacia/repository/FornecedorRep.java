package br.com.farmacia.repository;

import br.com.farmacia.beans.Fornecedor;

public interface FornecedorRep {

    // metodo para cadastrar fornecedor
    public boolean cadastrar(Fornecedor fornecedor);

    // metodo para alterar fornecedor
    public void alterar(Fornecedor fornecedor);

    // metodo para remover fornecedor
    public void remover(int codigo);

    // metodo para consultar fornecedor
    public Fornecedor consultar(int codigo) throws Exception;

    // metodo para exibir os dados de 1 fornecedor
    public void exibeFornecedor(Fornecedor fornecedor);

    // metodo para listar(exibir os dados de todos) fornecedores
    public void listar();

}
