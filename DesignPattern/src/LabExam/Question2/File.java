package LabExam.Question2;

public class File {
    String filename;

    public File(String linear_search) {
        filename = linear_search;
    }

    public String getFilename() {
        return filename;
    }

    public void File(String filename) {
        this.filename = filename;
    }

    @Override
    public String toString() {
        return "File{" +
                "filename='" + filename + '\'' +
                '}';
    }
}
