# 🍔 Sistema de Vendas para Lanchonete

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Conclu%C3%ADdo-brightgreen?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)

Um sistema simples, prático e eficiente desenvolvido em Java (Console) para registro de pedidos, validação de entradas de valores e geração de relatórios de vendas em tempo real.

---

## 📌 Sumário

- [Visão Geral](#-visão-geral)
- [Funcionalidades](#-funcionalidades)
- [Tecnologias Utilizadas](#-tecnologias-utilizadas)
- [Como Executar](#-como-executar)
  - [Pré-requisitos](#pré-requisitos)
  - [Clonando e Executando](#clonando-e-executando)
- [Exemplo de Uso](#-exemplo-de-uso)
- [Estrutura do Projeto](#-estrutura-do-projeto)
- [Licença](#-licença)

---

## 🔎 Visão Geral

O **Sistema de Lanchonete** foi desenvolvido para automatizar a contagem e análise financeira de vendas diárias. O programa permite registrar múltiplos pedidos em sequência, trata inconsistências na digitação do usuário (como o uso de vírgulas ou pontos em valores decimais) e gera métricas consolidadas ao encerrar o expediente.

---

## ✨ Funcionalidades

- 📝 **Registro Contínuo de Pedidos:** Entrada do nome do cliente e valor total da compra.
- 🔀 **Tratamento de Pontuação Decimal:** Converte automaticamente entradas com vírgula (`35,50`) para o padrão decimal em Java (`35.50`).
- 🛡️ **Validação de Erros:** Impede a digitação de textos em campos numéricos ou valores menores/iguais a zero.
- 📊 **Relatório Estatístico Completo:**
  - Quantidade total de pedidos processados.
  - Faturamento total acumulado (R$).
  - Ticket médio por pedido (R$).
  - Maior e menor valor de compra registrados no dia.

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java (JDK 8 ou superior)
- **API Standard:** `java.util.Scanner`
- **Ferramenta de Controle de Versão:** Git

---

## 🚀 Como Executar

### Pré-requisitos

Certifique-se de ter o **JDK** e o **Git** instalados na sua máquina. Você pode verificar executando no terminal:

```bash
java -version
javac -version
git --version
```

### Clonando e Executando
#### Clone este repositório
```bash
git clone [https://github.com/Leo300609/Sistema-Lanchonete-em-JAVA.git](https://github.com/Leo300609/Sistema-Lanchonete-em-JAVA.git)
```
#### Acesse a pasta do projeto
```bash
cd Sistema-Lanchonete-em-JAVA
```

#### Compile o arquivo Java
```bash
javac SistemaLanchonete.java
```

#### Execute a aplicação
```bash
java SistemaLanchonete
```

## Exemplo de Uso
<img width="684" height="524" alt="image" src="https://github.com/user-attachments/assets/583d6192-09fd-4fad-947e-5c1e22e4b50d" />

## Estrutura do projeto
Sistema-Lanchonete-em-JAVA/
│
├── SistemaLanchonete.java   # Código-fonte principal da aplicação
└── README.md                # Documentação do repositório

## 📄 Licença
Este projeto está sob a licença *MIT*.
