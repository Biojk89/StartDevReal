/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
    
    public void run() {
        String enteredTask;
        
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Выберите задачу от  1 до 7, 0 для выхода: ");
            enteredTask = scanner.nextLine();

            switch (enteredTask) {
                case "1":
                    Task1 task1 = new Task1();
                    task1.run();
                break;
                case "2":
                    Task2 task2 = new Task2();
                    task2.run();
                break;
                case "3":
                    Task3 task3 = new Task3();
                    task3.run();
                break;
                case "4":
                    Task4 task4 = new Task4();
                    task4.run();
                break;
                case "5":
                    Task5 task5 = new Task5();
                    task5.run();
                break;
                case "6":
                    Task6 task6 = new Task6();
                    task6.run();
                break;
                case "7":
                    Task7 task7 = new Task7();
                    task7.run();
                break;

            }
        } while (!enteredTask.equals("0"));
    }
}
