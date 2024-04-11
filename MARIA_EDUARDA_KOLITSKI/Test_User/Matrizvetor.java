package MARIA_EDUARDA_KOLITSKI.Test_User;

public class Matrizvetor {
    public static void main(String[] args) {

        int[][] matrizBalaDeclarada;
        int[][] matrizBala = new int[3][3];
        int[][] matrizBalaComValor = new int[][] { {34, 21 }, { 11, 23 } };

        System.out.println(matrizBalaComValor[1][1]); //matrizBala = int[3])

        for (int i = 1; i < 8; i++) {
            if (i != 1 && i != 7) {
                continue;
            }

            System.out.println("Hoje é ".concat(i == 1 ? "Domingo" : "Sábado"));
        }
    }
}