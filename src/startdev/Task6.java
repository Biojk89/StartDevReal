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
public class Task6 {
    public void run() {
        
        System.out.println("----- Задача 6 ------");
        
        
        
        Random rand = new Random();
        
        System.out.println("Создаем ДВУХМЕРНЫЙ ЗУБЧАТЫЙ массив  из 10х(5,6,7,8,9)"
                + " ячеек типа int, \nзаполняем его случайными числами и выводим"
                + " \nего значения в цикле");
        int integerArray[][] = new int[10][];
        for (int i = 0; i < integerArray.length; i++) {
            for (int j = 5; j < 14; j++) {
                integerArray[i] = new int[j];
            }        
        }
        
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
        
        
//      for (int i = 0; i < integerArray.length; i++) {
//         System.out.print(Arrays.toString(integerArray[i]));
//      }
        
        
        System.out.println("----- конец задачи 6 ------");
    }
}
