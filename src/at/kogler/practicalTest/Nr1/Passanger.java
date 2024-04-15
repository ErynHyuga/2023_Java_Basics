package at.kogler.practicalTest.Nr1;


public class Passanger {
    private String fName;
    private String lName;

    String messageFromTower;
    private String message;

    public Passanger(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;

    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getMessage() {
        return message;
    }

    protected void inform() {
        System.out.println("Ich bin" + " " + fName + " " + lName + ", man sagte mir:" + message);
    }

}