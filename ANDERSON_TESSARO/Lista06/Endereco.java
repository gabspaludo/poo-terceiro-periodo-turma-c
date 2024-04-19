package ANDERSON_TESSARO.Lista06;

public class Endereco {
    String estado;
    String cidade;
    String bairro;
    Integer numero;
    String complemento;

    public void apresentarLogradouro() {
        String endereco = numero + ", " + complemento + ", " + bairro + ", " + cidade + ", " + estado;
        System.out.println("Endereço: " + endereco);
    }
}
