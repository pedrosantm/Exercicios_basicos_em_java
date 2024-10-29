import javax.swing.JOptionPane;
import java.math.*;

public class ex2 {
    public static void main(String[] args) throws Exception {
        String montante = JOptionPane.showInputDialog(null, "quantia", "Calculo de juros", JOptionPane.QUESTION_MESSAGE);//imput montante

        String meses = JOptionPane.showInputDialog(null, "Numero de meses", "Calculo de juros", JOptionPane.QUESTION_MESSAGE);//imput meses

        String juros = JOptionPane.showInputDialog(null, "Numero de juros", "Calculo de juros", JOptionPane.QUESTION_MESSAGE);//imput juros

        int montanteint = Integer.parseInt(montante);//conversoes
        int mesesint = Integer.parseInt(meses);
        int jurosint = Integer.parseInt(juros);


        double valor_final = montanteint * (Math.pow((1+jurosint),mesesint));//calculo função

        JOptionPane.showMessageDialog(null, " Valor final "  + valor_final, "Informacoes", JOptionPane.INFORMATION_MESSAGE);//exibindo na tela


    }
}
