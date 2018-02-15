package com.company;
import java.util.Scanner;

public class Main {

    public static double average(int[] marks) {
        int sum = 0;

        for(int i=0; i<marks.length; i++) {
            sum += marks[i];
        }

        return sum/(double)marks.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę ocen:");
        int ratings = scanner.nextInt();
        int[] rating = new int[ratings];

        double suma=0;
        for (int i=0; i<ratings; i++) {
            System.out.println("Podaj ocenę nr "+(i+1)+": ");
            rating[i] = scanner.nextInt();
            suma=suma+rating[i];
        }

        double wynik = suma/ratings;
        System.out.println("Średnia arytmetyczna z podanych ocen wynosi: "+(double)wynik);
    }
}
