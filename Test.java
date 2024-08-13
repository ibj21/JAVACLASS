/**
 * Animal
 */ 
 interface Animal {
    public void animalsound();
    public void sleep();
    
}

class Pig implements Animal{
    public void animalsound(){
        System.out.println("pig says wee wee");
    }
    public void sleep(){
        System.out.println("zzz");
    }

}


public class Test {
    public static void main(String[] args) {
        Pig obj= new Pig();
        obj.animalsound();
        obj.sleep();
    }
}
