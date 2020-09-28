/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Task7 {
    public void run() {
        
        
        
        System.out.println("----- Задача 7 ------");
        
        Scanner scanner = new Scanner(System.in);
        String enteredString, enteredLetter;
        int n = 0;
        
        System.out.println("Введите строку");
        enteredString = scanner.nextLine();
        // посчитайте сколько раз в строке встречается введенная вами буква
        System.out.println("Введите букву: ");
        enteredLetter = scanner.nextLine();
        
        String[] letters = enteredString.split("(?!^)");
        
        for (String l : letters) {
            if (l.equals(enteredLetter)) {
                n++;
            }
        }
        
        
        System.out.println(Arrays.toString(letters));
        System.out.println("Буква \"" + enteredLetter + "\" встречается в тексте " + n + " раз");
        
        
        
        System.out.println("----- конец задачи 6 ------");
    }
}
