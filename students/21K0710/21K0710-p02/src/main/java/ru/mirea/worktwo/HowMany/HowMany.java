package ru.mirea.worktwo.HowMany;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слова одной строкой через пробел");
        String line = sc.nextLine();
        int k = 0;

        if (line.length() != 0) {
            k++;
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == ' ') {
                    k++;
                }
            }
        }

        System.out.println("Вы ввели " + k + "слов");
    }
}
