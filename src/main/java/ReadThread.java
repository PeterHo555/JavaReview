import static java.lang.Thread.*;

public class ReadThread extends Thread {

    private String filePath;
    private OpFile opFile;

    public ReadThread(String filePath, OpFile opFile){
        this.filePath = filePath;
        this.opFile = opFile;
    }

    public void run(){
        opFile.readFile(filePath);
    }
}
