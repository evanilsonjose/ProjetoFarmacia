-- Geração de Modelo físico
-- Sql ANSI 2003 - brModelo.

CREATE TABLE funcionario (
cod_funcionario INT PRIMARY KEY AUTO_INCREMENT,
nome_funcionario VARCHAR(40),
rg_funcionario VARCHAR(7),
cpf_funcionario VARCHAR(11),
datanasc_funcionario DATE,
endereco_funcionario VARCHAR(40),
telefone_funcionario VARCHAR(10),
funcao_funcionario VARCHAR(20),
salario_funcionario DECIMAL(10,2)
);

CREATE TABLE fornecedor (
cod_fornecedor INT PRIMARY KEY AUTO_INCREMENT,
nome_fornecedor VARCHAR(50),
cnpj_fornecedor VARCHAR(14),
endereco_fornecedor VARCHAR(40),
telefone_fornecedor VARCHAR(10)
);

CREATE TABLE medicamento (
cod_medicamento INT PRIMARY KEY AUTO_INCREMENT,
nome_medicamento VARCHAR(40),
preco_custo_medicamento DECIMAL(10,2),
preco_venda_medicamento DECIMAL(10,2),
qtd_estoque_medicamento INT,
cod_fornecedor INT,
generico_medicamento VARCHAR(3),
prescricao_medicamento VARCHAR(3),
categoria_medicamento VARCHAR(10),
FOREIGN KEY(cod_fornecedor) REFERENCES fornecedor (cod_fornecedor)
);

CREATE TABLE cliente (
cod_cliente INT PRIMARY KEY AUTO_INCREMENT,
nome_cliente VARCHAR(40),
rg_cliente VARCHAR(7),
cpf_cliente VARCHAR(11),
datanasc_cliente DATE,
endereco_cliente VARCHAR(40),
telefone_cliente VARCHAR(10)
);

CREATE TABLE venda_medicamento (
cod_venda_med INT PRIMARY KEY AUTO_INCREMENT,
cod_funcionario INT,
notafiscal_venda_med VARCHAR(15),
data_venda_med DATE,
FOREIGN KEY(cod_funcionario) REFERENCES funcionario (cod_funcionario)
);

CREATE TABLE equipamento (
cod_equipamento INT PRIMARY KEY AUTO_INCREMENT,
nome_equipamento VARCHAR(40),
preco_venda_equipamento DECIMAL(10,2),
preco_custo_equipamento DECIMAL(10,2),
qtd_estoque_equipamento INT,
cod_fornecedor INT,
modo_operacao_equipamento VARCHAR(10),
FOREIGN KEY(cod_fornecedor) REFERENCES fornecedor (cod_fornecedor)
);

CREATE TABLE venda_equipamento (
cod_venda_equip INT PRIMARY KEY AUTO_INCREMENT,
cod_funcionario INT,
notafiscal_vend_equip VARCHAR(15),
data_vende_equip DATE,
FOREIGN KEY(cod_funcionario) REFERENCES funcionario (cod_funcionario)
);

CREATE TABLE equipamento_venda (
cod_equipamento INT,
cod_venda_equip INT,
FOREIGN KEY(cod_equipamento) REFERENCES equipamento (cod_equipamento),
FOREIGN KEY(cod_venda_equip) REFERENCES venda_equipamento (cod_venda_equip)
);

CREATE TABLE medicamento_venda (
cod_medicamento INT,
cod_venda_med INT,
FOREIGN KEY(cod_medicamento) REFERENCES medicamento (cod_medicamento),
FOREIGN KEY(cod_venda_med) REFERENCES venda_medicamento (cod_venda_med)
);

CREATE TABLE cliente_venda_med (
cod_cliente INT,
cod_venda_med INT,
FOREIGN KEY(cod_cliente) REFERENCES cliente (cod_cliente),
FOREIGN KEY(cod_venda_med) REFERENCES venda_medicamento (cod_venda_med)
);

CREATE TABLE cliente_vend_equip (
cod_cliente INT,
cod_venda_equip INT,
FOREIGN KEY(cod_cliente) REFERENCES cliente (cod_cliente),
FOREIGN KEY(cod_venda_equip) REFERENCES venda_equipamento (cod_venda_equip)
);
