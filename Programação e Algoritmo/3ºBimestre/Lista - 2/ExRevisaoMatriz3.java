public class ExRev3 {
    public static void main(String[] args) {
        //Declaração da Matriz A
        int[][] A = {
                {8, 90},
                {27, 81}
        };

        //Declaração da Matriz B
        int[][] B = {
                {2, 3},
                {9, 27}
        };

        //Declaração da Matriz C
        double[][] C = new double[2][2];

        //Divisão de A e B
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                C[i][j] = (double) A[i][j] / B[i][j];
            }
        }

        //Mostra Matriz A
        System.out.println("Matriz A:");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        //Mostra Matriz B
        System.out.println("\nMatriz B:");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(B[i][j] + "\t");
            }
            System.out.println();
        }

        //Mostra Matriz C
        System.out.println("Matriz C = A/B");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
