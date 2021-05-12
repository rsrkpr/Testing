import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String[] args) throws Exception{
        System.out.println("Hello Calculator"); 
        Calculator c = new Calculator();
        
        BufferedReader my_reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1St Number :"); 
        int number1 = Integer.parseInt(my_reader.readLine());
        System.out.println("2nd Number :"); 
        int number2 = Integer.parseInt(my_reader.readLine());
        int sum = c.add(number1, number2);
        System.out.println("Sum of " + number1 + " and " + number2 + " is : " + sum); 
    }
    
    public int add(int num1, int num2){
        return num1 + num2;
    }
}