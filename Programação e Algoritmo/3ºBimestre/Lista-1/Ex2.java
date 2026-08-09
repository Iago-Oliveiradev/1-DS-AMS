import javax.swing.*;

public class Ex2 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número: "));

        String mensagem = "";

        if(num > 0){
            mensagem+="O número é positivo e ";
        } else{
            mensagem+="O número é negativo e ";
        }

        if(num % 2 == 0){
            mensagem+="o número é par";
        } else{
            mensagem+="o número é ímpar";
        }

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
