import com.alibaba.fastjson.JSONObject;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.*;

public class TestMain {
    public static void main(String[] args) throws InterruptedException {
//        GetJson getJson = new GetJson();
//        String filePath = "data.txt";
//        JSONObject jsonObject = getJson.getJson(filePath);
//        System.out.println(jsonObject);
//        WriteFile wf = new WriteFile();
//        wf.write();
        String filePath = "newFile9.txt";
        OpFile opFile = new OpFile();

        while (true){
            WriteThread writeThread = new WriteThread(filePath, opFile);
            writeThread.start();
            writeThread.sleep(10000);
            ReadThread readThread = new ReadThread(filePath, opFile);
            readThread.start();
        }




    }
}
