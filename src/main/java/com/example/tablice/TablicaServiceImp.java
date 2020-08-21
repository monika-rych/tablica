package com.example.tablice;

import org.springframework.stereotype.Service;

@Service
public class TablicaServiceImp implements TablicaService {


    @Override
    public void printElementsOfTwoDimensionalArray(int[][] tablica) {
        //System.out.println(tablica[0][0]);
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica.length; j++) {
                System.out.println(tablica[i][j]);
            }
        }
    }

    @Override
    public int[][] generateArrayValues() {
        int[][] tablica = new int[3][3]; //new prze intem przy tworzeniu tablicy
        int liczba = 1;
        //int liczbaDoPotegi = Math.pow(liczba,2);
        for (int i = 0; i < tablica.length; i++) {
            int temp = liczba;//poczatkowa wartosc dla kolejnej wartosci tablicy
            for (int j = 0; j < tablica.length; j++) {
                tablica[i][j] = temp;
                temp = (int) Math.pow(temp, 2);
            }
            liczba++;
        }
        return tablica;
    }

    @Override
    public int[][][] generateValues() {
        int [][][] tablica = new int [3][3][3];
        int liczba = 1;
        for (int i = 0; i < tablica.length; i++) {
            int temp = liczba;
            for (int j = 0; j < tablica.length ; j++) {
                int temp2 = temp;
                for (int k = 0; k < tablica.length; k++) {
                    tablica[i][j][k] = temp2;
                    temp2 = (int) Math.pow(temp2,2);
                }
            }
            liczba++;
        }
        return tablica;
    }

    @Override
    public void printElementsOfThreeDimensionalArray(int[][][] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica.length; j++) {
                for (int k = 0; k < tablica.length; k++) {
                    System.out.println(tablica[i][j][k]);
                }
            }
        }
    }
}
