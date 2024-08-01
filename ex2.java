class Student {
    public int roll;
    public String name;
    Student(int roll, String name){
        this.roll=roll;
        this.name=name;
    }
}

public class ex2 {
    public static void main(String[] args) {
        Student arr[]=new Student[3];
        arr[0]=new Student(10,"ish");
        arr[1]=new Student(40,"sau");
        arr[2]=new Student(20,"so");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].roll+" "+arr[i].name);
        }
    }
}
