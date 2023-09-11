package templatemethod;

public class Advogado extends Trabalhador {
    @Override
    protected void trabalhar() {
        System.out.println("Trabalho como advogado");
    }

    @Override
    protected void voltarParaCasa() {
        System.out.println("Volto para casa às 16 horas.");
    }

    @Override
    protected void irAoTrabalho() {
        System.out.println("Vou trabalhar às 09 horas.");
    }
    @Override
    protected void iniciarRotina() {
        System.out.println("Inicio a rotina diáriamente, tomando café e indo na academia.");
    }

    @Override
    protected void levantar() {
        System.out.println("Levanto às 07 horas e 30 minutos.");
    }
}
