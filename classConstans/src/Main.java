
public class Main {
    public static void main(String[] args) {

        new Student("Ahmet");
        new Student("Mehmet");

        System.out.println(Student.numberOfStudent); // 2

        new Student("MehmetEmin");
        System.out.println(Student.numberOfStudent);




    }
}