public class Bird extends Animal {




    public Bird(String name, int age) {
        super(name, age);
    }


    @Override
    public void eat() {
        super.eat();
        System.out.println("Bird is eating");
    }




}
