package Test;

import java.util.Scanner;

public class test04 {
    public static void main(String[] args) {
        test04 lati1 = new test04();
        Scanner scn = new Scanner(System.in);
        System.out.println("Input Your Word : ");
        String str = scn.nextLine();

        lati1.balik(str);
    }

    public void balik(String str) {

        String status = "palindrom";
        String oke = str.toLowerCase();
//		int count = 0;
        int balik = str.length()-1;
        for(int i=0; i<oke.length(); i++) {
            //System.out.println(str.charAt(i)+" = "+str.charAt(balik));
            if(oke.charAt(i)!=oke.charAt(balik)) {
                status = "bukan palindrom";

            }
            balik--;
        }System.out.println(status);
    }
}
