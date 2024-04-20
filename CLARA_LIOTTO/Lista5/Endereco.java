package CLARA_LIOTTO.Lista5;

public class Endereco  {
    
    public String estado = "Parana";
    public String cidade = "Ubiratã" ;
    public String bairro = "Centro";
    public int numero = 111;
    public String complemento = "Casa";

    public Endereco(String estado, String cidade, String bairro, int numero, String complemento) {
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.numero = numero;
        this.complemento = complemento;
    }

    public void apresentarLogradouro (){
        System.out.println("Estado: " + estado + "\n" + 
        "Cidade: " + cidade + "\n" +
        "Bairro: " + bairro + "\n" +
        "Numero: " + numero + "\n" +
        "Complemento: " + complemento );
    }
}
