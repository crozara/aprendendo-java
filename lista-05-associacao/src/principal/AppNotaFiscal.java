package principal;

import java.math.BigDecimal;

import modelo.ex04_nota_fiscal.EnderecoFaturamento;
import modelo.ex04_nota_fiscal.NotaFiscal;

public class AppNotaFiscal {
    public static void main(String[] args) {
        NotaFiscal nota = new NotaFiscal(1001, "Kauê Crozara", "Av. Leopoldino de Oliveira", 5000, "Uberaba");

        nota.adicionarItem("Teclado Mecânico", 1, new BigDecimal("350.00"));
        nota.adicionarItem("Mouse Sem Fio", 2, new BigDecimal("120.50"));
        nota.adicionarItem("Mousepad XL", 1, new BigDecimal("79.90"));

        System.out.println(">>> EMISSÃO ORIGINAL:");
        nota.emitirNota();

        // Teste de invasão: tenta corromper o endereço retornado pelo get
        EnderecoFaturamento copia = nota.getEnderecoFaturamento();
        copia.setCidade("CIDADE HACKEADA");

        System.out.println(">>> Cópia alterada fora da nota: " + copia + "\n");

        // Se a cópia defensiva funcionou, a nota continua mostrando "Uberaba"
        System.out.println(">>> EMISSÃO APÓS TENTATIVA DE INVASÃO:");
        nota.emitirNota();
    }
}


/*
Enunciado:
"Estamos substituindo o nosso faturador antigo e precisamos modelar o núcleo de emissão de Notas Fiscais. No nosso domínio, uma NotaFiscal (identificada por um número e pelo nome do cliente) é dona exclusiva de dois componentes internos que não fazem sentido existirem sozinhos fora dela:
    Endereço de Faturamento (EnderecoFaturamento): Contém rua, número e cidade. Diferente de um cadastro geral de endereços, este registro nasce exclusivamente para aquela nota e morre com ela. Para fins de testes de auditoria, os atributos deste endereço possuem métodos set (são mutáveis).
    Itens da Nota (ItemNotaFiscal): Cada linha de faturamento guarda a descrição do produto, a quantidade e o valor unitário (BigDecimal), sendo capaz de calcular o próprio subtotal (quantidade * valorUnitario).

Diretrizes Arquiteturais Obrigatórias (Composição Estrita)

    O new pertence exclusivamente ao Todo: A classe App está terminantemente proibida de instanciar EnderecoFaturamento ou ItemNotaFiscal.

        Cardinalidade 1: O construtor da NotaFiscal deve receber apenas os dados básicos (número, cliente, rua, número da casa e cidade) e instanciar o EnderecoFaturamento internamente.

        Cardinalidade N: A lista de itens nasce vazia dentro da NotaFiscal. Novos itens só entram por um método próprio (ex: adicionarItem(String descricao, int quantidade, BigDecimal valorUnitario)), onde a própria nota faz o new ItemNotaFiscal(...) e guarda na lista.

    Cópia Defensiva (Zero Vazamento): O sistema de logística precisa consultar o endereço de faturamento através de um método getEnderecoFaturamento(). Porém, a NotaFiscal nunca pode devolver a referência original — ela deve instanciar e retornar uma cópia exata (clone). A lista de itens também não deve ter get expondo a coleção original.

    Relatório: A NotaFiscal deve possuir um método para calcular o valor total da nota e um método emitirNota() que imprime os dados do cliente, o endereço de faturamento, todos os itens com seus subtotais e o total geral.

Validação Exigida no App (A Prova de Fogo)

    Crie uma NotaFiscal e adicione pelo menos 3 itens usando o método da própria nota.

    Emita a nota no terminal.

    Teste de invasão: Recupere o endereço usando EnderecoFaturamento copia = nota.getEnderecoFaturamento(); e tente corrompê-lo chamando copia.setCidade("CIDADE HACKEADA");.

    Emita a nota novamente no terminal para provar que a alteração afetou apenas a cópia e que o endereço original dentro da NotaFiscal permaneceu intacto."

*/