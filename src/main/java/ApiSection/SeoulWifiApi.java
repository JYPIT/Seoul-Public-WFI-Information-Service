package ApiSection;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class SeoulWifiApi {
    public static JsonArray get() throws IOException {
        String API_KEY = "787179546c6a797036344167474274";
        String url = "http://openapi.seoul.go.kr:8088/" + API_KEY + "/json/TbPublicWifiInfo/1/20";

        JsonArray result = null;

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();

        try (Response response = client.newCall(request).execute()) {
            String resStr = response.body().string();
            JsonObject jsonParser = JsonParser.parseString(resStr).getAsJsonObject();
            JsonObject jsonObject = jsonParser.get("TbPublicWifiInfo").getAsJsonObject();
            JsonArray jsonArray = jsonObject.getAsJsonObject().get("row").getAsJsonArray();

            result = jsonArray;
        }
        return result;
    }
}