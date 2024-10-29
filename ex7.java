import javax.swing.JOptionPane;
import java.math.*;


public class ex7 {
    public static void main(String[] args) throws Exception{

        String horas = JOptionPane.showInputDialog(null, "Digite as horas trabalhadas", "informaçoes", JOptionPane.QUESTION_MESSAGE);//imput de infos

        String val_hora = JOptionPane.showInputDialog(null, "Digite o valor da hora", "informaçoes", JOptionPane.QUESTION_MESSAGE);//imput de infos

        String n_dependentes = JOptionPane.showInputDialog(null, "Digite o numero de dependentes", "informaçoes", JOptionPane.QUESTION_MESSAGE);//imput de infos

        String descontos = JOptionPane.showInputDialog(null, "Digite os descontos", "informaçoes", JOptionPane.QUESTION_MESSAGE);//imput de infos

        int horasint = Integer.parseInt(horas);//conversoes
        int val_horaint = Integer.parseInt(val_hora);
        int n_dependentesint = Integer.parseInt(n_dependentes);
        int descontosint = Integer.parseInt(descontos);

        int salario = horasint * val_horaint + (50*n_dependentesint) - descontosint;//calculo

        JOptionPane.showMessageDialog(null, " Salario : " + salario, "Informacoes", JOptionPane.INFORMATION_MESSAGE);//exibindo na tela
    }



}
