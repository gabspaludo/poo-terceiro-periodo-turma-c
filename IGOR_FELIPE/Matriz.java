public class Matriz {

    public static void main(String[] args){
        int[][] matriz1 = {{31,27,4},{44,32,95},{9,16,56}};
        //int matriz2[][] = new int[3][3];

        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                System.out.print(matriz1[i][j]+"|");
            }
            System.out.println(" ");
        }
    }   
}
