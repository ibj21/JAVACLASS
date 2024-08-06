public class Test{
    public static void main(String[] args) {
        int arr[]={3,1,2,4,5};
        sum (arr);
    }
    public static void sum(int [] arr){
        int i=0;
        int sum=0;
        for(i=0; i<5; i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}