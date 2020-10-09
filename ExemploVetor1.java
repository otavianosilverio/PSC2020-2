
/*
 * Qtos alunos tem na sala. Guardar o nome e a nota de todos alunos da sala
 * MOstrar o nome e a nota dos alunos com média maior que a média da turma
 */
import java.util.Scanner;

public class ExemploVetor1 {

	public static void main(String[] args) {

            int soma=0, media=0, quantidadeDeAlunos=0;
	//
            // Solicitando a quantidade de alunos
            System.out.println("Informe a Quantidade de alunos a serem cadastrados:");
            quantidadeDeAlunos= new Scanner(System.in).nextInt();
            
            // Criar meu Vetor
            String[] nome = new String[quantidadeDeAlunos];
            String[] meses = {"Janeiro", "Fevereiro", "Março"};
            int[] nota = new int[quantidadeDeAlunos];
            
            // 
         
            System.out.println(meses[0]);
            
            for (int i=0; i<quantidadeDeAlunos; i++) {
                 System.out.println ("Insira o Nome do Aluno  " + i);
                 nome[i] = new Scanner(System.in).nextLine();
 
                  System.out.println ("Insira a Nota do Aluno  " + i);
                  nota[i] = new Scanner(System.in).nextInt();
 
                  soma= soma + nota[i];
            }
            media= soma/quantidadeDeAlunos;
            System.out.println("Media da Turma :"+media);
           
            System.out.println("Alunos c/ nota maior que a media da turma:");
 
           for (int i=0; i< nota.length; i++) {    
                if (nota[i]>media){
                     System.out.print(nome[i] + " - ");
                     System.out.println(nota[i]);
                }
            }
    }		// TODO Auto-generated method stub

}
