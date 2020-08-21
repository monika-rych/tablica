package com.example.tablice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.stream.Stream;

@SpringBootApplication
public class TabliceApplication {

    //@Autowired
    //TablicaService tablicaService;

    public static void main(String[] args) {
        SpringApplication.run(TabliceApplication.class, args);

        TablicaService tablicaService = new TablicaServiceImp();
        Integer[]tablica = new Integer[3];

        //int[][]tablica = new int [3][3];
        int [][]tablica1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] tablica2 = tablicaService.generateArrayValues();
        int[][][] tablica3 = tablicaService.generateValues();

        //tablicaService.printElementsOfTwoDimensionalArray(tablica2);

        tablicaService.printElementsOfThreeDimensionalArray(tablica3);
        Stream<Integer> streamZTablicy = Arrays.stream(tablica);
        Stream <int[]> streamZTablicy1 = Arrays.stream(tablica1);
        Stream<int[][]> streamZTablicy3 = Stream.of(tablica3);
    }

}
