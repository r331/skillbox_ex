package ru.skillbox.ex5;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main02 {
    RecommendGoodList getRecommendGoods(String goods) {
        var recommendGoodList = new RecommendGoodList();
        try {
            var url = new URL("https://goodsservice?list=" + goods);
            var connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("accept", "application/json");
            var responseStream = connection.getInputStream();
            return new ObjectMapper().readValue(responseStream, RecommendGoodList.class);
        } catch (IOException | JsonParseException | JsonMappingException exception) {
            exception.printStackTrace();
        }
        return recommendGoodList;
    }

}
