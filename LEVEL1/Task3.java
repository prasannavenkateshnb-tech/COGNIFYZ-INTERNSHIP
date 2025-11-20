package LEVEL1;
import java.util.*;

public class Task3 {
    public double avarageGradeCalculator(int[] grades){
        int sum=0;
        for(int i:grades){
            sum+=i;
        }
        return (double) sum/grades.length;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Task3 obj =new Task3();
        System.out.println("Enter No.of grades");
        int N=sc.nextInt();
        int[] grades=new int[N];
        for(int i=0;i<N;i++){
            System.out.println("Enter Grade"+(i+1)+":");
            grades[i]=sc.nextInt();
        }
        double average=obj.avarageGradeCalculator(grades);
        System.out.println("The Average grade is "+ average);
        

    }
    
}
