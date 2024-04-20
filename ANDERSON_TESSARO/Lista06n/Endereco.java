package Lista06n;

public class Endereco {
    private String estado;
    private String cidade;
    private String bairro;
    private String numero;
    private String complemento;

    // Construtor, getters e setters
    public void apresentarLogradouro() {
        System.out.println(numero + ", " + complemento + ", " + bairro + ", " + cidade + ", " + estado);
    }
}