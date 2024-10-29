import javax.swing.JOptionPane;
import java.math.*;


public class ex4 {
        public static void main(String[] args) throws Exception{
            String altura = JOptionPane.showInputDialog(null, "Digite a altura(M)", "informaçoes", JOptionPane.QUESTION_MESSAGE);

            String peso = JOptionPane.showInputDialog(null, "Digite o peso(KG)", "informaçoes", JOptionPane.QUESTION_MESSAGE);

            float alturafloat = Float.parseFloat(altura);
            float pesofloat = Float.parseFloat(peso);

            double imc = pesofloat / (Math.pow(alturafloat, 2));
            //int imcint = (int) imc;

            if (imc < 18.5) {
                JOptionPane.showMessageDialog(null, " Abaixo do peso : " + imc , "Informacoes", JOptionPane.INFORMATION_MESSAGE);//exibindo na tela

            } else if (imc >= 18.6 && imc < 25.9) {
                JOptionPane.showMessageDialog(null, " saudavel : " + imc, "Informacoes", JOptionPane.INFORMATION_MESSAGE);//exibindo na tela
            } else if (imc >= 25 && imc < 29.9){
                JOptionPane.showMessageDialog(null, " Peso em excesso : " +imc, "Informacoes", JOptionPane.INFORMATION_MESSAGE);//exibindo na tela
            }else if (imc >= 30 && imc < 34.9) {
                JOptionPane.showMessageDialog(null, " Obesidade grau I : " +imc, "Informacoes", JOptionPane.INFORMATION_MESSAGE);//exibindo na tela
            } else if (imc >= 35 && imc < 39.9) {
                JOptionPane.showMessageDialog(null, " Obesidade grau II : "+imc, "Informacoes", JOptionPane.INFORMATION_MESSAGE);//exibindo na tela
            } else {
                JOptionPane.showMessageDialog(null, " Obesidade grau III : "+imc, "Informacoes", JOptionPane.INFORMATION_MESSAGE);//exibindo na tela
            }
            

        }
}
