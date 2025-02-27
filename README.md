# Sistema de Cadastro de Veículos

Este sistema permite o cadastro, atualização, consulta e exclusão de veículos. Ele foi desenvolvido utilizando o Spring Boot para o back-end, com um banco de dados MySQL para persistência dos dados.

## Funcionalidades

- **Listar veículos**: Exibe todos os veículos cadastrados no sistema.
- **Salvar veículo**: Permite o cadastro de um novo veículo.
- **Consultar veículo**: Consulta um veículo pelo ID.
- **Deletar veículo**: Exclui um veículo pelo ID.
- **Atualizar veículo**: Atualiza os dados de um veículo existente.

## Tecnologias Utilizadas

- **Spring Boot**: Framework utilizado para o desenvolvimento do back-end.
- **MySQL**: Banco de dados utilizado para persistência dos dados.
- **JPA/Hibernate**: Para mapeamento objeto-relacional e interação com o banco de dados.
- **Maven**: Gerenciador de dependências.



IMPORTANTE!!!

- Configure o banco de dados MySQL com as credenciais apropriadas no arquivo application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/veiculos_db
spring.datasource.username=SeuUsuario
spring.datasource.password=SuaSenha
.
.
.
.
.
.
.
Esse `README` cobre as funcionalidades principais do sistema, como as operações com veículos, as tecnologias usadas, e o processo de instalação. Você pode ajustar conforme necessário, incluindo informações adicionais ou personalizando as seções conforme seu gosto.

