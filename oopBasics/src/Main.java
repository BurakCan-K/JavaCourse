
public class Main {
    public static void main(String[] args) {


        //create object

        Car car1 = new Car();
        Car car2 = new Car();

        //assigning properties to objects

        car1.name="Ford";
        car1.model="GT500";
        car1.color="black";
        car1.speed=0;

        //usage

        car1.engineStart();


        car1.speedUp(100);


        car1.engineStop();


    }
}