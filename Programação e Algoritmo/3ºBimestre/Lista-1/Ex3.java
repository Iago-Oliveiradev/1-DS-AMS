import javax.swing.*;

public class Ex3 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de A: "));

        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de B: "));

        int soma, multiplicacao, c;
        if(a == b){
            soma = a+b;
            c = soma;

            JOptionPane.showMessageDialog(null,"São iguais e a soma é: "+c);
        } else{
            multiplicacao = a * b;
            c = multiplicacao;

            JOptionPane.showMessageDialog(null,"São diferentes e a multiplicação é: "+c);
        }
    }
}
