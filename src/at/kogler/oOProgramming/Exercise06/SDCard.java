package at.kogler.oOProgramming.Exercise06;


import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private List<PhoneFile> fileList;
    private int capacity;

    public SDCard(int capacity) {
        this.fileList = new ArrayList<>();
        this.capacity = capacity;
    }

    public List<PhoneFile> getFileList() {
        return fileList;
    }

    public void saveFile(PhoneFile phoneFile){
        this.fileList.add(phoneFile);
    }
    public int getRemainingSpace() {
        int fileSizes = 0;

        if (fileList.size() > 0){
            for (PhoneFile phoneFile : fileList) {
                fileSizes += phoneFile.getSize();
            }
        }
        int remainingSpace = capacity-fileSizes;
        return remainingSpace;
    }

}
