import javax.swing.*;

public class Ex07 {
    public static void main(String[] args) {
        for(int i = 0; i < 1; i++){
            int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número: "));

            if(num < 100 && num > 999){
                JOptionPane.showMessageDialog(null,"Número inválido, tente novamente");
                i--;
            } else{
                int centena = num/100;

                if(centena % 2 == 0){
                    JOptionPane.showMessageDialog(null,"A centena deste número é par");
                } else{
                    JOptionPane.showMessageDialog(null,"A centena deste número é ímpar");

                }
            }
        }
    }
}
