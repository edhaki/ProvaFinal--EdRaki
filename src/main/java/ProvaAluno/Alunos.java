
package ProvaAluno;

/**
 *
 * @author Ederson .A Silva
 */
public class Alunos {

    private final float pesoNota1;
    private final float pesoNota2;
    private final float pesoNotaTrabalho;
    float calculoN1, calculoN2,calculoN3, resultadoNs, totalMediaDaNotaPeso;
    float notaProvaFinal = 5.0f;
    float notaFinal;
    private String nome, matricula;

    public Alunos(float pesoNota1, float pesoNota2, float pesoNotaTrabalho) {
        this.pesoNota1 = pesoNota1;
        this.pesoNota2 = pesoNota2;
        this.pesoNotaTrabalho = pesoNotaTrabalho;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

   
    
    
   
    public float getCalculoN1(float calculoN1) {
        return calculoN1;
    }

    public void setCalculoN1(float nota1) {
        this.calculoN1 = calculoN1 = nota1 * pesoNota2;
        System.out.println("Sua Nota Peso da 1 Prova é : " + calculoN1);
    }
    
    public float getCalculoN2() {
        return calculoN2;
    }

    public void setCalculoN2(float nota2) {
        this.calculoN2 = calculoN2 = nota2 * pesoNota2;
         System.out.println("Sua Nota Peso da 2 Prova é :" + calculoN2);
    }

     public void setCalculoN3(float trabalhoNota){
        this.calculoN3 = calculoN3 = trabalhoNota* pesoNota2;
         System.out.println("Sua Nota Peso do Trabalho é : " + calculoN3);
    }

   
     public float getCalculoN3() {
        return calculoN3;
    }
     
    public void calcularMediaPeso(){
        this.resultadoNs = calculoN1 + calculoN2 + calculoN3;
    }
    public float getResultadoNs() {
        return resultadoNs;
    }
    public void calculaTotalNotaPeso(){
        this.totalMediaDaNotaPeso = resultadoNs / 10;
        System.out.println(totalMediaDaNotaPeso);
    }
  
    public float getTotalMediaDaNotaPeso() {
        return totalMediaDaNotaPeso;
    }
  
    public float getNotaFinal() {
        return notaFinal;
      }
    
    public void notaProvaFinal(){
    this.notaFinal = totalMediaDaNotaPeso;
    if(notaFinal <= 3.99f){
    notaFinal = 0.0f; 
    System.out.println(matricula + " " + nome + " Você foi Reprovado " + notaFinal);
    } else if(notaFinal >=4.0f && notaFinal <= 4.99f){
        notaFinal = notaProvaFinal - notaFinal;    
            System.out.println("Você precisa de : " + notaFinal + " para Passar para prova Final ");
    } else {
    System.out.println("Parabéns "+ nome + " Você Passou para prova Final ");
    }
    }
}

