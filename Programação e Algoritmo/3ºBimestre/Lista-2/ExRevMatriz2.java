public class ExRev02 {
    public static void main(String[] args) {
        // Declaração da Matriz A 2X2
        int[][] A = {
                {8,7},
                {18, 9}
        };

        // Declaração da Matriz B 2X2
        int[][] B = {
                {3, 2},
                {10, 6}
        };

        // Declaração da Matriz C 2X2
        int[][] C = new int[2][2];


        // Subtração de A e B
        for(int i = 0; i < 2; i++){
            //Passa pela Linha
            for(int j = 0; j < 2; j++){
                // Passa pela Coluna
                C[i][j] = A[i][j] - B[i][j];
            }
        }

        //Mostra Matriz A
        System.out.println("Matriz A:");
        for(int i = 0; i < 2; i++){
            //Passa pela Linha
            for(int j = 0; j < 2; j++){
                // Passa pela Coluna
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        //Mostra Matriz B
        System.out.println("\nMatriz B:");
        for(int i = 0; i < 2; i++){
            //Passa pela Linha
            for(int j = 0; j < 2; j++){
                // Passa pela Coluna
                System.out.print(B[i][j] + "\t");
            }
            System.out.println();
        }

        //Mostra Matriz C = A-B
        System.out.println("\nMatriz C = A-B:");
        for(int i = 0; i < 2; i++){
            //Passa pela Linha
            for(int j = 0; j < 2; j++){
                // Passa pela Coluna
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

