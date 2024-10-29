import javax.swing.JOptionPane;
import java.math.*;


public class ex6 {
    public static void main(String[] args) throws Exception{

        int escolha = 0;
        do{
        String kilometros = JOptionPane.showInputDialog(null, "Digite KM", "informaçoes", JOptionPane.QUESTION_MESSAGE);//imput de infos
        String litros = JOptionPane.showInputDialog(null, "Digite Litros", "informaçoes", JOptionPane.QUESTION_MESSAGE);//imput de infos

        int kmint = Integer.parseInt(kilometros);//conversoes
        int litrosint = Integer.parseInt(litros);
        int result = kmint/litrosint;//calculo

        JOptionPane.showMessageDialog(null, " KM/L : " + result, "Informacoes", JOptionPane.INFORMATION_MESSAGE);//exibindo na tela

         escolha = JOptionPane.showConfirmDialog(null,"Nova contagem:",
          "Informaçoes",JOptionPane.YES_NO_OPTION);//escolha do usuario de novo calculo
          
        }while(escolha == 0);//verificação de condição
    }
}