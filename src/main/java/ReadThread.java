import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.File;
import java.util.List;

import static java.lang.Thread.*;

public class ReadThread extends Thread {

    private String filePath;
    private OpFile opFile;

    public ReadThread(String filePath, OpFile opFile){
        this.filePath = filePath;
        this.opFile = opFile;
    }

    public void run(){
//        opFile.readFile(filePath);
        File file = new File(filePath);
        List<String> ans = opFile.readLastNLine(file, 5);
        JSONArray json = new JSONArray();
        for(String temp : ans){
            JSONObject jo = new JSONObject();
            jo = JSONObject.parseObject(temp.toString());
            System.out.println(jo.get("temperature"));
            json.add(jo);
        }
//        JSONArray array= JSONArray.parseArray(JSON.toJSONString(ans));
//        JSONObject jsonObject = new JSONObject();
//        jsonObject = JSONObject.parseObject(ans.toString());
//        for (int i = 0; i < ans.size(); i++) {
//            System.out.println(i+":"+ans.get(i));
//        }
        System.out.println(":::"+((JSONObject) json.get(1)).get("date"));

    }
}
