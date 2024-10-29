import javax.swing.JOptionPane;
import java.math.*;

public class ex10 {
    public static void main(String[] args) throws Exception{
        String op = JOptionPane.showInputDialog(null, "1 - Calcular a area de um quadrado\n2 - calcular a area de um círculo\n3 - calcular a area de um triangulo\n4 - sair", "informaçoes", JOptionPane.QUESTION_MESSAGE);//menu
     
        
        int opint = Integer.parseInt(op);
        String op2, op3;
        switch (opint) {
            case 1:
             op2 = JOptionPane.showInputDialog(null, "Insira o valor do lado", JOptionPane.QUESTION_MESSAGE);//imput de infos
            double lado = Double.parseDouble(op2);//conversao
             quadrado(lado);//chamando metodo
                break;
            case 2:
             op2 = JOptionPane.showInputDialog(null, "Insira o valor do diametro", JOptionPane.QUESTION_MESSAGE);//imput de infos
                double diametro = Double.parseDouble(op2);//conversao
                cirunferencia(diametro);//chamando metodo
                break;
            case 3:
                op2 = JOptionPane.showInputDialog(null, "Insira o valor da base", JOptionPane.QUESTION_MESSAGE);
                op3 = JOptionPane.showInputDialog(null, "Insira o valor da altura", JOptionPane.QUESTION_MESSAGE);//imput de infos
               double base = Double.parseDouble(op2);//conversao
               double altura = Double.parseDouble(op3);//conversao
               triangulo(base, altura);//chamando metodo
                break;
            case 4:
                break;
            default:
                break;
        }


    }

    public static void quadrado(double lado) {//metodo
      double result = Math.pow(lado, 2);
      JOptionPane.showMessageDialog(null, " Valor: " + result, "Informacoes", JOptionPane.INFORMATION_MESSAGE);//exibindo na tela
    }

    public static void cirunferencia(double diametro) {//metodo
        double result = (Math.pow(diametro, 2)*3.1415)/4;
        JOptionPane.showMessageDialog(null, " Valor: " + result, "Informacoes", JOptionPane.INFORMATION_MESSAGE);//exibindo na tela
      }

      public static void triangulo(double base, double altura) {//metodo
        double result = (base * altura)/2;
        JOptionPane.showMessageDialog(null, " Valor: " + result, "Informacoes", JOptionPane.INFORMATION_MESSAGE);//exibindo na tela
      }
}
