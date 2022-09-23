package Demo;

import java.sql.SQLOutput;

public class Addition {


       private double sum(int a,double b){
           double sum=a+b;
           return sum;

       }
       public static void main(String[]args ){
           Addition add=new Addition();
           double sum=add.sum(7,7.5);
           System.out.println(sum);
       }
}


