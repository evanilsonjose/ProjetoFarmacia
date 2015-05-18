package br.com.farmacia.repository;

import br.com.farmacia.beans.Equipamento;

public interface EquipamentoRep {

    // metodo para cadastrar equipamento
    public boolean cadastrar(Equipamento equipamento);

    // metodo para alterar equipamento
    public void alterar(Equipamento equipamento);

    // metodo para remover equipamento
    public void remover(int codigo);

    // metodo para consultar equipamento
    public Equipamento consultar(int codigo) throws Exception;

    // metodo para exibir os dados de 1 equipamento
    public void exibeEquipamento(Equipamento equipamento);

    // metodo para listar(exibir os dados de todos) equipamentos
    public void listar();
}
