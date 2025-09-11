# API Controle de Vagas de Estacionamento  

Este projeto é uma **API REST** desenvolvida em **Spring Boot** para gerenciar o controle de vagas em estacionamentos.  
Atualmente, o sistema está em **fase inicial** e novas funcionalidades ainda estão sendo implementadas.  

## Tecnologias Utilizadas  
- **Java 17**  
- **Spring Boot 3.5.5**  
- **Spring Data JPA**  
- **MySQL** (banco de dados principal)  
- **H2 Database** (para testes)  
- **Lombok**  
- **Springdoc OpenAPI (Swagger UI)**  

## Estrutura Inicial do Projeto  
- `entity/User.java` → Entidade que representa os usuários do sistema.  
- `repository/UserRepository.java` → Repositório JPA para persistência de usuários.  
- `service/UserService.java` → Regras de negócio relacionadas ao usuário. 
- `controller/UserController.java` → Endpoints para cadastro e consulta de usuários.
- `config/SpringTimezoneConfig.java` → Configuração do timezone da aplicação.  

## Funcionalidades já implementadas  
    Cadastro de usuários (`POST /api/v1/usuarios`)  
    Busca de usuário por ID (`GET /api/v1/usuarios/{id}`)
    Configuração inicial de banco de dados (MySQL e H2)  
    Documentação da API com Swagger (http://localhost:8080/swagger-ui.html)

##  Funcionalidades em desenvolvimento  
    Controle e registro de vagas de estacionamento  
     Autenticação e autorização de usuários (roles ADMIN e CLIENT)  
     Histórico de entradas e saídas de veículos  
     Relatórios gerenciais  
     Melhorias na API e novos endpoints  

## Como executar o projeto  
1. Clone este repositório:  
   ```bash
   git clone https://github.com/seu-usuario/api-controle-vagas-estacionamento.git
   ```
2. Acesse a pasta do projeto:  
   ```bash
   cd api-controle-vagas-estacionamento
   ```
3. Configure o banco de dados MySQL no arquivo `application.properties`.  
4. Execute o projeto com Maven ou sua IDE:  
   ```bash
   mvn spring-boot:run
   ```
5. Acesse o Swagger para explorar os endpoints:  
   ```
   http://localhost:8080/swagger-ui.html
   ```

##  Status do Projeto  
 **Em andamento** – este projeto ainda receberá novas implementações e melhorias.  
