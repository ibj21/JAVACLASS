import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        int lower;
        int higher;
        Scanner scan=new Scanner(System.in);
        Armstrong obj=new Armstrong();
        System.out.println("enter lower range");
        lower=scan.nextInt();
        System.out.println("enter higher range");
        higher=scan.nextInt();
        while(lower<=higher){
            if(obj.isArmstrong(lower))
            System.out.println(lower);
            lower++;
        }
    }

    public boolean isArmstrong(int num){
        int copy=num;
        int sum=0;
        while(copy>0){
            int digit=copy%10;
            sum=sum+(digit*digit*digit);
            copy/=10;
        }
        if(num==sum)
        return true;
        else 
        return false;
    }
}
