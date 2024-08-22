import java.util.*;
public class Task2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        float avg;
        System.out.println("Enter the number of subjects:");
        int n=sc.nextInt();
        int[]a=new int[n];
        System.out.println("Enter marks:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
        }
        avg=(float)sum/n;
        System.out.println("Your total marks: "+sum);
        System.out.println("Your average percentage: "+avg);
        if(avg>=90)
        {
            System.out.println("Your grade is S");
        }
        else if(avg>=80)
        {
            System.out.println("Your grade is A");
        }
        else if(avg>=70)
        {
            System.out.println("Your grade is B");
        }
        else if(avg>=60)
        {
            System.out.println("Your grade is C");
        }
        else if(avg>=50)
        {
            System.out.println("Your grade is D");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
