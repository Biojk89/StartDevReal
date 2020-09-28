/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author user
 */
public class Task5 {
    public void run() {
        
        System.out.println("----- Задача 5 ------");
        
        
        
        Random rand = new Random();
        
        System.out.println("Создаем ДВУХМЕРНЫЙ массив  из 10х5 ячеек типа int, \n"
                + "заполняем его случайными числами и выводим \n"
                + "его значения в цикле");
        int integerArray[][] = new int[10][5];
        for (int i = 0; i < integerArray.length; i++) {
            for (int j = 0; j < integerArray[i].length; j++) {
                integerArray[i][j] = rand.nextInt(100);
            }
        }
        
        for (int i = 0; i < integerArray.length; i++) {
            for (int j = 0; j < integerArray[i].length; j++) {
                System.out.print("[ " + integerArray[i][j] + " ]");
            }
            System.out.println();
        }
        
        
        
        //System.out.println(Arrays.toString(integerArray[4])); // TEST OUTPUT :)
        
        
        
        System.out.println("----- конец задачи 5 ------");
    }
}
