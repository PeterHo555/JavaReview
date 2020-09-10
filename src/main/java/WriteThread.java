public class WriteThread extends Thread {
    private String filePath;
    private OpFile opFile;

    public WriteThread(String filePath, OpFile opFile){
        this.filePath = filePath;
        this.opFile = opFile;
    }

    public void run(){
        opFile.writeFile(filePath);
    }
}
