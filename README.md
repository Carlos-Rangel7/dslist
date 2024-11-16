# Título do Projeto
DSList API - Gerenciador de Jogos

# Descrição
Uma API RESTful desenvolvida com Spring Boot para gerenciar listas de jogos. O projeto demonstra boas práticas de desenvolvimento,
incluindo uso de JPA, DTOs, transações, manipulação de dados com Stream API e organização baseada em camadas.

# Tecnologias Usadas
java
Spring boot
Spring data JPA
Maven

# Principais Funcionalidades
## Gerenciamento de Jogos:
Criação de novos jogos (POST).
Busca de jogos por ID (GET com @PathVariable).
Atualização de informações dos jogos (PUT ou PATCH).
Listagem de todos os jogos com filtros e mapeamento para DTOs.
## Manipulação de Dados:
Uso de Stream e map para transformar listas de entidades em DTOs.
## Operações Avançadas:
Reordenamento de itens em uma lista com o método move.
Gerenciamento de transações com @Transactional para garantir consistência.
## Modelagem de Dados:
Relacionamentos entre entidades (@ManyToOne, @JoinColumn, @EmbeddedId).
Criação de identificadores compostos usando @Embeddable

# Motivação e Objetivo
Este projeto foi desenvolvido como parte de meu aprendizado em Java e Spring Boot, com o objetivo de praticar:
Criação de APIs RESTful.
Manipulação e persistência de dados.
Boas práticas em projetos back-end.

# Contato
Se você quiser saber mais sobre este projeto ou discutir novas ideias, entre em contato comigo pelo LinkedIn: https://www.linkedin.com/in/carlorangeldev/ ou envie um e-mail para carlos.rangel.dev@gmail.com




