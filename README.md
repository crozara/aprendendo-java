# ☕ Java: Programação Orientada a Objetos e Visual (POOV)

Bem-vindo ao repositório de estudos e práticas de Java! 

Este diretório documenta a minha evolução e os projetos desenvolvidos para a disciplina de **Programação Orientada a Objetos e Visual (POOV)** do curso de **Engenharia de Computação**. O objetivo do repositório é consolidar os fundamentos da linguagem, desde a sintaxe básica até a modelagem de arquiteturas limpas com baixo acoplamento.

## 🗂️ Estrutura do Repositório e Evolução

O repositório está dividido em módulos evolutivos, acompanhando as listas de exercícios e avaliações da faculdade:

* **[Lista 1 e 2] Fundamentos e Encapsulamento:** Criação de classes, métodos, construtores e proteção de estado (Getters/Setters).
* **[Lista 3] Herança:** Especialização de classes, uso do `super`, sobrescrita de métodos (`@Override`) e reaproveitamento de código.
* **[Lista 4] Polimorfismo e Interfaces:** Programação voltada para contratos, baixo acoplamento, coleções dinâmicas e eliminação de estruturas procedurais.
* **[Avaliação 1] Sistema de Despacho de Contêineres (Atlântico Logística):** Projeto arquitetural de avaliação desenvolvido sob limite de tempo. Focado em imutabilidade (`private final`), delegação contábil, injeção de dependências via interfaces e varredura polimórfica (ausência de `instanceof`). 

## 🚀 Principais Conceitos Aplicados ao Longo do Semestre

* **Encapsulamento e Imutabilidade:** Blindagem do estado de fábrica dos objetos.
* **Herança e Delegação:** Classes filhas reaproveitando lógicas e cálculos de superclasses sem recalcular do zero.
* **Polimorfismo Dinâmico:** Coleções heterogêneas (`List<Superclasse>`) executando comportamentos específicos de subclasses em tempo de execução sem uso de `if/else`.
* **Baixo Acoplamento:** Módulos consumidores independentes baseados estritamente em Interfaces.

## 🛠️ Tecnologias e Ferramentas

* **Linguagem:** Java
* **Disciplina:** Programação Orientada a Objetos e Visual (POOV)
* **Conceitos Avançados:** Coleções Dinâmicas (`ArrayList`, `List`), API Moderna de Datas (`LocalDate`), Cálculos Financeiros Seguros (`BigDecimal`).

## ⚙️ Como Executar

Para compilar e executar qualquer arquivo `.java` deste repositório via terminal, navegue até a pasta do arquivo e utilize os comandos nativos do JDK:

1. **Compilar o código:**
   > `javac NomeDoArquivo.java`
   *(Isso gerará um arquivo NomeDoArquivo.class no mesmo diretório)*

2. **Executar o programa:**
   > `java NomeDoArquivo`