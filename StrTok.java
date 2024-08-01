import java.util.StringTokenizer;
public class StrTok{
    public static void main(String[]args){
        StringTokenizer str= new StringTokenizer("my name is ishita"," ");

        while(str.hasMoreTokens()){
            System.out.println(str.nextToken());
        }
    }
}