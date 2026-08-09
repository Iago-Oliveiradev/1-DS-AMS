import javax.swing.*;

public class Ex11 {
    public static void main(String[] args) {
        double[] notas = new double[4];
        double soma = 0;

        for(int i = 0; i <= 3; i++){
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a "+(i+1)+"º nota: "));
            soma+=notas[i];
        }

        double media = soma / 4;

        if(media < 7){
            JOptionPane.showMessageDialog(null,"A média é: "+media+ " Você está reprovado");

        } else{
            JOptionPane.showMessageDialog(null,"A média é: "+media+ " Você está aprovado!");

        }
    }
}
