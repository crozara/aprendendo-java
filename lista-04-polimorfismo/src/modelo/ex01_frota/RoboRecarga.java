package modelo.ex01_frota;

public class RoboRecarga  {
    public void conectarCabo(ContratoCompatibilidadeEletrica alvo){
        TensaoOperacao tensao = alvo.informarTensao();
        System.out.println("Robo conectado em " + tensao);
    }
}
