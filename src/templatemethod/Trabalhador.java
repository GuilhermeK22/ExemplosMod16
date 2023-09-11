package templatemethod;

public abstract class Trabalhador {
    public void executar() {
        iniciarRotina();
        levantar();
        irAoTrabalho();
        trabalhar();
        voltarParaCasa();
    }

    protected void iniciarRotina() {
        System.out.println("Iniciando Rotina");
    }

    protected void levantar() {
        System.out.println("Levantando da cama");
    }

    protected void irAoTrabalho() {
        System.out.println("Indo trabalhar");

    }
    protected abstract void trabalhar();

    protected void voltarParaCasa() {
        System.out.println("Voltando para casa");
    }
}
