import java.util.Scanner;

public class Collatz {

    public static void main(String[] args){

        //Cria um objeto Scanner chamado "sc"
        //Ele será responsável por capturar dados
        // digitados no teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro positivo: ");

        // Lê o número digitado pelo usuário e 
        // armazena a variável número
        int numero = sc.nextInt();

        // Exibe um título para organziar a saída do programa
        System.out.println("\nSequência de Collatz:");

        // o laço WHILE continuará executando
        // enquanto o valor da variável "número" for diferente de 1
        while (numero != 1){

            // Mostra o valor atual da sequência.
            System.out.println(numero);

            //Verifica se o número é par
            if (numero % 2 == 0) {
                numero = numero / 2;
            }
            
            else {
                numero = (numero * 3) + 1;
            } 
        }

        System.out.println(1);

        sc.close();

    }

}