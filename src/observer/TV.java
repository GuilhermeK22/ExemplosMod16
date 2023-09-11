package observer;

public class TV implements Observer {
    @Override
    public void update(Jornalista subject) {
        System.out.println("Recebendo a notícia via TV" + subject.toString());
    }
}
