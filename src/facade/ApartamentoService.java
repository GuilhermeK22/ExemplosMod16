package facade;

public class ApartamentoService implements IApartamentoService {
    @Override
    public Boolean cadastrarApartamento(Apartamento apartamento) {
        Boolean isCadastro = isApartamentoCadastrado(apartamento);
        Boolean isCamposValidos = isCamposValidos(apartamento);
        if (isCadastro && !isCamposValidos) {
            return false;
        }
        return cadastrarNoBanco(apartamento);
    }

    private Boolean cadastrarNoBanco(Apartamento apartamento) {
        //lógica de cadastro
        return true;
    }

    private Boolean isCamposValidos(Apartamento apartamento) {
        return false;
    }

    private Boolean isApartamentoCadastrado(Apartamento apartamento) {
        //ir no banco e verificar se está cadastrado
        return false;
    }
}
