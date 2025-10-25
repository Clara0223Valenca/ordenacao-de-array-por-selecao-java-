//ordena de forma crescente um array de inteiros
// 19/10/2025

import java.util.Scanner;

public class Ordena{

    public static void main(String[] args) {
        
        int[] array = new int [10];
        Scanner scanner = new Scanner(System.in);

        // 1. Preenche o array
        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite um número para a posição " + i + ": ");
            array[i] = scanner.nextInt();
        }

        // 2. Algoritmo de Ordenação por Seleção (Selection Sort)
        for (int i = 0; i < array.length - 1; i++) {
            // Assume que o elemento atual é o menor
            int indiceMenor = i;
            
            // Procura pelo menor elemento no restante do array
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[indiceMenor]) {
                    indiceMenor = j;
                }
            }

            // Se o menor elemento não estiver na posição 'i', ele troca
            if (indiceMenor != i) {
                int temp = array[i];
                array[i] = array[indiceMenor];
                array[indiceMenor] = temp;
            }
        }

        // 3. Imprimi na tela
        System.out.println("\nArray Ordenado:");
        for (int valor : array) {
            System.out.println(valor);
        }
        
        scanner.close();
    }
}