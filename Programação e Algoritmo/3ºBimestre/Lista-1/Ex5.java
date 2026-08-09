import javax.swing.*;

public class Ex5 {
    public static void main(String[] args) {
        double salarioMinimo = 1293.20;

        double salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite seu salário: "));

        int qtdSalarios = (int)(salario / salarioMinimo);

        JOptionPane.showMessageDialog(null, "Quantidade de salários que você recebe: "+qtdSalarios);
    }
}
