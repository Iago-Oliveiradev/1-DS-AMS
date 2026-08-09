import javax.swing.*;

public class Ex15 {
    public static void main(String[] args) {
        double ladoA = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do lado A: "));
        double ladoB = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do lado B: "));
        double ladoC = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do lado C: "));

        if( ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB){
            if(ladoA == ladoB && ladoB == ladoC){
                JOptionPane.showMessageDialog(null, "Triângulo equilátero");
            } else if(ladoA == ladoB || ladoA == ladoC || ladoB == ladoC){
                JOptionPane.showMessageDialog(null, "Triângulo isóceles");
            } else{
                JOptionPane.showMessageDialog(null, "Triângulo escaleno");
            }
        } else{
            JOptionPane.showMessageDialog(null, "Triângulo não existe");
        }
    }
}
