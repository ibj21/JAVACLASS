public class Test5 {
    public static void main(String[] args) {
        int intArray[][] ={{1,2,3},{4,5}};
        int cloneArray[][]=intArray.clone();
        //will print false
        System.out.println(intArray==cloneArray); 

        //will print true as shallow copy is created
        // sub array shared
        System.out.println(intArray[0]==cloneArray[0]);  System.out.println(intArray[1]==cloneArray[1]); 
    }
}
