package LabExam.Question2;

import java.util.ArrayList;
import java.util.List;

public class Folder implements ICopy{
    String folderName;

    public Folder(String folderName){
        this.folderName = folderName;
    }
    public void rename(String folderName){
        this.folderName = folderName;
    }
    List<File> files = new ArrayList<File>();

    public List<File> getFiles() {
        return files;
    }

    public void addFiles(File files) {
        this.files.add(files);
    }

    @Override
    public Folder copy() {

        Folder folder = new Folder(this.folderName);
        for (File files : getFiles()) {
            folder.getFiles().add(files);
        }
        return folder;
    }

    @Override
    public String toString() {
        return "Folder{" +
                "folderName='" + folderName + '\'' +
                ", files=" + files +
                '}';
    }
}
