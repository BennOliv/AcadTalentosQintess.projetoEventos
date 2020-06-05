INSERT INTO cargo(nome) VALUES('Administrador');
INSERT INTO cargo(nome) VALUES('Cliente');

INSERT INTO usuario(nome, email, senha, cpf, data_nascimento, logradouro, numero, cidade, estado, cargo_id) VALUES('admin', 'admin@admin', 'admin', 10000000000, TO_DATE('1234-01-01', 'yyyy-MM-dd'), 'Rua dos Adm', '1A', 'Santos', 'São Paulo', '1');
INSERT INTO usuario(nome, email, senha, cpf, data_nascimento, logradouro, numero, cidade, estado, cargo_id) VALUES('cli1', 'cli1@cli1.com', 'cli1', 10000000001, TO_DATE('2000-01-01', 'yyyy-MM-dd'), 'Rua dos Cli', '1A', 'Pirassununga', 'São Paulo', '2');

INSERT INTO casa_de_show(nome, capacidade_comum, capacidade_vip, logradouro, numero, cidade, estado) VALUES('Salão do Cleyto', 100, 10, 'Rua do Cleyto', '420', 'Goiânia', 'Goiás');
INSERT INTO casa_de_show(nome, capacidade_comum, capacidade_vip, logradouro, numero, cidade, estado) VALUES('Expo Exposto', 2000000, 4200, 'Avenida dos carro', '600', 'São Paulo', 'São Paulo');
INSERT INTO casa_de_show(nome, capacidade_comum, capacidade_vip, logradouro, numero, cidade, estado) VALUES('Laje do Matias', 500, 0, 'Quebrada onde eu moro', '150', 'Rio de Janeiro', 'Rio de Janeiro');

INSERT INTO genero(nome, classificacao_etaria) VALUES('Religioso', 3);
INSERT INTO genero(nome, classificacao_etaria) VALUES('Música Popular Brasileira', 10);
INSERT INTO genero(nome, classificacao_etaria) VALUES('Luta',18);

INSERT INTO evento(nome, descricao, data, hr_abertura, hr_encerramento, id_genero, id_casa_show) VALUES('Bailão das 10', 'Sem regras, sem horas', TO_DATE('2020-06-06','yyyy-MM-dd'), '22:00:59', '23:59:59', 2,3);
INSERT INTO ingresso(tipo, preco, quantidade_disponivel, id_evento) VALUES('COMUM', 10, 500, 1);

INSERT INTO venda(id_usuario, data_hora_venda, valor_total) VALUES(2, PARSEDATETIME('2020-06-05 17:01:01','yyyy-MM-dd HH:mm:ss'), 20);

INSERT INTO item_venda(quantidade, valor, ingresso_id, venda_id) VALUES(2, 10, 1, 1);

INSERT INTO ingresso_gerado(venda_item_ingresso_id, venda_item_venda_id) VALUES(1, 1);
INSERT INTO ingresso_gerado(venda_item_ingresso_id, venda_item_venda_id) VALUES(1, 1);