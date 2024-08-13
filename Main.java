class Animal {
    public void animalSound(){
        System.out.println("the animal makes a sound");
    }
}



class Pig extends Animal {
    public void animalSound(){
        System.out.println("pig makes wee wee");
    }
}

class Dog extends Animal {
    public void animalSound(){
        System.out.println("dog says bow wow");
    }
}


public class Main {
    public static void main(String[] args) {
        Animal obj = new Animal();
        Animal dog= new Dog();
        Animal pig= new Pig();
        obj.animalSound();
        pig.animalSound();
        dog.animalSound();
    }
}
