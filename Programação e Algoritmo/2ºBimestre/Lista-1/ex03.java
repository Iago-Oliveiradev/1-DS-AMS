import javax.swing.*;

public class ex03 {
    public static void main(String[] args){
        double n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite sua primeira nota: "));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite sua segunda nota: "));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite sua terceira nota: "));
        double n4 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite sua quarta nota: "));

        double md = (n1+n2+n3+n4)/4;

        if(md > 5) {
            JOptionPane.showMessageDialog(null,"Você foi aprovado. A média foi: "+ md);
        } else{
            JOptionPane.showMessageDialog(null,"Você foi reprovado. A média foi: "+ md);

        }
    }
}
