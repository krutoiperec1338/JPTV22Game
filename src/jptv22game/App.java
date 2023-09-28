/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv22game;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
    private Scanner scanner;
    
    public App() {
        this.scanner = new Scanner(System.in);
    }
    void run() {
        boolean repeat = true;
        do{
            System.out.println("---Игра--- ");
            System.out.println("Угадайте число");
            System.out.println("1. Конвертер температуры");
            System.out.println("2. Парсер числа");
            System.out.println("№ задачи: ");
            int task = this.scanner.nextInt();scanner.nextLine();
            switch (task) {
                case 0:
                    System.out.println("Выбран выход из программы");
                    break;
                case 1:
                    System.out.println("Выбрана задача 1");

                    break;
                case 2:
                    System.out.println("Выбрана задача 2");

                    break;
                default:
                    System.out.println("Выбирите номер из списка задач!");
                    break;
            }
        }while(repeat);
    }
}
