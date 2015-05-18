package br.com.farmacia.teste;

import br.com.farmacia.beans.Equipamento;
import br.com.farmacia.beans.Fornecedor;
import br.com.farmacia.dao.EquipamentoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MainSueliton {

    public static void main(String[] args) {
        
        EquipamentoDAO funcaoEquipamento = new EquipamentoDAO();
        //Equipamento equipamento = new Equipamento();
        List<Equipamento> equipamentos = new ArrayList<>();
        
        try {
            funcaoEquipamento.removeEquipamento(3);    
            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}