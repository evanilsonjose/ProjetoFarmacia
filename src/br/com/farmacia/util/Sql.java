package br.com.farmacia.util;

public class Sql {

    // inicio - query cliente
    public static final String INSERE_CLIENTE = "INSERT INTO cliente (nome_cliente, rg_cliente, cpf_cliente, datanasc_cliente, endereco_cliente, telefone_cliente) VALUES (?,?,?,?,?,?)";
    public static final String REMOVE_CLIENTE = "DELETE FROM cliente WHERE cod_cliente = ?";
    public static final String ALTERAR_CLIENTE = "UPDATE cliente SET nome_cliente = ?, rg_cliente = ?, cpf_cliente = ?, datanasc_cliente = ?, endereco_cliente = ?, telefone_cliente = ?";
    public static final String BUSCAR_CLIENTE_CODIGO = "SELECT cod_cliente, nome_cliente, rg_cliente, cpf_cliente, datanasc_cliente, endereco_cliente, telefone_cliente FROM cliente WHERE cod_cliente = ?";
    public static final String BUSCAR_CLIENTE_CPF = "SELECT cod_cliente, nome_cliente, rg_cliente, cpf_cliente, datanasc_cliente, endereco_cliente, telefone_cliente FROM cliente WHERE cpf_cliente = ?";
    public static final String LISTAR_CLIENTE = "SELECT cod_cliente, nome_cliente, rg_cliente, cpf_cliente, datanasc_cliente, endereco_cliente, telefone_cliente FROM cliente ORDER BY nome_cliente ASC";
    // fim - query cliente

    // inicio - query funcionario
    public static final String INSERE_FUNCIONARIO = "INSERT INTO funcionario (nome_funcionario, rg_funcionario, cpf_funcionario, datanasc_funcionario, endereco_funcionario, telefone_funcionario, funcao_funcionario, salario_funcionario) VALUES (?,?,?,?,?,?,?,?)";
    public static final String REMOVE_FUNCIONARIO = "DELETE FROM funcionario WHERE cod_funcionario = ?";
    public static final String ALTERAR_FUNCIONARIO = "UPDATE funcionario SET nome_funcionario = ?, rg_funcionario = ?, cpf_funcionario = ?, datanasc_funcionario = ?, endereco_funcionario = ?, telefone_funcionario = ?, funcao_funcionario = ?, salario_funcionario = ?";
    public static final String BUSCAR_FUNCIONARIO_CODIGO = "SELECT cod_funcionario, nome_funcionario, rg_funcionario, cpf_funcionario, datanasc_funcionario, endereco_funcionario, telefone_funcionario, funcao_funcionario, salario_funcionario FROM funcionario WHERE cod_funcionario = ?";
    public static final String BUSCAR_FUNCIONARIO_CPF = "SELECT cod_funcionario, nome_funcionario, rg_funcionario, cpf_funcionario, datanasc_funcionario, endereco_funcionario, telefone_funcionario, funcao_funcionario, salario_funcionario FROM funcionario WHERE cpf_funcionario = ?";
    public static final String LISTAR_FUNCIONARIO = "SELECT cod_funcionario, nome_funcionario, rg_funcionario, cpf_funcionario, datanasc_funcionario, endereco_funcionario, telefone_funcionario, funcao_funcionario, salario_funcionario FROM funcionario";
    // fim - query funcionario

    // inicio - query fornecedor
    public static final String INSERE_FORNECEDOR = "INSERT INTO fornecedor (nome_fornecedor, cnpj_fornecedor, endereco_fornecedor, telefone_fornecedor) VALUES (?,?,?,?)";
    public static final String REMOVE_FORNECEDOR = "DELETE FROM fornecedor WHERE cod_fornecedor = ?";
    public static final String ALTERAR_FORNECEDOR = "UPDATE fornecedor SET nome_fornecedor = ?, cnpj_fornecedor = ?, endereco_fornecedor = ?, telefone_fornecedor = ?";
    public static final String BUSCAR_FORNECEDOR_CODIGO = "SELECT cod_fornecedor, nome_fornecedor , cnpj_fornecedor, endereco_fornecedor , telefone_fornecedor FROM fornecedor WHERE cod_fornecedor = ?";
    public static final String BUSCAR_FORNECEDOR_CNPJ = "SELECT cod_fornecedor, nome_fornecedor , cnpj_fornecedor, endereco_fornecedor , telefone_fornecedor FROM fornecedor WHERE cnpj_fornecedor = ?";
    public static final String LISTAR_FORNECEDOR = "SELECT cod_fornecedor, nome_fornecedor, cnpj_fornecedor, endereco_fornecedor , telefone_fornecedor FROM fornecedor";
    // fim - query fornecedor

    // inicio - query Medicamento
    public static final String INSERE_MEDICAMENTO = "INSERT INTO medicamento (nome_medicamento, preco_custo_medicamento, preco_venda_medicamento, qtd_estoque_medicamento, cod_fornecedor, generico_medicamento, prescricao_medicamento, categoria_medicamento) VALUES (?,?,?,?,?,?,?,?)";
    public static final String REMOVE_MEDICAMENTO = "DELETE FROM medicamento WHERE cod_medicamento = ?";
    public static final String ALTERAR_MEDICAMENTO = "UPDATE medicamento SET nome_medicamento = ?, preco_custo_medicamento = ?, preco_venda_medicamento = ?, qtd_estoque_medicamento = ?, cod_fornecedor = ?, generico_medicamento = ?, prescricao_medicamento = ?, categoria_medicamento = ?";
    public static final String BUSCAR_MEDICAMENTO_CODIGO = "SELECT nome_medicamento, preco_custo_medicamento, preco_venda_medicamento, qtd_estoque_medicamento, fornecedor.cod_fornecedor, nome_fornecedor, generico_medicamento, prescricao_medicamento, categoria_medicamento FROM medicamento, fornecedor WHERE medicamento.cod_fornecedor = fornecedor.cod_fornecedor AND cod_medicamento = ?";
    public static final String LISTAR_MEDICAMENTO = "SELECT nome_medicamento, preco_custo_medicamento, preco_venda_medicamento, qtd_estoque_medicamento, fornecedor.cod_fornecedor, nome_fornecedor, generico_medicamento, prescricao_medicamento, categoria_medicamento FROM medicamento, fornecedor WHERE medicamento.cod_fornecedor = fornecedor.cod_fornecedor";
    // fim - query Medicamento

    // inicio - query Equipamento
    public static final String INSERE_EQUIPAMENTO = "INSERT INTO equipamento (nome_equipamento, preco_venda_equipamento, preco_custo_equipamento, qtd_estoque_equipamento, cod_fornecedor, modo_operacao_equipamento) VALUES (?,?,?,?,?,?)";
    public static final String REMOVE_EQUIPAMENTO = "DELETE FROM equipamento WHERE cod_equipamento = ?";
    public static final String ALTERAR_EQUIPAMENTO = "UPDATE equipamento SET nome_equipamento = ?, preco_venda_equipamento = ?, preco_custo_equipamento = ?, qtd_estoque_equipamento = ?, cod_fornecedor = ?, modo_operacao_equipamento = ?";
    public static final String BUSCAR_EQUIPAMENTO_CODIGO = "SELECT cod_equipamento, nome_equipamento, preco_venda_equipamento, preco_custo_equipamento, qtd_estoque_equipamento, fornecedor.cod_fornecedor, nome_fornecedor, modo_operacao_equipamento FROM equipamento, fornecedor WHERE equipamento.cod_fornecedor = fornecedor.cod_fornecedor AND cod_equipamento = ?";
    public static final String LISTAR_EQUIPAMENTO = "SELECT cod_equipamento, nome_equipamento, preco_venda_equipamento, preco_custo_equipamento, qtd_estoque_equipamento, fornecedor.cod_fornecedor, nome_fornecedor, modo_operacao_equipamento FROM equipamento, fornecedor WHERE equipamento.cod_fornecedor = fornecedor.cod_fornecedor";
    // fim - query Equipamento

}
