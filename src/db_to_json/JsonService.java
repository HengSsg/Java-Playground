package db_to_json;

import com.mysql.cj.xdevapi.JsonArray;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class JsonService {
    private JsonDAO jsonDAO;

    public JsonService() {
        this.jsonDAO = new JsonDAO();
    }

    public void createJson() {
        User_BookDTO userBookDTO = jsonDAO.selectUserData(1); // 데이터 가져오기

        JSONObject obj = new JSONObject();

        obj.put("id", userBookDTO.getUserData().getId());
        obj.put("name", userBookDTO.getUserData().getName());
        obj.put("status", userBookDTO.getUserData().isStatus());

        JSONArray jsonArray = new JSONArray();
        for (BookDataDTO bookData : userBookDTO.getBookDataDTOS()) {
            JSONObject jsonObject = new JSONObject();

            jsonObject.put("no", bookData.getNo());
            jsonObject.put("name", bookData.getName());
            jsonObject.put("author", bookData.getAuthor());
            jsonObject.put("publisher", bookData.getPublisher());
            jsonObject.put("rentDate", bookData.getRentDate());
            jsonObject.put("returnDate", bookData.getReturnDate());
            jsonObject.put("imageUrl", bookData.getImageUrl());
            jsonObject.put("user_id", bookData.getUser_id());
            jsonArray.add(jsonObject);

        }

        obj.put("bookData", jsonArray);

        try (FileWriter file = new FileWriter("/Users/hengssg/Career/더존/html/admin/data.json")) {
            file.write(obj.toJSONString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
