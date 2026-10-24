# Atividade Inicial

Primeira API com Spring Boot: endpoints de boas-vindas

Atividade de **Desenvolvimento de Sistemas Corporativos** (DSC) — IFRN.

## Stack

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white) ![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)

## Como rodar

```bash
./mvnw spring-boot:run
```

A API sobe em `http://localhost:8080`.

## Endpoints

| Rota | Resposta |
|---|---|
| `GET /welcome` | `Bem-vindo!` |
| `GET /welcome-aluno` | `Bem-vindo, [nome]!` |

Os dois ficam em `src/main/java/com/atividades/inicial/WelcomeController.java`.
