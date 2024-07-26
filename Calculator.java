import java.util.Scanner;
public class Calculator{
    public static void main(String[]args){
        int choice;
        int num1;
        int num2;
        while (true){
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter your choice: \n1. FOR ADD, \n2. FOR SUBTRACTING, \n3. FOR MULTIPLCATION, \n4. FOR DIVISION, \nANY OTHER KEY TO EXIT");
            choice=scan.nextInt();
            switch(choice){
                case 1: System.out.println("Addition");
                        System.out.println("Enter the numbers");
                        num1=scan.nextInt();
                        num2=scan.nextInt();
                        System.out.println(num1+num2);
                break;
                
                case 2:System.out.println("Subtraction");
                System.out.println("Enter the numbers");
                        num1=scan.nextInt();
                        num2=scan.nextInt();
                        if(num1>num2)
                        System.out.println(num1-num2);
                        else
                        System.out.println(num2-num1);
                break;
                
                case 3:System.out.println("Multiplication");
                System.out.println("Enter the numbers");
                        num1=scan.nextInt();
                        num2=scan.nextInt();
                        System.out.println(num1*num2);
                break;
                
                case 4:System.out.println("Division");
                System.out.println("Enter the numbers");
                        num1=scan.nextInt();
                        num2=scan.nextInt();
                        if(num1>num2)
                        System.out.println(num1/num2);
                        else
                        System.out.println(num2/num1);
                break;
                
                default: System.out.println("Exiting");
                System.exit(0);
            }
        }
    }
}

