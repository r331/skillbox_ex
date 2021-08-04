package ru.skillbox.ex5;

import java.net.HttpURLConnection;
import java.net.URL;

public class Main2 {

    RecommendGoodList getRecommendGoods(String goods) {
        var recommendGoodList = new RecommendGoodList();
        HttpURLConnection connection = null;
        try {
            var url = new URL("https://goodsservice?list=" + goods);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("accept", "application/json");
            var responseStream = connection.getInputStream();
            return new ObjectMapper().readValue(responseStream, RecommendGoodList.class);
        } finally {
            return recommendGoodList;
        }
    }
}
