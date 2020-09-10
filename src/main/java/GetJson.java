import com.alibaba.fastjson.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GetJson {
    public JSONObject getJson(String filePath){
        JSONObject jsonObject = new JSONObject();
        try {
            BufferedReader in = new BufferedReader(new FileReader(filePath));
            StringBuffer sb;
            while (in.ready()) {
                sb = (new StringBuffer(in.readLine()));
                jsonObject = JSONObject.parseObject(sb.toString());
            }
            in.close();

        }catch (IOException e){

        }
        return jsonObject;
    }
}
