public class Testing {
    public static void main(String[] args) {
        Outerclass out= new Outerclass();
        Outerclass.Innerclass in= out.new Innerclass();
        System.out.println(in.y+out.x);
    }
}

class Outerclass{
    int x=10;
    //nesting of classes
class Innerclass{
    int y=5;
}
}
