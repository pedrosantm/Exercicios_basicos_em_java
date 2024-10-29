import javax.swing.JOptionPane;
import java.math.*;


public class ex8 {
    public static void main(String[] args) throws Exception{
        String a = JOptionPane.showInputDialog(null, "Digite o valor de a", "informaçoes", JOptionPane.QUESTION_MESSAGE);//imput de infos

        String b = JOptionPane.showInputDialog(null, "Digite o valor de b", "informaçoes", JOptionPane.QUESTION_MESSAGE);//imput de infos

        double a_double = Double.parseDouble(a);//conversoes
        double b_double = Double.parseDouble(b);

        double c = 0.0;//criação de nova variavel, resultado
        c  = calculo(a_double, b_double, c);//chamando metodo

        JOptionPane.showMessageDialog(null, " Valor da hipotenusa : " + c, "Informacoes", JOptionPane.INFORMATION_MESSAGE);//exibindo na tela





    }

    public static double calculo(Double a, Double b, Double c) {//metodo
        a = (Math.pow(a, 2)) + (Math.pow(b, 2));//calculo do valor
        c = Math.sqrt(a);
        return c;//retornando o resultado
    }

}
