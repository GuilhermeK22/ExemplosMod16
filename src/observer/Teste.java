package observer;

public class Teste {
    public static void main(String args[]) {
        Jornalista jor = new Jornalista();
        jor.add(new TV());
        jor.notifyAll("Teste");
    }
}
