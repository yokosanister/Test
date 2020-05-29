package Test;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nilai;
        String hasil;

        System.out.println("Masukan angka:");
        nilai = scan.nextInt();

        if (nilai >= 90) {
            System.out.println("Nilai anda adalah A");
        } else if (nilai >= 80 && nilai <= 89) {
            System.out.println("Nilai anda adalah B");
        } else if (nilai >= 70 && nilai <= 79) {
            System.out.println("Nilai anda adalah C");
        } else if (nilai >= 60 && nilai <= 69) {
            System.out.println("Nilai anda adalah D");
        } else if (nilai <= 59) {
            System.out.println("Nilai anda adalah E");
        }

    }
}