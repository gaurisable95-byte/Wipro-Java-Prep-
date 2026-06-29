import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Select: 1.Add 2.Sub 3.Mul 4.Div 5.Mod");
        int choice = sc.nextInt();
        
        switch(choice) {
            case 1: System.out.println("Result = " + (a + b)); break;
            case 2: System.out.println("Result = " + (a - b)); break;
            case 3: System.out.println("Result = " + (a * b)); break;
            case 4: 
                if(b != 0) System.out.println("Result = " + (a / b));
                else System.out.println("Error: Division by zero");
                break;
            case 5: System.out.println("Result = " + (a % b)); break;
            default: System.out.println("Invalid choice. Select 1-5");
        }
        sc.close();
    }
}
