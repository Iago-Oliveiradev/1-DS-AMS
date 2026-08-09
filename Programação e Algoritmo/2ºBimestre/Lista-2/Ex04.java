import javax.swing.*;

public class Ex04 {
    public static void main(String[] args) {
        int entre = 0;

        while(true){
            int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número: "));

            if(num == 0){
                break;
            }

            if(num >= 100 && num <= 200){
                entre++;
            }
        }

        JOptionPane.showMessageDialog(null,"Você digitou "+ entre+ " números entre 100 e 200");
    }
}
