import javax.swing.JOptionPane;
import java.math.*;


public class ex5 {
    public static void main(String[] args) throws Exception{
        String a = JOptionPane.showInputDialog(null, "Digite A", "informaçoes", JOptionPane.QUESTION_MESSAGE);
        String b = JOptionPane.showInputDialog(null, "Digite B", "informaçoes", JOptionPane.QUESTION_MESSAGE);
        String c = JOptionPane.showInputDialog(null, "Digite C", "informaçoes", JOptionPane.QUESTION_MESSAGE);//imput de infos

        double adouble = Double.parseDouble(a);//conversoes
        double bdouble = Double.parseDouble(b);
        double cdobuble = Double.parseDouble(c);
        double result1, result2;

        result1 = (-adouble - (Math.sqrt((Math.pow(bdouble,2))-4*adouble*cdobuble)))/2*adouble;//calculo d araiz 1

        result2 = (-adouble + (Math.sqrt((Math.pow(bdouble,2))-4*adouble*cdobuble)))/2*adouble;//calculo da raiz 2

        JOptionPane.showMessageDialog(null, " Valor 1 da equação : " + result1 + " Valor 2 da equação : " + result2 , "Informacoes", JOptionPane.INFORMATION_MESSAGE);//exibindo na tela

    }

    
}
