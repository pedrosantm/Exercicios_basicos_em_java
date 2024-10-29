import javax.swing.JOptionPane;
 
public class ex3 {
    public static void main(String[] args) throws Exception{


    int cont = 0;//declaração de variaveis
    int sal = 0;
    int salarioint = 0;
    
    
    do{
        cont++;
        String salario = JOptionPane.showInputDialog(null, "Digite o salario", "Salario", JOptionPane.QUESTION_MESSAGE);//imput slario
         salarioint = Integer.parseInt(salario);//conversao para inteiro
         if(salarioint>0){//verificação de salario valido
            sal = sal + salarioint;//se verdadeiro, soma aos salarios anteriores
         }
    }while(salarioint > 0);//verificação de salario valido

    cont = cont - 1;//desconta a ultima entrada de salario nao valido
    sal = sal / cont;//operaçãi de media
    JOptionPane.showMessageDialog(null, " Media final "  + sal, "Informacoes", JOptionPane.INFORMATION_MESSAGE);//exibindo na tela

  }
}
