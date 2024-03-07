package MARIA_EDUARDA_KOLITSKI.Test_User;

public class Basics {
    public static void main(String[] args) {
      int valorInteiro = 10;
      System.out.println(valorInteiro); 

      int soma = 4 + valorInteiro;
      int sub = 4 - valorInteiro;
      int mult = 4 * valorInteiro;
      int div = 10 / valorInteiro;
      int rest = valorInteiro % 2;
      
      System.out.println("Soma: " +  soma);
      System.out.println("Subtração: " + sub);
      System.out.println("Multiplicação: " + mult);
      System.out.println("Divisão: " + div);
      System.out.println("Resto: " + rest);

      //for (int i = 0; i < args.length; i++) {

      //}

      System.out.println(++valorInteiro);
      System.out.println(--valorInteiro);

      System.out.println(!(valorInteiro == 10));

      int a = 10;
      int b = 5;
      int c = 5;

      System.out.println(a == b); //false
      System.out.println(a != b); //true

      System.out.println(a > b); //true
      System.out.println(b >= c); //true

      System.out.println(a < b); //false
      System.out.println(b <= c); //true
    }
}
