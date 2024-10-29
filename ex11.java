import javax.swing.JOptionPane;
import java.math.*;
import java.util.Random;

public class ex11 {
    public static void main(String[] args) throws Exception{
        int vezes = 0;
        int acert = 1;
        String op;
        Random random = new Random();
        int num_aleatorio = random.nextInt(1,101);//criação do numero aleatorio
        do{
            op = JOptionPane.showInputDialog(null, "Insira o chute de 1 a 100", JOptionPane.QUESTION_MESSAGE);//imput do chute
            int opint = Integer.parseInt(op); 
            if(opint > num_aleatorio){//verificação de maior/menor
                JOptionPane.showMessageDialog(null, "Chute alto", "Erro", JOptionPane.ERROR_MESSAGE);//mostrando na tela
                vezes ++;
                acert = 1;
            }else if(opint < num_aleatorio){//verificação de maior/menor
                JOptionPane.showMessageDialog(null, "Chute baixo", "Erro", JOptionPane.ERROR_MESSAGE);//mostrando na tela
                vezes++;
                acert = 1;
            }else{
                JOptionPane.showMessageDialog(null, "Acertou! O número era: " + num_aleatorio +
                "\nTentativas: " + vezes, "Informações", JOptionPane.INFORMATION_MESSAGE);//mostrando na tela
                acert = 0;//se acertar, acert = 0 e sai d loop
            }

        }while(acert == 1);//controle do loop

    }
}
