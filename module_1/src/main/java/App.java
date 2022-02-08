import java.util.*;

import static javax.management.Query.div;

public class App {
    public static void main(String[] args)
    {
        System.out.println("Enter any Two Integers :");
        Scanner sc= new Scanner(System.in);
        Calculator calculator = new Calculator();
        int a=sc.nextInt();
        int b= sc.nextInt();
        calculator.add(a,b);
        calculator.sub(a,b);
        calculator.prod(a,b);
        calculator.div(a,b);
    }
}