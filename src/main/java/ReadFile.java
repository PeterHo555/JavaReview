import com.alibaba.fastjson.JSONObject;

import java.io.*;

public class ReadFile {
    private String path = "newFile.txt";

    public ReadFile(){
        try {
            BufferedReader in = new BufferedReader(new FileReader(path));

            while (in.ready()){
                StringBuffer stringBuffer = new StringBuffer(in.readLine());
                System.out.println("read a line: "+stringBuffer);
            }
        }catch (IOException e){

        }
    }

    public void run(){

    }
//    public static void main(String[] args) {
//        try {
////            String path = "data.txt";
////            BufferedWriter out = new BufferedWriter(new FileWriter("runoob.txt"));
////            out.write("菜鸟教程");
////            out.append("dasd");
////            out.newLine();
////            out.write("你好");
////            out.flush();
////            out.close();
////            System.out.println("文件创建成功！");
//            BufferedReader in = new BufferedReader(new FileReader("data.txt"));
//            StringBuffer sb;
//            while (in.ready()) {
//                sb = (new StringBuffer(in.readLine()));
////                System.out.println(sb);
//                JSONObject jsonObject = JSONObject.parseObject(sb.toString());
//                System.out.println(jsonObject.toJSONString());
//                System.out.println(jsonObject.getString("msgid"));
//            }
//            in.close();
//        } catch (IOException e) {
//        }
//    }
}
