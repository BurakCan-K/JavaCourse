package constructor;

public class User {

    private final String email;
    private final String password;


    //Constructor
    public User(String email, String password) {
        this.email = validateEmail(email);
        this.password = password;
    }

    //Constructor overloading
    public User(String email) {
        this.email = validateEmail(email);
    }




    //Validation
    private String validateEmail(String email) {
     if (email == null || email.contains("@")) {
         throw  new IllegalArgumentException("Invalid email");
     }
     return email;
    }



}
