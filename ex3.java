public class ex3{
    public static void main(String[] args) {
        Student[] students= new Student[] {new Student("Dharma"), new Student("Sanvi"), new Student("Rupa"), new Student("Ajay")};

        for(Student m: students){
            System.out.println(m);
        }
    }

}

class Student{
    public String name;
    Student(String name){
        this.name=name;
    }

    public String toString(){
        return name;
    }
}