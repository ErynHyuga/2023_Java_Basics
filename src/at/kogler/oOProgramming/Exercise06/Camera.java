package at.kogler.oOProgramming.Exercise06;

public class Camera {
    private int resolution;

    public PhoneFile savePicture(String name, String extension) {
        PhoneFile phoneFile = new PhoneFile(extension, resolution, name);
        return phoneFile;
    }

    public Camera(int resolution) {
        this.resolution = resolution;
    }
}
