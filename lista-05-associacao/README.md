# 🔗 Lista 05 — Associação, Agregação e Composição

Exercícios práticos de modelagem de relacionamentos entre objetos em Java (POOV).

## 📂 Exercícios
* **`ex01_lotacao_academica`:** Associação Unidirecional (`Professor` -> `Aluno`).
* **`ex02_auditoria_mec`:** Associação Bidirecional (`Professor` <-> `Aluno`) com sincronização de referências.
* **`ex03_catalogo_editora:`** Associação / Agregação Unidirecional (Autor -> Livro) com menu interativo e busca por CPF/ISBN.
* **`ex04_nota_fiscal`:** Composição Estrita (`NotaFiscal`, `EnderecoFaturamento` e `ItemNotaFiscal`) com cópia defensiva.

---

## 🧠 Resumo: Agregação vs. Composição no Código

| Critério | Agregação | Composição |
| :--- | :--- | :--- |
| **Onde fica o `new` da Parte?** | Fora (no `App` ou outra classe) | Exclusivamente dentro do Todo |
| **Parâmetro no Construtor/Método** | Recebe o **objeto pronto** | Recebe **dados primitivos** |
| **Getter da Parte** | Retorna a referência direta | Retorna **cópia defensiva** (clone) ou não existe |
| **Setter da Parte** | Permitido | Proibido |
| **Se o Todo morrer** | A Parte continua existindo | A Parte morre junto |

### Exemplo Prático (`NotaFiscal`)

```java
// COMPOSIÇÃO (NotaFiscal cria o endereço internamente)
public NotaFiscal(int numero, String cliente, String rua, int numeroCasa, String cidade) {
    this.endereco = new EnderecoFaturamento(rua, numeroCasa, cidade);
}

// AGREGAÇÃO (NotaFiscal recebe o endereço já pronto de fora)
public NotaFiscal(int numero, String cliente, EnderecoFaturamento endereco) {
    this.endereco = endereco;
}