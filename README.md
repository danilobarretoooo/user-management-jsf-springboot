# User Management Application

## Descrição
Este projeto é uma aplicação monolítica para gerenciar usuários, desenvolvida como parte de um teste técnico. A aplicação utiliza:
- **JSF** com **PrimeFaces** para a interface do usuário.
- **Spring Boot** para o backend.
- **JPA** com **PostgreSQL** para persistência de dados.

## Tecnologias
- Java 17
- Spring Boot 3.x
- JSF 2.x
- PrimeFaces 10.x
- PostgreSQL 14
- Maven

## Funcionalidades
1. Listar usuários em uma tabela na interface JSF.
2. Adicionar novos usuários através de um formulário.
3. Endpoints REST:
   - `GET /api/users` para listar usuários.
   - `POST /api/users` para adicionar um novo usuário.
   - `PUT /api/users` para atualziar um usuário ja cadastrado.
   - `DELETE /api/users` para excluir um usuário

## Como Executar

### Pré-requisitos
- JDK 17 ou superior.
- Maven instalado.
- PostgreSQL configurado com um banco de dados chamado `user_management`.

### Configuração
1. Clone o repositório:
   ```bash
   git clone <URL do repositório>
   cd user-management-jsf-springboot
