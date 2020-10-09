public class ExemploMatriz {
    public static void main(String[] args) {
        // declara uma matriz com 10 linhas e 10 colunas
        int[][] m = new int[10][10];
 
        System.out.println("Sorteando n�meros...");
        // preenche os 100 elementos da matriz com n�meros de 1 a 9
        for(int n = 0; n < 10; n++) {
            for(int i = 0; i < 10; i++) {
                // sorteia um n�mero de 1 a 9 e p�e na linha l e na coluna c da matriz
                m[n][i] = (int)(Math.random()*9)+1; 
            }
        }
        System.out.println("Matriz preenchida!");
        // exibe o conte�do da matriz de v�rias formas
        System.out.println("Conte�do de cada posi��o da matriz:");
        for(int n = 0; n < 10; n++) {
            for(int i = 0; i < 10; i++) {
                System.out.println("m["+n+"]["+i+"] = "+m[n][i]);
            }
        }
        System.out.println("Conte�do da matriz completa:");
        for(int n = 0; n < 10; n++) {
            for(int i = 0; i < 10; i++) {
                System.out.print(m[n][i]+" ");
            }
            System.out.println();
        }
        System.out.print("Soma dos elementos da 5� coluna: ");
        int somaColuna5 = 0;
       for(int n = 0; n < 10; n++) {
            somaColuna5 = somaColuna5 + m[n][4];
        }
        System.out.println(somaColuna5);
    }
}