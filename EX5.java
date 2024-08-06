public class EX5 {
    public static void main(String[] args) {
        int [] arr = new int[4];
        arr[0]=2;
        arr[1]=3;
        arr[2]=6;
        arr[3]=7;
        System.out.println("trying to access element outside array");
        arr[5]=2;
    }
}
