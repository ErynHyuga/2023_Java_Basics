package at.kogler.oOProgramming.Exercise06;


import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private List<PhoneFile> fileList = new ArrayList<>();
    private int capacity;

    public List<PhoneFile> getFileList() {
        return fileList;
    }

    public void setFileList(List<PhoneFile> fileList) {
        this.fileList = fileList;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
