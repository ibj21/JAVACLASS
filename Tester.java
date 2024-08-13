abstract class Animal {
    public abstract void animalsound();
    public void sleep(){
        System.out.println("zzz");
    }
}

class Pig extends Animal{
    public void animalsound(){
        System.out.println("pig says wee wee");
    }
}

public class Tester{
    public static void main(String[] args) {
        Pig obj= new Pig();
        obj.animalsound();
        obj.sleep();
    }
}
