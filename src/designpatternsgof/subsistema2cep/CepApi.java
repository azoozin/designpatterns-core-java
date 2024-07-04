package designpatternsgof.subsistema2cep;

public class CepApi {

    // create a singleton
    private static CepApi instance = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instance;
    }

    // criar metodos de isntancia publicos
    public String recuperarCidade(String cep) {
        return "arara";
    }

    public String recuperarEstado(String cep) {
        return "sao paulo";
    }
}
