package modelo;

//10-Defina uma classe chamada Mes. Sua classe terá um atributo de tipo int para representar um mês (1 para janeiro, 2 para fevereiro, e assim por diante). 
// Inclua todas as seguintes métodos: um construtor para estabelecer o mês utilizando as primeiras três letras do nome do mês como três argumentos, 
// um construtor para estabelecer o mês utilizando um inteiro como argumento (1 para janeiro, 2 para fevereiro, e assim por diante), um construtor padrão, 
// um método para setar o mês como um inteiro, um método para setar o mês com as primeiras três letras do nome do mês, um método que retorne o mês como um 
// inteiro e um método que retorne o mês seguinte como um valor do tipo Mes. Insira sua definição de classe em um programa teste.

public class MesEx10 {
    private int mes;
    
    String[] mesesTexto = {"", "janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};

    public MesEx10(){
        this.mes = 1;
    }

    public MesEx10(int mes){
        setMes(mes);
    }

    public MesEx10(String abrev){
        setMes(abrev);;
    }

    public MesEx10(String l1, String l2, String l3) {
        String abreviação = l1 + l2 + l3;
        setMes(abreviação);
    }

    
    public void setMes(String abrev){
        this.mes = converterAbreviacao(abrev);
    }
    
    public void setMes(int mes) {
        if(mes > 0 && mes <= 12){
            this.mes = mes;
        }
    }
    
    public int getMes() {
        return mes;
    }

    public String getNomeMes(){
        return mesesTexto[this.mes];
    }

    public MesEx10 proximoMes() {
        int proximo = this.mes + 1;
        if (proximo > 12) {
            proximo = 1; 
        }
        return new MesEx10 (proximo);
    }

    private int converterAbreviacao(String abrev){
        if (abrev == null || abrev.length() < 3) return 1;
        String tresLetras = abrev.substring(0, 3).toLowerCase();
        
        for (int i = 1; i <= 12; i++) {
            if (mesesTexto[i].substring(0, 3).equals(tresLetras)) {
                return i;
            }
        }
        return 1; 
    }
}
