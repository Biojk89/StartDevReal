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
public class Task3 {
    public void run() {
        
        System.out.println("----- Задача 3 ------");
        
        
        
        Random rand = new Random();
        int summ = 0, min = 101, max = 0;
        
        System.out.println("Создаем одномерный массив  из 10 ячеек типа int, \n"
                + "заполняем его случайными числами и выводим \n"
                + "его значения в цикле");
        int integerArray[] = new int[10];
        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] = rand.nextInt(100 - 0 + 1) + 0;
        }
        
        System.out.print("Сумма всех чисел массива: ");
        for (int i = 0; i < integerArray.length; i++) {
            summ += integerArray[i];
            if (integerArray[i] < min) {
                min = integerArray[i];
            }
            if (integerArray[i] > max) {
                max = integerArray[i];
            }
            
        }
        System.out.println(summ);
        
        
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        
        //System.out.println(Arrays.toString(integerArray)); // TEST OUTPUT :)
        
        
        
        System.out.println("----- конец задачи 3 ------");
    }
}
