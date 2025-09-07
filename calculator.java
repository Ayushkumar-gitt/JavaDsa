import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter yes if u want to use calculator else enter no ");
        String resume = sc.nextLine();
        float result = 0;
        if (resume.equals("yes")) {
        System.out.println("Enter the operation you want to perform ");

        String operator  = sc.next();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        switch (operator) {
            case "/":
                result = num1/num2;
                System.out.println(result);
                break;
            case "*":
                result = num1*num2;
                System.out.println(result);
                break;
            case "-":
                result = num1-num2;
                System.out.println(result);
                break;
            case "+":
            result = num1+num2;
            System.out.println(result);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
        
    }else{
        System.out.println("Quitted");
    }
        
    }
}
