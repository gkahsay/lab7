package Assignment6;

import java.util.Scanner;

public class num1 {
    public static void main(String[] args){
        //a
       int x=0,y=0,a=0,b =0;
        /*for(int i=10;i>0;i++){//i++ should --i;
            x = y;//we need to diclare first all the variables
            a = b;
            System.out.println(i);
        }*/

       //b
       /*int sum =0;
        int num=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any numbers");
        do{

            num = scanner.nextInt();//num needs to declare
            //System.out.println(num);
            //System.out.println(sum);
            sum+=num;
        }while(sum>10000);
        *///instead of until should be while and should be sum<10000
        //1-c
       // while(x<1 && x>10){//it is always false

         //   a=b;

       // }
       //1-d
        while(a==b);
        {//no need semicolon and is infinite loop we need to fix to stop running
            a = b;
            x = y;

        }
    }
}
