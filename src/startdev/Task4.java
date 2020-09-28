/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author user
 */
public class Task4 {
    public void run() {
        
        System.out.println("----- Задача 4 ------");
        
        
        
        Random rand = new Random();
        int randomNumber;
        
        System.out.println("Создаем одномерный массив  из 10 ячеек типа int, \n"
                + "заполняем его случайными ЧЕТНЫМИ числами и выводим \n"
                + "его значения в цикле");
        int integerArray[] = new int[10];
        for (int i = 0; i < integerArray.length; i++) {
            do {
                randomNumber = rand.nextInt(100 - 0 + 1) + 0;
            } while (randomNumber % 2 == 1);
            integerArray[i] = randomNumber;
        }
        
        for (int i = 0; i < integerArray.length; i++) {
            System.out.println(i + ". " + integerArray[i]);
        }
        
        //System.out.println(Arrays.toString(integerArray)); // TEST OUTPUT :)
        
        
        
        System.out.println("----- конец задачи 4 ------");
    }
}
