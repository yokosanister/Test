package Test;

import java.util.Scanner;

public class test08 {
    public static void main(String[] args) {

       int data;
       int jumlah =0;

       Scanner masukan =new Scanner(System.in);

       do {
           System.out.println("Masukan Angka (program berhenti bila anda masukan =)");
           data=masukan.nextInt();
           jumlah += data;
       }while (data == '=');
        System.out.println("Jumlah adalah "+jumlah);
    }
}
