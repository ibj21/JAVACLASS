class Car extends Vehicle{
    private String modelName="Mustang";
    public static void main(String[] args) {
        Car mCar= new Car();
        mCar.honk();
        System.out.println(mCar.brand +" "+ mCar.modelName);
    }
}