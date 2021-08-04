package ru.skillbox.ex5;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main01 {
    RecommendGoodList getRecommendGoods(String goods) {
        var recommendGoodList = new RecommendGoodList();
        try {
            var url = new URL("https://goodsservice?list=" + goods);
            var connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("accept", "application/json");
            var responseStream = connection.getInputStream();
            return new ObjectMapper().readValue(responseStream, RecommendGoodList.class);
        } catch (MalformedURLException malformedURLException) {
            malformedURLException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (JsonParseException jsonParseException) {
            jsonParseException.printStackTrace();
        } catch (JsonMappingException jsonMappingException) {
            jsonMappingException.printStackTrace();
        }
        return recommendGoodList;
    }

}
