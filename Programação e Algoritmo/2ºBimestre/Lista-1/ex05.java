import javax.swing.*;

public class ex05 {
    public static void main(String[] args) {

        char genero = Char.parseChar(JOptionPane.showMessageDialog(null, "Digite seu gênero(M/F): "));
        double alt = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite sua altura(ex. 1.73): "));

        double peso_ideal;

        if(genero == 'M'){
            peso_ideal = (62.1 + alt) - 44.7;
            JOptionPane.showMessageDialog(null,"Seu peso ideal é "+peso_ideal);
        } else{
            peso_ideal = (72.7 + alt) -58;
            JOptionPane.showMessageDialog(null,"Seu peso ideal é "+peso_ideal);

        }
    }
}