import java.util.Scanner;

public class MyMain {
    
    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        double n = Math.random();
        while(Math.abs(n - (n + x/n) / 2 )> 0.00001){
            n = (n + x/n) / 2;
        }
        
        return n;
    }

    // Calculates the factorial of a number
    public static double factorial(int x) {
        int n = 1;
        while(x>0){
            n = x*n;
            x -= 1;
        }
        return n;
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        double E_0 = 1;
        int n = 1;
        while(Math.E - E_0 > 0.00000000001){
            E_0 += 1/factorial(n);
            n += 1;
        }
        return E_0;
    }
    
    
    public static void main(String[] args) {
        System.out.println("Enter a positive number!");
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        System.out.println("The squareroot of "+ x +" is "+babylonian(x));
        System.out.println("The value of e is roughly : "+calculateE());
        scan.close();
    }
}
