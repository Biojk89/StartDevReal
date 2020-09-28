/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Scanner;

/**
 *
 * @author user
 */
class Task1 {
    
    public void run() {
        
        System.out.println("-----  Задача 1  ------");
        
        
        
        String enteredString;
        double celsTemp, fareTemp;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число градусов по Цельсию: ");
        
        enteredString = scanner.nextLine();
        celsTemp = Integer.parseInt(enteredString);
        
        // решение задачи
        System.out.println("По Фарингейту это будет: ");
        
        fareTemp = celsTemp * 1.8 + 32;
        System.out.println(fareTemp);
        
        
        
        System.out.println("----- конец задачи 1 ------");
    }
}
