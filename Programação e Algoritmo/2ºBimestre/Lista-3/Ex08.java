import javax.swing.*;

public class Ex08 {
    public static void main(String[] args) {
        int[] numeros = {74, 196, 161, 12, 86, 90, 266, 305, 6, 105};

        int maior = numeros[0];
        int menor = numeros[0];

        for(int i = 0; i <= 9; i++){
            if(numeros[i] > maior){
                maior = numeros[i];
            }

            if(numeros[i] < menor){
                menor = numeros[i];
            }
        }

        JOptionPane.showMessageDialog(null,"Maior número: "+maior+" Menor número: "+menor);
    }
}
