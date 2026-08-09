import javax.swing.*;

public class Ex01 {
    public static void main(String[] args){
        for(int i = 75; i <= 197; i++){
            if(i % 2 != 0){
                JOptionPane.showMessageDialog(null,"Número atual: "+i);
            } else{
                continue;
            }
        }
    }
}
