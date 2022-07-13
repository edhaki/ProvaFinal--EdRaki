
package ProvaAluno;
import java.util.Scanner;
/**
 *
 * @author Ederson .A Silva
 */
public class Main {

    
    public static void main(String[] args) {
    
           
    Scanner leitor = new Scanner(System.in);    
    Alunos calculosProva = new Alunos(2.5f,2.5f,2.0f);
    
    System.out.println("Digite Seu Nome Aluno: ");
    calculosProva.setNome(leitor.nextLine());
    
    System.out.println("Digite a Matricula Aluno: ");
    calculosProva.setMatricula(leitor.nextLine());
    
    System.out.println("Digite a Nota 1 do Aluno: ");
    calculosProva.setCalculoN1(leitor.nextInt());
    
    System.out.println("Digite a Nota 2 do Aluno: ");
    calculosProva.setCalculoN2(leitor.nextInt());
    
    System.out.println("Digite a Nota 3 do Aluno");
    calculosProva.setCalculoN3(leitor.nextInt());
    
    
    calculosProva.calcularMediaPeso();
    System.out.println("Total da Sua Nota em Peso é : " + calculosProva.getResultadoNs());
    
    calculosProva.calculaTotalNotaPeso();
    System.out.println("Sua Média de Nota Real é :" + calculosProva.getTotalMediaDaNotaPeso());

    calculosProva.notaProvaFinal();
    System.out.println(calculosProva.getNotaFinal());
    
     }
    
}
