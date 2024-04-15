package at.kogler.practicalTest.Nr1;

import java.util.ArrayList;
import java.util.List;

public class TrafficController {
    private int flightControllNr;
    private List<Plane> planeList;



    public TrafficController(int flightControllNr) {
        this.flightControllNr = flightControllNr;
        this.planeList = new ArrayList<>();

    }

    public List<Plane> getPlaneList() {
        return planeList;
    }

    public void addPlane(Plane plane) {
        this.planeList.add(plane);
    }

    public int getFlightControllNr() {
        return flightControllNr;
    }

    public String getMessage() {
        return message;
    }
}
