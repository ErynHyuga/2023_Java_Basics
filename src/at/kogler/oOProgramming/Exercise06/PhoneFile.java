package at.kogler.oOProgramming.Exercise06;

public class PhoneFile {
    private String extension;
    private int size;
    private String name;

    public PhoneFile(String extension, int size, String name) {
        this.extension = extension;
        this.size = size;
        this.name = name;
    }

    public String[] getInfo(){
        return new String[]{name, extension,String.valueOf(size) };

    }

    public int getSize() {
        return size;
    }
}
