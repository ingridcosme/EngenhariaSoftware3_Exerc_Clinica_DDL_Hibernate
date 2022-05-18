# Exercício pertencente à disciplina de Engenharia de Software III

### Exercício de Projeto Java com Hibernate - DDL

Fazer a Modelagem ER, aplicando conceitos do Modelo de Dados Relacional, como o Tipo de Dados e Normalização. Criar um projeto Java com Hibernate fazendo o Mapeamento Objeto Relacional das Entidades aplicando no SGBD:

Pretende‐se criar uma base de dados que permita gerir uma parte da informação de uma clinica de saúde. Fundamentalmente a base de dados deverá guardar a informação relativa aos doentes que frequentam a clínica (nome, endereço [1], telefone e número de beneficiário) e dos médicos que lá trabalham (código, nome, endereço [1], contato e especialidade). Para além disso o sistema deverá registrar as marcações de consultas de cada paciente para um determinado médico, num dia e hora específicos. No entanto, na clinica um paciente pode obviamente consultar diferentes médicos para a mesma ou para diferentes especialidades. O sistema deverá ainda para cada paciente e por especialidade permitir organizar uma ficha de informações que é atualizada sempre que um médico da especialidade observa esse paciente. 

[1] O Endereço é um atributo composto, com logradouro, número de porta, CEP e complemento