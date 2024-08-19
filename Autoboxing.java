public class Autoboxing{
    public static void main(String[] args) {
        int a=20;
        //converting int to Integer Wrapper class
        Integer i= Integer.valueOf(a);
        Integer j=a;
        System.out.println(j);
        System.out.println(i);
        System.out.println(a);
    }
}