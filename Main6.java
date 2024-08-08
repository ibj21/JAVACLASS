public class Main6 {
    static void myStaticMethod(){
        System.out.println("called without creating objects");
    }

    public void myPublicMethod(){
        System.out.println("called after creating objects");
    }
    public static void main(String[] args) {
        myStaticMethod();
        Main6 obj= new Main6();
        obj.myPublicMethod();
    }
}
