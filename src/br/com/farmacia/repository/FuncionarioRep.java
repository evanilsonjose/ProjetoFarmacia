package br.com.farmacia.repository;

import br.com.farmacia.beans.Funcionario;

public interface FuncionarioRep {

    // metodo para cadastrar funcionario
    public boolean cadastrar(Funcionario funcionario);

    // metodo para alterar funcionario
    public void alterar(Funcionario funcionario);

    // metodo para remover funcionario
    public void remover(int codigo);

    // metodo para consultar funcionario
    public Funcionario consultar(int codigo) throws Exception;

    // metodo para exibir os dados de 1 funcionario
    public void exibeFuncionario(Funcionario funcionario);

    // metodo para listar(exibir os dados de todos) funcionarios
    public void listar();

}
