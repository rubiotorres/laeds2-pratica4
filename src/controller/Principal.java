/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.*;
import java.util.*;

/**
 *
 * @author r-torres, MarceloFCandido, gabrieldutra
 */
public class Principal {

    private static void insereElementosAleatorios(List<Item> lista, Item[] v) {
        Random random = new Random();
        int i = 1;
        while (!lista.isEmpty()) {
            int indiceAleatorio = random.nextInt(lista.size());
            Item itemAleatorio = lista.get(indiceAleatorio);
            v[i] = itemAleatorio;
            lista.remove(itemAleatorio);
            i++;
        }
    }
    
    private static List<Item> criaListaOrdenada(int inicio, int quantidade) {
        ArrayList<Item> lista = new ArrayList<>();
        for (int i = inicio; i < inicio + quantidade; i++) {
            lista.add(new Item(i));
        }
        return lista;
    }
    
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
        
        // Para o caso aleatorio
        List<Item> item01 = criaListaOrdenada(0, 10000);
        List<Item> item02 = criaListaOrdenada(0, 20000);
        List<Item> item03 = criaListaOrdenada(0, 30000);
        List<Item> item04 = criaListaOrdenada(0, 40000);
        List<Item> item05 = criaListaOrdenada(0, 50000);
        List<Item> item06 = criaListaOrdenada(0, 60000);
        List<Item> item07 = criaListaOrdenada(0, 70000);
        List<Item> item08 = criaListaOrdenada(0, 80000);
        List<Item> item09 = criaListaOrdenada(0, 90000);
        List<Item> item010 = criaListaOrdenada(0, 100000);
        
        // Criando os vetores aleatorios
        insereElementosAleatorios(item01, item1);
        insereElementosAleatorios(item02, item2);
        insereElementosAleatorios(item03, item3);
        insereElementosAleatorios(item04, item4);
        insereElementosAleatorios(item05, item5);
        insereElementosAleatorios(item06, item6);
        insereElementosAleatorios(item07, item7);
        insereElementosAleatorios(item08, item8);
        insereElementosAleatorios(item09, item9);
        insereElementosAleatorios(item010, item10);
        
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
        
        
        System.out.println("Caso ordenado decrescente\n");
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
