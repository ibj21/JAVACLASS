import java.util.StringTokenizer;
public class Strtok3{
    public static void main(String[]args){
        StringTokenizer str= new StringTokenizer("my name is ishita"," ");
        System.out.println(str.countTokens());
        while(str.hasMoreElements()){
            System.out.println(str.nextElement());
        }
        System.out.println(str.countTokens());

    }
}