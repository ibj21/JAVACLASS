import java.util.Scanner;
class Array {
    public static void main(String[] args) {
        System.out.println("Enter array length");
        int len;
        Scanner scan=new Scanner(System.in);
        len=scan.nextInt();
        int[] arr= new int[len];
        for(int i=0; i<len; i++){
            arr[i]=scan.nextInt();
        }
        
        int i=0;
        int j=0;
        for(i=0; i<len ;i++){
            for(j=0; j<len-i-1; j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        
        System.out.println(arr[2]);
    }
}
