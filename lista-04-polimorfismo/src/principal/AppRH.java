package principal;
import java.math.BigDecimal;

import modelo.ex04_folha_pagamento.*;

public class AppRH {

    public static void mostrarDadosEmpregado(Empregado e){
            System.out.println("\nNome: " + e.getNome());
            System.out.println("INSS: " + e.getINSS());
            System.out.println("Salario: R$" + e.calculoPagamento());
    }
    public static void main(String[] args) {
        

        EmpregadoHorista horista = new EmpregadoHorista("Kauê", "1235", BigDecimal.valueOf(100));
        horista.setHorasTrabalhadas(15);
        EmpregadoMensalista mensalista = new EmpregadoMensalista("Joao", "123", BigDecimal.valueOf(5000));
        mostrarDadosEmpregado(horista);
        mostrarDadosEmpregado(mensalista);
    }   
}