import javax.swing.JOptionPane;


public class ex1 {
    public static void main(String[] args) throws Exception {
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome", "nome",  JOptionPane.QUESTION_MESSAGE );//capturando nome

        String idade = JOptionPane.showInputDialog(null, "Digite sua idade", "idade",  JOptionPane.QUESTION_MESSAGE );//capturando idade

        int idadeint = Integer.parseInt(idade);//convertendo idade string para inteiro

        JOptionPane.showMessageDialog(null,  nome + " sua idade eh "  + idadeint, "Informacoes", JOptionPane.INFORMATION_MESSAGE);//exibindo na tela
    }
}
