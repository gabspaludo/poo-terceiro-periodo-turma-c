import java.util.Scanner;

public class Lista1 {
   public static void main(String[] args) {
        System.out.println(calcularTotal(2, 5.4));
        String num = new Scanner(System.in).nextLine();
    }

    private static double calcularTotal(double num1, double num2) {
        return num1 * num2;
    }
}