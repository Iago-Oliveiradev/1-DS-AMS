import javax.swing.JOptionPane;

public class ex01 {
    public static void main(String[] args) {
        double comp =  Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o comprimento da mesa: "));
        double larg =  Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a largura da mesa: "));

        double area = comp * larg;

        JOptionPane.showMessageDialog(null,"A área da mesa é: "+ area);
    }
}
