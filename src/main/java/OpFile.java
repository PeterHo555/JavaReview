import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class OpFile {

    public void writeFile(String filePath){
        SimpleDateFormat sdf = new SimpleDateFormat();// 格式化时间
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");// a为am/pm的标记
        Date date = new Date();// 获取当前时间
        System.out.println("现在时间：" + sdf.format(date)); // 输出已经格式化的现在时间（24小时制）
        try{
            String data = "currentTime: " + sdf.format(date);
            File file =new File(filePath);
            //if file doesnt exists, then create it
            if(!file.exists()){
                file.createNewFile();
            }
            //true = append file
            FileWriter fileWritter = new FileWriter(file.getName(),true);
            BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
            bufferWritter.write(data);
            bufferWritter.newLine();
            bufferWritter.close();

            System.out.println("Done:"+ data);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void readFile(String filePath){
        try {
            BufferedReader in = new BufferedReader(new FileReader(filePath));
            while (in.ready()){
                StringBuffer stringBuffer = new StringBuffer(in.readLine());
                System.out.println("read a line: "+stringBuffer);
            }
        }catch (IOException e){
        }
    }


}
