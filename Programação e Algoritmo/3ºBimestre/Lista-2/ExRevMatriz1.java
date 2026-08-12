public class ExRev01 {
    public static void main(String[] args) {
        // Declaração da Matriz A 2X2
        int[][] A = {
                {1,2},
                {3,4}
        };

        // Declaração da Matriz B 2X2
        int[][] B = {
                {3,7},
                {8, 4}
        };

        // Declaração da Matriz C 2X2
        int[][] C = new int[2][2];

        // Soma de A+B
        for(int i =0; i < 2; i++){
            //Passa pela Linha
            for(int j = 0; j < 2; j++){
                // Passa pela Coluna
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        // Mostra Matriz A
        System.out.println("Matriz A:");
        for (int i = 0; i < 2; i++){
            //Passa pela Linha
            for (int j = 0; j < 2; j++){
                // Passa pela Coluna
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        // Mostra Matriz B
        System.out.println("Matriz B:");
        for (int i = 0; i < 2; i++){
            //Passa pela Linha
            for (int j = 0; j < 2; j++){
                // Passa pela Coluna
                System.out.print(B[i][j] + "\t");
            }
            System.out.println();
        }

        // Mostra Matriz C
        System.out.println("Matriz C = A+B:");
        for (int i = 0; i < 2; i++){
            //Passa pela Linha
            for (int j = 0; j < 2; j++){
                // Passa pela Coluna
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
