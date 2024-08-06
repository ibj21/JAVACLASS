public class ex6 {
    public static void main(String[] args) {
        int [][] arr= new int [10][20];
        arr[9][15]=1;
        for(int i=0; i<10; i++){
        for(int j=0; j<20; j++)
        System.out.print(arr[i][j]);
        System.out.println();
    }
    }
}
