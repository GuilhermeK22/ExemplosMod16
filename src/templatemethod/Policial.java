package templatemethod;

public class Policial extends Trabalhador {
    @Override
    protected void trabalhar() {
        System.out.println("Trabalhando como policial");
    }
    protected void levantar() {
        System.out.println("Levantando da cama às 08 horas da manhã");
    }
}
