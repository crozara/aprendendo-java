package modelo;

//7-Escreva uma classe para descrever um mês do ano. A classe deve ser capaz de armazenar o nome do mês, a abreviação em três letras, 
// o número de dias e o número do mês.

public class Mes {
    private String nome;
    private String abrev;
    private int dias;
    private int numero_mes;

    int[] diasDoMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};

    //a) crie um construtor para inicializar os dados com zero e outro para inicializar os dados com um valor fixo (passado como argumento)

    public Mes(){
        this.nome = "";
        this.abrev = "";
        this.dias = 0;
        this.numero_mes = 0;
    }

    public Mes(String nome, String abrev, int dias, int numero_mes){
        this.nome = nome;
        this.abrev = abrev;
        this.dias = dias;
        this.numero_mes = numero_mes;
    }

    //b) escreva um método que receba o número do mês como argumento e retorne o total de dias do ano até aquele mês
    public int totalDias(int numero_mes){
        int qntde = 0;
        for(int i = 1; i <= numero_mes && i < diasDoMes.length; i++){
            qntde += diasDoMes[i];
        }
        return qntde;
    }

    //c) escreva um método sobrecarregado que receba como argumento o nome do mês em vez do número dele e retorne o mesmo total de dias. 
    public int totalDias(String nome){
        int aqui = 0;
        for(int i = 0; i < meses.length; i++){
            if(nome.equalsIgnoreCase(meses[i])){
                aqui = i + 1;
                break;
            }
        }
            
        int qntde = 0;
        for(int j = 1; j <= aqui; j++){
            qntde += diasDoMes[j];
        }
        return qntde;    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAbrev() {
        return abrev;
    }

    public void setAbrev(String abrev) {
        this.abrev = abrev;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getNumero_mes() {
        return numero_mes;
    }

    public void setNumero_mes(int numero_mes) {
        this.numero_mes = numero_mes;
    }

    public int[] getDiasDoMes() {
        return diasDoMes;
    }

    public void setDiasDoMes(int[] diasDoMes) {
        this.diasDoMes = diasDoMes;
    }

    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }
}
