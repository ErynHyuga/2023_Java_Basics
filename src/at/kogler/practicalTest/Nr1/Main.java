package at.kogler.practicalTest.Nr1;

public class Main {//
    public static void main(String[] args) {
        Position pos1 = new Position(10, 2000);
        Plane plane177 = new Plane("Al-QuaedaAirlines", pos1);
        TrafficController flightC1 = new TrafficController(1);
        Passanger pas1 = new Passanger("Hans", "Diehter");
        Passanger pas2 = new Passanger("Peter", "Tschuschnick");
        Passanger pasTOTALER = new Passanger("HERBERT", "KichDichAusDerLobby");
        Passanger pas3 = new Passanger("Marianne", "Mariopol");


        flightC1.addPlane(plane177);
        plane177.addPassengar(pas1);
        plane177.addPassengar(pas3);

        plane177.giveOutPassengars();
        pas2.inform();



    }
}
