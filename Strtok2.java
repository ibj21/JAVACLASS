import java.util.StringTokenizer;
public class Strtok2{
    public static void main(String[]args){
        StringTokenizer str= new StringTokenizer("my,name,is,ishita");

        System.out.println(str.nextToken(","));
    }
}