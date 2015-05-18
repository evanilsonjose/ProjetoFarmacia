package br.com.farmacia.repository;

import br.com.farmacia.beans.Medicamento;

public interface MedicamentoRep {

    // metodo para cadastrar medicamento
    public boolean cadastrar(Medicamento medicamento);

    // metodo para alterar medicamento
    public void alterar(Medicamento medicamento);

    // metodo para remover medicamento
    public void remover(int codigo);

    // metodo para consultar medicamento
    public Medicamento consultar(int codigo) throws Exception;

    // metodo para exibir os dados de 1 medicamento
    public void exibeMedicamento(Medicamento medicamento);

    // metodo para listar(exibir os dados de todos) medicamentos
    public void listar();

}
