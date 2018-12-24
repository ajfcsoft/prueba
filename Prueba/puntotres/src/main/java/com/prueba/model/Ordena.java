/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.model;

/**
 *
 * @author Antonio
 */
public class Ordena {
    private int[] arreglo;

    public Ordena() {
    }

    public Ordena(int[] arreglo) {
        this.arreglo = arreglo;
    }

    public int[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(int[] arreglo) {
        this.arreglo = arreglo;
    }
    
    public int ordenar(){
        int i, j, menor=0, aux, cont = 0, p=0;
        for(i=0; i<arreglo.length; i++){
            menor = arreglo[i];
            for(j=i+1; j<arreglo.length; j++){
                if(arreglo[j] < menor){
                    p = j;
                    menor = arreglo[j];
                }
            }
            if(menor < arreglo[i]){
                cont++;
                aux = arreglo[i];
                arreglo[i] = arreglo[p];
                arreglo[p] = aux;
            }
        }
        return cont;
    }
}