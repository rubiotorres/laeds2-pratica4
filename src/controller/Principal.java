/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.*;

/**
 *
 * @author r-torres
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Item item1[] = new Item[10001];
        Item item2[] = new Item[20001];
        Item item3[] = new Item[30001];
        Item item4[] = new Item[40001];
        Item item5[] = new Item[50001];
        Item item6[] = new Item[60001];
        Item item7[] = new Item[70001];
        Item item8[] = new Item[80001];
        Item item9[] = new Item[90001];
        Item item10[] = new Item[100001];

        /*
        // Caso ordenado crescente
        // Inicializando os vetores
        for (int i = 1; i <= 10000; i++) {
            item1[i] = new Item(i);
        }
        
        for (int i = 0; i <= 20000; i++) {
            item2[i] = new Item(i);
        }
        
        for (int i = 0; i <= 30000; i++) {
            item3[i] = new Item(i);
        }
        
        for (int i = 0; i <= 40000; i++) {
            item4[i] = new Item(i);
        }
        
        for (int i = 0; i <= 50000; i++) {
            item5[i] = new Item(i);
        }
        
        for (int i = 0; i <= 60000; i++) {
            item6[i] = new Item(i);
        }
        
        for (int i = 0; i <= 70000; i++) {
            item7[i] = new Item(i);
        }
        
        for (int i = 0; i <= 80000; i++) {
            item8[i] = new Item(i);
        }
        
        for (int i = 0; i <= 90000; i++) {
            item9[i] = new Item(i);
        }
        
        for (int i = 0; i <= 100000; i++) {
            item10[i] = new Item(i);
        }
        
        System.out.println("Caso ordenado\n");
        
        */
        
        /*
        // Caso ordenado decrescente
        // Inicializando os vetores
        for (int i = 10000; i >= 1; i--) {
            item1[i] = new Item(i);
        }
        
        for (int i = 20000; i >= 1; i--) {
            item2[i] = new Item(i);
        }
        
        for (int i = 30000; i >= 1; i--) {
            item3[i] = new Item(i);
        }
        
        for (int i = 40000; i >= 1; i--) {
            item4[i] = new Item(i);
        }
        
        for (int i = 50000; i >= 1; i--) {
            item5[i] = new Item(i);
        }
        
        for (int i = 60000; i >= 1; i--) {
            item6[i] = new Item(i);
        }
        
        for (int i = 70000; i >= 1; i--) {
            item7[i] = new Item(i);
        }
        
        for (int i = 80000; i >= 1; i--) {
            item8[i] = new Item(i);
        }
        
        for (int i = 90000; i >= 1; i--) {
            item9[i] = new Item(i);
        }
        
        for (int i = 100000; i >= 1; i--) {
            item10[i] = new Item(i);
        }
        
        // Ordenando e printando o tempo
        System.out.println("Caso ordenado decrescente\n");
        */
        
        JHeapSort.heapsort(item1, 10000);
        JHeapSort.heapsort(item2, 20000);
        JHeapSort.heapsort(item3, 30000);
        JHeapSort.heapsort(item4, 40000);
        JHeapSort.heapsort(item5, 50000);
        JHeapSort.heapsort(item6, 60000);
        JHeapSort.heapsort(item7, 70000);
        JHeapSort.heapsort(item8, 80000);
        JHeapSort.heapsort(item9, 90000);
        JHeapSort.heapsort(item10, 100000);
        System.out.println("\n\n");
      
        
    }

}
