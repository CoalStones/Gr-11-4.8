
package ch4ex8;
import java.util.Scanner;

public class Ch4Ex8 {

    public static void main(String[] args) {
        int num1,num2;
        
        //getting the variables
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number");
        num1=input.nextInt();
        System.out.println("Please enter a second number");
        num2=input.nextInt();
        input.close();
        
        //math
        
        System.out.println(num1+"/"+num2+"="+num1/num2);
        System.out.println(num1+"%"+num2+"="+num1%num2);
        System.out.println(num2+"/"+num1+"="+num2/num1);
        System.out.println(num2+"%"+num1+"="+num2%num1);
    }
    
}
