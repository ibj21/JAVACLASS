class Animal{
void eat(){
System.out.println("eating");
}
}
class Dog extends Animal{
void bark(){
System.out.println("barking");
}
}

class BabyDog extends Dog{
void weep(){
System.out.println("weeping");
}
}
class Test{
public static void main(String [] args){
BabyDog obj=new BabyDog();
obj.eat();
obj.bark();
obj.weep();
}
}