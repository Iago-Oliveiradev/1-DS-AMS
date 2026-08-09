import javax.swing.*;

public class Ex16 {
    public static void main(String[] args) {
        int fahr = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a temperatura em fahrenheit: "));

        int celsius = 5 * (fahr - 32) / 9;

        JOptionPane.showMessageDialog(null, "Temperatura em celsius: "+celsius);
    }
}
