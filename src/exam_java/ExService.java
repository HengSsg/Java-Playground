package exam_java;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import javax.swing.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExService {
    ExDAO exDAO;

    public ExService() {
        this.exDAO = new ExDAO();
    }

    public void getUserData() {
        UserDTO2 userDTO = exDAO.selectUser();


        JSONObject jsonObject = new JSONObject();

        jsonObject.put("id", userDTO.getId());
        jsonObject.put("name", userDTO.getUsername());
        jsonObject.put("status", userDTO.isStatus());
        String path = "/Users/hengssg/html_css/play_ground/exam_project/data/data.json";

        try (FileWriter file = new FileWriter(path)) {


            file.write(jsonObject.toJSONString());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void writeJson() {
        UserDTO2 userDTO2 = exDAO.selectUser();

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("id", userDTO2.getId());
        jsonObject.put("name", userDTO2.getUsername());
        jsonObject.put("status", userDTO2.isStatus());

        String path = "/Users/hengssg/html_css/play_ground/exam_project/data/data.json";

        try(FileWriter file = new FileWriter(path)){
            file.write(jsonObject.toJSONString());

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
