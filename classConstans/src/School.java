public class School {

    //constant -> static ve final -> ortak ve değişmez
    public static final String SCHOOL_NAME = "Fırat University";
    public static final int SCHOOL_YEAR = 1990;

    //Sadece final -> bu nesne için değişmez
    public final int academicID ;
    public final int personalID ;

    public School(int academicID, int personalID) {
        this.academicID = academicID;
        this.personalID = personalID;
    }






}
