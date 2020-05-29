package Test;

import java.util.Scanner;

public class test02 {
public static void main(String[] args){
    int x;

    System.out.println("Masukan Angka :");
    Scanner scan = new Scanner(System.in);
    x = scan.nextInt();
    if (x %2 ==0){
        System.out.println("Genap");
    }else{
        System.out.println("Ganjil");
      }
    }
}
