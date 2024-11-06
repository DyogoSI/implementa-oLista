
package javassortaula;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class JavasSortAula {
    
     public static Pessoa[] geraArrayPessoas() {
        return new Pessoa[]{
            new Pessoa("Carlos", LocalDate.of(1990, 5, 20)),
            new Pessoa("Ana", LocalDate.of(1985, 3, 15)),
            new Pessoa("Ana", LocalDate.of(1983, 3, 15)),
            new Pessoa("Rafael", LocalDate.of(2000, 1, 25)),
            new Pessoa("Bruno", LocalDate.of(1992, 7, 10))
        };
    }
     
      public static Integer[] geraArrayAleatorio(int size, int min, int max) {
        Random random = new Random();
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min; // Gera um número aleatório entre min e max
        }
        return array;
    }

    public static void main(String[] args) {
       Pessoa[] vetorPessoas = geraArrayPessoas();
        System.out.println("Pessoas do vetor:");
        for(Pessoa p: vetorPessoas)
            System.out.println(p);
        
        Comparator<Pessoa> comparaNome = (p1,p2) ->
                p1.getNome().compareTo(p2.getNome());
        
        Comparator<Pessoa> comparaDataNascimento = (p1,p2) ->
                p1.getDataNascimento().compareTo(p2.getDataNascimento());
        
        //BubbleSort<Pessoa> bsort = new BubbleSort<>();
        //SelectionSort<Pessoa> ssort = new SelectionSort<>();
        InsertionSort<Pessoa> isort = new InsertionSort<>();
        //bsort.sort(vetorPessoas, comparaDataNascimento);
        isort.sort(vetorPessoas);
        //Arrays.sort(vetorPessoas,comparaNome);
        System.out.println("Pessoas ordenadas pelo nome:");
        for(Pessoa p: vetorPessoas)
            System.out.println(p);
        
        Pessoa pessoaBusca = new Pessoa("Carlos", LocalDate.of(1990, 5, 20));


        
     // crie um objeto pessoa
     // chame a busca binária
     
     
     /*  int tamanho = 100, min = 1, max =20;
       Integer[] vetor1 = geraArrayAleatorio(tamanho,min,max);
       Integer[] vetor2 = new Integer[tamanho];
       Integer[] vetor3 = new Integer[tamanho];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Valor para busca:");
        Integer x = scanner.nextInt();
        Search busca = new Search();
        System.out.println("Busca Linear");
        System.out.println("Posicao:"+busca.linearSearch(vetor1, x));
        System.out.println("Comparacoes:"+busca.getContaComparacoes());
        

       for(int i=0;i<tamanho;i++){
           vetor2[i]=vetor1[i];
           vetor3[i] = vetor1[i];
           System.out.print("|"+vetor1[i]);
       }// copia do vetor 1 para os outros 2
        System.out.println("");
       Comparator<Integer> comparatorInteiro = (a,b)-> a.compareTo(b);
       
       BubbleSort<Integer> bsort = new BubbleSort<>();
       SelectionSort<Integer> ssort = new SelectionSort<>();
       InsertionSort<Integer> isort = new InsertionSort<>();
       
       long inicio = System.currentTimeMillis();
       bsort.sort(vetor1, comparatorInteiro);
       long tfinal = System.currentTimeMillis();
       long tempo = tfinal - inicio;
        System.out.println("Tempo do Bubble Sort:"+tempo + " Comparacoes:"+ bsort.getContaComparacoes());
       
        // Selection Sort
       inicio = System.currentTimeMillis();
       ssort.sort(vetor2, comparatorInteiro);
       tfinal = System.currentTimeMillis();
       tempo = tfinal - inicio;
       System.out.println("Tempo do Selection Sort:"+tempo + " Comparacoes:"+ssort.getContaComparacoes());
       
       // Insertion Sort
       inicio = System.currentTimeMillis();
       isort.sort(vetor3);
       tfinal = System.currentTimeMillis();
       tempo = tfinal - inicio;
       System.out.println("Tempo do Insertion Sort:"+tempo+ " Comparacoes:"+ isort.getContaCompacaoes());
       //System.out.println("Vetor ordenado:");

        System.out.println("Busca Binaria");
        System.out.println("Posicao:"+busca.binarySearch(vetor1, x));
        System.out.println("Comparacoes:"+busca.getContaComparacoes());
       
*/
    }
    
}
