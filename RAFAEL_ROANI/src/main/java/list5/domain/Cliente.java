package list5.domain;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Cliente extends Pessoa {
    private Cliente(String nome, Integer idade, String cidade, String bairro, String rua) {
        super(nome, idade, cidade, bairro, rua);
    }

    @Override
    public void apresentarse() {
        log.info("Meu nome é {} e minha idade é {}", nome, idade);
    }

    @Override
    public String toString() {
        return "Vendedor: " + "\n" +
                "Nome: " + nome + "\n" +
                "Idade" + idade + "\n" +
                "Endereço: " + rua + ", " + bairro + " - " + cidade + "\n";
    }

    public static final class ClienteBuilder {
        private String nome;
        private Integer idade;
        private String cidade;
        private String bairro;
        private String rua;

        private ClienteBuilder() {
        }

        public static ClienteBuilder builder() {
            return new ClienteBuilder();
        }

        public ClienteBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public ClienteBuilder idade(Integer idade) {
            this.idade = idade;
            return this;
        }

        public ClienteBuilder cidade(String cidade) {
            this.cidade = cidade;
            return this;
        }

        public ClienteBuilder bairro(String bairro) {
            this.bairro = bairro;
            return this;
        }

        public ClienteBuilder rua(String rua) {
            this.rua = rua;
            return this;
        }

        public Cliente build() {
            return new Cliente(nome, idade, cidade, bairro, rua);
        }
    }
}
