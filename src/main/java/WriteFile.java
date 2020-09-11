import com.alibaba.fastjson.JSONObject;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WriteFile extends Thread {

    private String path = "newFile.txt";

    public WriteFile(){
        SimpleDateFormat sdf = new SimpleDateFormat();// 格式化时间
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");// a为am/pm的标记
        Date date = new Date();// 获取当前时间
        System.out.println("现在时间：" + sdf.format(date)); // 输出已经格式化的现在时间（24小时制）
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(path));
            out.write("currentTime: " + sdf.format(date));
            out.newLine();
        }catch (IOException e){
        }
    }
}
