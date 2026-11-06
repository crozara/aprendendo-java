package modelo;

public class TerminalEletrico {
    public void ernergizar(Energizavel e){
        System.out.println("Terminal Elétrico: liberando fluxo de [" + e.getPotenciaWatts() + "] Watts na tomada");
    }
}
