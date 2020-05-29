package Test;

import java.util.Scanner;

public class test05 {
    public static void main(String[] args) {
                Scanner input=new Scanner(System.in);

                int pilihan, awal, akhir;

                System.out.println("PROGRAM MENAMPILKAN DERET TAHUN KABISAT");
                System.out.println("-------------------------------------------------");
                System.out.print("Masukan Tahun Awal : ");
                awal=input.nextInt();
                System.out.print("Masukan Tahun Akhir : ");
                akhir=input.nextInt();
                System.out.println("--------------------------- ");


                        System.out.println("Deret Tahun Kabisat");
                        for(int i=awal;i<=akhir;i++){
                            if (i%400==0)
                                System.out.print(i+" ");
                        }
                System.out.println("");
    }
}
