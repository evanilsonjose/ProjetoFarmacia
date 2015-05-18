package br.com.farmacia.repository;

import br.com.farmacia.beans.Medicamento;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MedicamentoRepository implements MedicamentoRep{

    // instancia a lista de medicamentos
    List<Medicamento> medicamentos = new ArrayList<>();

    // metodo para cadastrar medicamento
    @Override
    public boolean cadastrar(Medicamento medicamento) {
        if (medicamentos.contains(medicamento)) {
            System.out.println("O Medivamento já existe!");
            return false;
        } else {
            medicamentos.add(medicamento);
            System.out.println("Medicamento cadastrado com sucesso");
            return true;
        }
    }

    // metodo para alterar medicamento
    @Override
    public void alterar(Medicamento medicamento) {
        for (Medicamento medicamentoCadastrado : medicamentos) {
            if (medicamentoCadastrado.getCodigo() == medicamento.getCodigo()) {
                medicamentoCadastrado.setNome(medicamento.getNome());
                medicamentoCadastrado.setPrecoCusto(medicamento.getPrecoCusto());
                medicamentoCadastrado.setPrecoVenda(medicamento.getPrecoVenda());
                medicamentoCadastrado.setQtdEstoque(medicamento.getQtdEstoque());
                medicamentoCadastrado.setFornecedor(medicamento.getFornecedor());
                medicamentoCadastrado.setGenerico(medicamento.getGenerico());
                medicamentoCadastrado.setPrescricaoMedica(medicamento.getPrescricaoMedica());
                medicamentoCadastrado.setCategoria(medicamento.getCategoria());
            }
        }
        System.out.println("Medicamento atualizado com sucesso!");
    }

    // metodo para remover medicamento
    @Override
    public void remover(int codigo) {
        String msg = "Medicamento não encontrado(a)!\n";
        for (Iterator<Medicamento> iteratorMedicamento = medicamentos.iterator(); iteratorMedicamento.hasNext();) {
            Medicamento medicamentoNext = iteratorMedicamento.next();
            if (medicamentoNext.getCodigo() == codigo) {
                iteratorMedicamento.remove();
                msg = "Medicamento removido(a) com sucesso!\n";
            }
        }
        System.out.println(msg);
    }

    // metodo para consultar medicamento
    @Override
    public Medicamento consultar(int codigo) throws Exception {
        for (Medicamento medicamento : medicamentos) {
            if (medicamento.getCodigo() == codigo) {
                return medicamento;
            }
        }
        throw new Exception("Não existe o medicamento com o código informado!\n");
    }

    // metodo para exibir os dados de 1 medicamento
    @Override
    public void exibeMedicamento(Medicamento medicamento) {
        System.out.println("Nome: " + medicamento.getNome() + ", Preço de Custo: R$ " + medicamento.getPrecoCusto()
                + ", Preço de Venda: R$ " + medicamento.getPrecoVenda() + ", Quantidade em Estoque: " + medicamento.getQtdEstoque()
                + ", \nFornecedor: " + medicamento.getFornecedor().getNome() + ", É genérico? " + medicamento.getGenerico()
                + ", Precisa de prescrição? " + medicamento.getPrescricaoMedica() + ", Categoria: " + medicamento.getCategoria() + "\n");
    }

    // metodo para listar(exibir os dados de todos) medicamentos
    @Override
    public void listar() {
        for (Medicamento medicamento : medicamentos) {
            System.out.println("Código: " + medicamento.getCodigo() + ", Nome: " + medicamento.getNome() + ", Preco de Custo: " + medicamento.getPrecoCusto()
                    + ", Preco de Venda: " + medicamento.getPrecoVenda() + ", Fornecedor:" + medicamento.getFornecedor().getNome() + ", \nGenerico: " + medicamento.getGenerico()
                    + " Prescricao? " + medicamento.getPrescricaoMedica() + "Categoria: " + medicamento.getCategoria() + "\n");
        }
    }

}
