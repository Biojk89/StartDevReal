/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Task2 {
    public void run() {
        
        System.out.println("----- Задача 2 ------");
        
        
        
        String enteredString;
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber, enteredNumber;

        System.out.println("Загадано число от 5 до 10: ");
        randomNumber = rand.nextInt(10 - 5 + 1) + 5;

        System.out.println("Отгадай: ");
        
        enteredString = scanner.nextLine();
        enteredNumber = Integer.parseInt(enteredString);
        
        if (enteredNumber == randomNumber) {
            System.out.println("Ты выиграл");
        } else {
            System.out.println("Ты проиграл, я загадал " + randomNumber);
        }
       
        
        
        System.out.println("----- конец задачи 2 ------");
    }
   
}
