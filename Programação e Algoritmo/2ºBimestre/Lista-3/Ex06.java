import javax.swing.*;

public class Ex06 {
    public static void main(String[] args) {
        int[] quantidade = new int[50];
        double[] preco = new double[50];
        double faturamento = 0;

        for(int i = 0; i <=49; i++){
            quantidade[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade do produto: "));

            preco[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o preço unitário do produto: "));

            faturamento += quantidade[i] * preco[i];
        }

        JOptionPane.showMessageDialog(null,"Faturamento: R$"+faturamento);
    }
}
