package br.com.farmacia.repository;

import br.com.farmacia.beans.Equipamento;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EquipamentoRepository implements EquipamentoRep {

    // instancia a lista de equipamentos
    List<Equipamento> equipamentos = new ArrayList<>();

    // metodo para cadastrar equipamento
    @Override
    public boolean cadastrar(Equipamento equipamento) {
        if (equipamentos.contains(equipamento)) {
            System.out.println("O Equipamento já existe!");
            return false;
        } else {
            equipamentos.add(equipamento);
            System.out.println("Equipamento cadastrado com sucesso");
            return true;
        }
    }

    // metodo para alterar equipamento
    @Override
    public void alterar(Equipamento equipamento) {
        for (Equipamento equipamentoCadastrado : equipamentos) {
            if (equipamentoCadastrado.getCodigo() == equipamento.getCodigo()) {
                equipamentoCadastrado.setNome(equipamento.getNome());
                equipamentoCadastrado.setPrecoCusto(equipamento.getPrecoCusto());
                equipamentoCadastrado.setPrecoVenda(equipamento.getPrecoVenda());
                equipamentoCadastrado.setQtdEstoque(equipamento.getQtdEstoque());
                equipamentoCadastrado.setFornecedor(equipamento.getFornecedor());
                equipamentoCadastrado.setModoOperacao(equipamento.getModoOperacao());
            }
        }
        System.out.println("Equipamento atualizado com sucesso!");
    }

    // metodo para remover equipamento
    @Override
    public void remover(int codigo) {
        String msg = "Equipamento não encontrada!\n";
        for (Iterator<Equipamento> iteratorEquipamento = equipamentos.iterator(); iteratorEquipamento.hasNext();) {
            Equipamento equipamentoNext = iteratorEquipamento.next();
            if (equipamentoNext.getCodigo() == codigo) {
                iteratorEquipamento.remove();
                msg = "Equipamento removido com sucesso!\n";
            }
        }
        System.out.println(msg);
    }

    // metodo para consultar equipamento
    @Override
    public Equipamento consultar(int codigo) throws Exception {
        for (Equipamento equipamento : equipamentos) {
            if (equipamento.getCodigo() == codigo) {
                return equipamento;
            }
        }
        throw new Exception("Não existe Equipamento com o codigo informado!\n");
    }

    // metodo para exibir os dados de 1 equipamento
    @Override
    public void exibeEquipamento(Equipamento equipamento) {
        System.out.println("Nome: " + equipamento.getNome() + ", Preço de Custo: R$ " + equipamento.getPrecoCusto()
                + ", Preço de Venda: R$ " + equipamento.getPrecoVenda() + ", Quantidade em Estoque: " + equipamento.getQtdEstoque()
                + ", \n: Fornecedor: " + equipamento.getFornecedor().getNome() + ", Modo de Operação: " + equipamento.getModoOperacao() + "\n");
    }

    // metodo para listar(exibir os dados de todos) equipamentos
    @Override
    public void listar() {
        for (Equipamento equipamento : equipamentos) {
            System.out.println("Código: " + equipamento.getCodigo() + ", Nome: " + equipamento.getNome()
                    + ", Preço de custo : " + equipamento.getPrecoCusto() + ", Preço de Venda : " + equipamento.getPrecoVenda()
                    + ", Fornecedor : " + equipamento.getFornecedor().getNome() + ", Modo Operação : " + equipamento.getModoOperacao());
        }
    }

}
