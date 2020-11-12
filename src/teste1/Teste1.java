/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

/**
 *
 * @author Regis Maximo
 */
public class Teste1 {

    public static void main(String[] args) {

        final int[] A = {1, 3, 6, 4, 1, 2};
        final int[] B = {1, 2, 3};
        final int[] C = {-1, -3};
        final int[] D = {1, 4, 9, 3, 2, 1, 0, -7};
        
        // saídas formatadas com o uso de lambda 
        System.out.println("\nA:");
        IntStream.of(A).forEach(value -> System.out.printf("%d ", value));
        System.out.println("\nB:");
        IntStream.of(B).forEach(value -> System.out.printf("%d ", value));
        System.out.println("\nC:");
        IntStream.of(C).forEach(value -> System.out.printf("%d ", value));
        System.out.println("\nD:");
        IntStream.of(D).forEach(value -> System.out.printf("%d ", value));
        // fim saída formatada
        
        // chama o método solution e printa o valor de cada array
        System.out.println("\nmenor valor em A: " + Solution.solution(A));
        System.out.println("\nmenor valor em B: " + Solution.solution(B));
        System.out.println("\nmenor valor em C: " + Solution.solution(C));
        System.out.println("\nmenor valor em D: " + Solution.solution(D));
    }

    // método para solucionar o problema
    public static class Solution {

        public static int solution(int[] a) {

            List<Integer> list = new ArrayList<>(); // cria um List
            for (int i = 0; i < a.length; i++) {
                list.add(a[i]); // adiciona cada valor do array que veio como argumento no método
            }

            int menor = 1; // variável auxiliar para aumentar o menor valor em cada iteração caso necessário
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (list.contains(menor)) { // caso tenha o "menor" em list 
                    menor++; // incrementa mais 1 na variável menor e continua percorrer a List
                } else { // senão
                    return menor; // retorna o menor valor 
                }
            }
            return menor; // retorna o menor valor 
        }
    }
}
