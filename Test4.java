public class Test4 {
    public static void main(String[] args) {
        int intArray[] ={1,2,3};
        int cloneArray[]=intArray.clone();
        //will print false as deep copy is created for 1D array
        System.out.println(intArray==cloneArray); 
        for (int i = 0; i < cloneArray.length; i++) {
            System.out.println(cloneArray[i]);
        }
    }
}
