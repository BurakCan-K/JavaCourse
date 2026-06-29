public class Car {

    //Fields
    String name;
    String model;
    String color;
    String engine;
    int horsePower;
    int speed;
    boolean fuel;
    boolean engineOn;

    //Method
    public void engineStart(){
        engineOn = true;
        System.out.println(name+ model + color + "car is engine on");
    }

    public void engineStop(){
        engineOn = false;
        System.out.println(name+ model + color + "car is engine off");
    }

    public void speedUp(int value){
        speed += value;
        System.out.println("Speed: " + speed +"km/h");
    }
}
