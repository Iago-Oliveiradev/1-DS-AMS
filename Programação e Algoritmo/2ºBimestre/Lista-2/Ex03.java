import javax.swing.*;

public class Ex03 {
    public static void main(String[] args){
        int maior = 0;

        for( int i = 0; i <16; i++){
            int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o "+(i+1)+"ºnúmero: "));

            if( num > 30){
                maior+= 1;
            }
        }

        JOptionPane.showMessageDialog(null,"Você digitou "+maior+" números acima de 30.");
    }
}
