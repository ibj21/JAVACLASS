public class Star {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        for(i=0;i<8;i++){
            for(j=0;j<23;j++){
                if((i==0 || i==7))
                System.out.print("*");
                else{
                    if(j==0 || j==22)
                    System.out.print("*");
                    else 
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
