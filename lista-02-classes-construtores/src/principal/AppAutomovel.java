package principal;
import modelo.Automovel;

//e suponha que a função main do seu programa contenha a seguinte declaração e que o programa fixe
//de algum modo os valores de todos os atributos com alguns valores:

public class AppAutomovel {
    public static void main(String[] args) throws Exception {
        Automovel hyundai = new Automovel();
        Automovel jaguar = new Automovel();

        //Quais dos seguintes comandos são, então, permitidos na função main do seu programa? Explique cada um.

        //hyundai.preco = 4999.99; -> Não são permitidos, uma vez que os atributos estão privados.
        jaguar.setPreco (30000.97); //-> Permitido
        hyundai.setPreco(50000); //-> Permitido
        //double umPreco, umRendimento; -> estaria apenas criando duas variaveis double
        //umPreco = jaguar.getPreco(); //-> permitido
        //umPreco = jaguar.getRendimento(); -> Não é permitido, o exercicio gerou o metodo como privado.
        //umRendimento = hyundai.getRendimento(); -> Não é permitido, o exercicio gerou o metodo como privado.
        //hyundai = jaguar; //-> Permitido.


        //Comentado por ser exercicio teorico.
    }
} 