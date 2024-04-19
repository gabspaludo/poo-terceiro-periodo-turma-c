package anderson;

public class Aula08
 {
   public static void main(String[] args) {
    
    String nome;
    Integer idade;
    Vendedor vendedor =new Vendedor(nome, idade );

    System.out.println(Vendedor.nome);
    Vendedor.nome = "ander";
    vendedor.idade = 27;

    System.out.println(Vendedor.nome);
   } 
}
