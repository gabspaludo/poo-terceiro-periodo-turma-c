package atividadeObjeto;

// 2. Crie uma classe Endereco com:
// - Com os atributos estado, cidade, bairro, numero e complemento.
// - Método apresentarLogradouro, printa de uma maneira interessante os dados de endereço concatenados.
// - Refatorar locais que utilizavam endereço.
public class Endereco {
    String estado;
    String cidade;
    String bairro;
    String numero;
    String complemento;

    public Endereco(String estado, String cidade, String bairro, String numero, String complemento) {
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.numero = numero;
        this.complemento = complemento;
    }

    public void apresentarLogradouro() {
        String apresentar = "ENDEREÇO: " + complemento + ", " + numero + " - " + bairro + "\n" + cidade
                + " - " + estado;
        System.out.println(apresentar);

    }
}
