public class Main7 {
        public void fullThrottle(){
            System.out.println("Car is going as fast as it can");
        }
        public void speed(int maxSpeed){
            System.out.println("Max speed "+ maxSpeed);
        }

        public static void main(String[] args) {
            Main7 obj=new Main7();
            obj.fullThrottle();
            obj.speed(200);
        }
}
