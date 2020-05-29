package Test;

import java.util.Scanner;

public class test03 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int i=1;
        double jum=0;
        double rata=0;
        int max=0,min=1000;

        while(i>=1){
            int jml=i+1;
            int[] tampung =new int[jml];

            System.out.print("Masukan data ke-"+i+" [ketik 0 untuk stop] = ");
            tampung[i] = in.nextInt();

            jum=tampung[i]+jum;
            if (tampung[i] > max){
                max = tampung[i];
            }
            if(tampung[i]==0){
                break;
            }
            if (( tampung[i] <


                    min)&&(tampung[i]>=1)){
                min = tampung[i];
            }
            i++;
        }
        if(i==1){
            System.out.println("mohon isikan data");
            System.exit(0);
        }
        rata=jum/(i-1);
        System.out.println("Total: "+jum);
        System.out.println("Rata-rata: "+rata);
        System.out.println("Angka terkecil: "+min);
        System.out.println("Angka terbesar: "+max);
    }
}
