import javax.swing.*;

public class ex02 {
    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite sua idade: "));
        double preco = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o preço: "));

        if(idade > 65) {
            JOptionPane.showMessageDialog(null,"Passagem gratuita");
        } else {
            JOptionPane.showMessageDialog(null,"Pagar passagem de:"+preco);
        }
    }
}
