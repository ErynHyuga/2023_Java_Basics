package at.kogler.practicalTest.Nr1;


import java.util.ArrayList;
import java.util.List;

public class Plane {
    private String planeName;
    private List<Passanger> passangerList;
    Position position;
    String message;
    private String messageFromTower;


    public Plane(String planeName, Position position) {
        this.planeName = planeName;
        this.position = position;
        this.passangerList = new ArrayList<>();
        messageFromTower = message;
    }

    public String getPlaneName() {
        return planeName;
    }

    public void addPassengar(Passanger passanger) {
        this.passangerList.add(passanger);
    }

    public void giveOutPassengars() {
        for (Passanger passanger : passangerList) {
            System.out.println(passanger.getfName() + " " + passanger.getlName());
        }
    }

}
