package Tugas;

import java.util.Scanner;

public class TotalBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("N tidak boleh nol atau minus");
        } else {
            int total = 0;
            for (int i = 1; i <= n; i++) {
                System.out.print("Masukkan bilangan ke-" + i + ": ");
                int bilangan = scanner.nextInt();
                total += bilangan;
            }
            System.out.println("Total: " + total);
        }

        scanner.close();
    }
}