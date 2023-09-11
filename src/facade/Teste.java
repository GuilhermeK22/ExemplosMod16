package facade;

public class Teste {
    public static void main(String arg[]) {
        IApartamentoService service = new ApartamentoService();
        service.cadastrarApartamento(new Apartamento(1L, "Endereço"));
    }
}
