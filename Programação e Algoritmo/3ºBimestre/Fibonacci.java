public class Fibonacci {

    static int primeiro = 0;
    static int segundo = 1;
    static int quantidade = 10;

    public static void main(String[] args) {
            System.out.println("Sequência de Fibonacci");

        for (int i = 1; i < quantidade; i++) {
            System.out.println("Repetição " + i + " -> " + primeiro);

            int proximo = primeiro + segundo;

            primeiro = segundo;

            segundo = proximo;
        };
    }
}