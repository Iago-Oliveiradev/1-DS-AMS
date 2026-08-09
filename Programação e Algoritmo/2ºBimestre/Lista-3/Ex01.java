import javax.swing.*;

public class Ex01 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int qtdpar = 0;
        int somaipar = 0;

        for(int i = 0; i <=9; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o "+(i+1)+"º número: "));

            if(numeros[i] % 2 ==1){
                somaipar +=numeros[i];
            } else{
                qtdpar++;
            }
        }

        JOptionPane.showMessageDialog(null,"Quantidade de pares: "+qtdpar);
        JOptionPane.showMessageDialog(null,"Soma dos ímpares: "+somaipar);

    }
}
