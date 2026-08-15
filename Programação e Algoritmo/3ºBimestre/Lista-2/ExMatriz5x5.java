import javax.swing.*;

public class Main {
    public static void main (String[] args){
        // Declaração da Matriz A
        int[][] matrizA = new int[5][5];

        // Declaração da Matriz B
        int[][] matrizB = new int[5][5];

        // Declaração da Matriz Soma
        int[][] matrizSoma = new int[5][5];

        // Declaração da Matriz Subtração
        int[][] matrizSub = new int[5][5];

        // Declaração da Matriz Divisão
        double[][] matrizDiv = new double[5][5];

        //Preenchimento da Matriz A
        for(int i = 0; i < 5; i++){
            // Lê Linha
            for(int j = 0; j < 5; j++){
                //Lê  Coluna
                int input = Integer.parseInt(JOptionPane.showInputDialog(null,"Matriz A\n"+"Digite o valor da Linha: "+(i+1)+" Coluna: "+(j+1)));
                matrizA[i][j] = input;
            }
        }

        //Preenchimento da Matriz B
        for (int i = 0; i < 5; i++){
            // Lê Linha
            for(int j = 0; j < 5; j++){
                //Lê  Coluna
                int input = Integer.parseInt(JOptionPane.showInputDialog(null,"Matriz B\n"+"Digite o valor da Linha: "+(i+1)+" Coluna: "+(j+1)));

                if(input == 0){
                    JOptionPane.showMessageDialog(null,"Valor da Matriz B não pode ser igual a 0");
                    return;
                }

                matrizB[i][j] = input;
            }
        }

        //Soma de A e B, atribuindo os valores a Matriz Soma
        for(int i = 0; i < 5; i++){
            // Lê Linha
            for(int j = 0; j < 5;j++){
                //Lê  Coluna
                matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        //Subtração de A e B, atribuindo so valores a Matriz Subtração
        for(int i = 0; i < 5; i++){
            // Lê Linha
            for(int j = 0; j < 5;j++){
                //Lê  Coluna
                matrizSub[i][j] = matrizA[i][j] - matrizB[i][j];
            }
        }

        //Divisão de A e B, atribuindo so valores a Matriz Divisão
        for(int i = 0; i < 5; i++){
            // Lê Linha
            for(int j =0; j < 5; j++){
                //Lê  Coluna
                matrizDiv[i][j] = (double)matrizA[i][j] / matrizB[i][j];
            }
        }

        //Mostra Matriz A
        System.out.println("Matriz A: ");
        for(int i = 0; i < 5; i++){
            // Lê Linha
            for(int j =0; j < 5; j++){
                //Lê  Coluna
                System.out.print(matrizA[i][j] + "\t");
            }
            System.out.println();
        }

        //Mostra Matriz B
        System.out.println("Matriz B: ");
        for(int i = 0; i < 5; i++){
            // Lê Linha
            for(int j =0; j < 5; j++){
                //Lê  Coluna
                System.out.print(matrizB[i][j] + "\t");
            }
            System.out.println();
        }

        //Mostra Matriz Soma
        System.out.println("Soma = A + B: ");
        for(int i = 0; i < 5; i++){
            // Lê Linha
            for(int j =0; j < 5; j++){
                //Lê  Coluna
                System.out.print(matrizSoma[i][j] + "\t");
            }
            System.out.println();
        }

        //Mostra Matriz Subtração
        System.out.println("Subtração = A - B: ");
        for(int i = 0; i < 5; i++){
            // Lê Linha
            for(int j =0; j < 5; j++){
                //Lê  Coluna
                System.out.print(matrizSub[i][j] + "\t");
            }
            System.out.println();
        }

        //Mostra Matriz Divisão
        System.out.println("Divisão = A / B: ");
        for(int i = 0; i < 5; i++){
            // Lê Linha
            for(int j =0; j < 5; j++){
                //Lê  Coluna
                System.out.print(matrizDiv[i][j] + "\t");
            }
            System.out.println();
        }
    }
}