# Projeto criando API de cidades com Spring REST

Neste sistema foi desenvolvido uma API de consultas de cidades do Brasil. Para o projeto foram utilizadas as seguintes tecnologias:

- Java
- Spring Boot
- Spring initialzr
- Spring Data JPA e Hibernate
- Lombok
- GIT/GITHUB
- PostgreSQL via docker

E também foram abordados alguns tópicos:

- Consulta de banco de dados com PostgreSQL, rodando em um container docker;
- Utilização de conceitos de Geolocalização.
- Implementação de paginação dos resultados através dos recursos do próprio Spring
- Controle de versão da aplicação através da utilização do Git e armazenado no GITHUB
- Implantação do sistema na nuvem através do Heroku

### Clonando o projeto
`git clone https://github.com/cassioliveira/bootcamp-dio-cities-api-spring-rest.git`

### Para executar o projeto
`mvn spring-boot:run`

### Para consumir a API, basta acessar algum dos seguintes endpoints(após os comandos acima):
- http://localhost:8080/countries
- http://localhost:8080/states
- http://localhost:8080/cities

### Pré-requisitos
- Java 8 ou superior (O projeto foi hospedado no heroku e o padrão dele é a versão 8, mas é possível utilizar versões mais recentes, através de configuração no application.properties)
- Gradle
