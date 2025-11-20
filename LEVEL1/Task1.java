package LEVEL1;
import java.util.*;

public class Task1 {
    public double celciusToFarenheit(double c){
        return (c*9/5)+32;

    }
    public double farenheitToCelcius(double f){
        return(f-32)*5/9;
    }

    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       Task1 obj =new Task1();
       System.out.println("Enter Tempereture Value: ");
       double temp=sc.nextDouble();
       System.out.println("Enter unit (c/f) ");
       char unit =sc.next().charAt(0);
       if(unit=='C'|| unit=='c'){
        double result=obj.celciusToFarenheit(temp);
        System.out.println("Temperature in Farenheit:"+result+"F");

       }
       else if(unit=='F'|| unit =='f'){
        double result=obj.farenheitToCelcius(temp);
        System.out.println("Temperature in Celcius:"+result+"C");
       }
       else{
        System.out.println("Enter The Correct Unit c/f ");
       }
       sc.close();


       
    }
    
}
