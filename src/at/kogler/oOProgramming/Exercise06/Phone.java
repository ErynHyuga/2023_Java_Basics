package at.kogler.oOProgramming.Exercise06;

public class Phone {
    private String colour;
    Camera camera;
    PhoneFile phoneFile;
    SIM sim;
    SDCard sdCard;

    public Phone(String colour, Camera camera, PhoneFile phoneFile, SIM sim, SDCard sdCard) {
        this.colour = colour;
        this.camera = camera;
        this.phoneFile = phoneFile;
        this.sim = sim;
        this.sdCard = sdCard;
    }

    public void doPicture(String name, String extension) {
        PhoneFile pic = camera.savePicture(name, extension);
        if (pic.getSize() < sdCard.getRemainingSpace() && sdCard != null) {
            sdCard.saveFile(pic);
        } else if (pic.getSize() > sdCard.getRemainingSpace()) {
            System.out.println("Get me more of those bits");
        }
    }

    public int getRemainingSpace() {
        return sdCard.getRemainingSpace();
    }

    public void giveOutEveryFile() {
        for (PhoneFile phonefile : sdCard.getFileList()) {
            for (String print : phonefile.getInfo()) {
                System.out.println(phonefile.getInfo() + ".");
            }
        }
    }

}
/*

Auf der Speicherkarte können Files gespeichert werden. Die Komponenten können ausgetauscht werden.
Wenn ein Photo gemacht wird - gibt das Telefon die Aufforderung an die Kamera weiter -
diese liefert das Photofile zurück und das Telefon muss das File auf die SD-Karte speichern.
Fotos können nur gemacht werden, wenn noch genug freier Platz zur Verfügung steht.
Je nach Resolution der Kamera werden die Files größer oder kleiner.
Erweiterungen: Gib alle Files der Speicherkarte aus. Füge ein Login fürs Handy ein.
 */
