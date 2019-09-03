package by.it.zavadski.jd01_02;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mas=new int[10];
        for (int i = 0; i <mas.length ; i++) {
            //System.out.print("Enter number "+i);
            mas[i]=sc.nextInt();

        }
       step1(mas);
        step2(mas);
        step3(mas);

    }


    private static void step1(int[] mas) {
    int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;
        for (int element : mas) {
            if (min >element){
                min=element;
            }
            if (max < element){
                max=element;
            }
        }
        System.out.println(min + " " +max);
    }

    private static void step2(int[] mas) {
    double sum=0;
    for (int element : mas) {
        sum+=element;
    }
    double avg=sum/mas.length;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < avg) {
                System.out.println(mas[i] + " ");
            }

        }
        System.out.println();
    }

    private static void step3(int[] mas) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int element : mas) {
            if (min > element){
                min=element;
        }
            for (int i = mas.length-1;i>=0; i--) {
                if (min==mas[i]) {
                    System.out.print(i +" ");
                }

            }

    }
}

}
