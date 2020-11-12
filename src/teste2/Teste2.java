/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Regis Maximo
 */
public class Teste2 {
    
    public static void main(String[] args) {
        
        int x = 8; // valor da soma para ser encontrado
        int[] array = {-1, -2, 2, 0, 4, 0, 7, 8, 9, 9};
        Arrays.sort(array); // ordena o array em ordem ascendente 
        List<Integer> sortedArray = new ArrayList<>();
        
        sortedArray = sortArray(array, sortedArray); // armazena o array em um List
        System.out.println(sortedArray); // printa o array classificado
        
        encontrarSoma(sortedArray, x); // encontra as somas
    }

    // método para ordenação
    private static List<Integer> sortArray(int[] array, List<Integer> sortedArray) {
        Arrays.sort(array);
        for(int a : array)
            sortedArray.add(a);
        
        return sortedArray;
    }
    
    // método para encontrar as somas correspondentes a "x" no caso 8
    private static void encontrarSoma(List<Integer> sortedArray, int x) {
        int i = 0; // auxiliar para caminhar no array
        int j = (sortedArray.size()) - 1 ; // pega o tamanho do array -1 do tamanho
        
        System.out.printf("["); // saída formatada
        while(i <= j) {
            if((sortedArray.get(i) + sortedArray.get(j)) == x) {
                System.out.printf("[%d, %d]%s", sortedArray.get(i), sortedArray.get(j), (i < j) ? ", " : "\n");
                i++;
                j--;
            } else if((sortedArray.get(i) + sortedArray.get(j)) > x) {
                j--;
            } else {
                i++;
            }
        }
        System.out.printf("]"); // saída formatada
        
    }
}
