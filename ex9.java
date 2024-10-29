import javax.swing.JOptionPane;
import java.math.*;



public class ex9 {
    public static void main(String[] args) throws Exception {
        int[] vet = new int[10]; // Declara um vetor de inteiros com 10 posições

        

        for (int i = 0; i < 10; i++) {
            String num = JOptionPane.showInputDialog(null, "Digite o valor " + i, "Informações", JOptionPane.QUESTION_MESSAGE);//imput de infos
            vet[i] = Integer.parseInt(num); // Conversao
        }

       
        for (int i = 9; i >= 0; i--) {
            JOptionPane.showMessageDialog(null, "Valor no índice " + i + ": " + vet[i], "Informações", JOptionPane.INFORMATION_MESSAGE);//mostra na tela em ordem inversa
        }
    }
}
