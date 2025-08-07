import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.JSONObject;
import org.json.JSONArray;

public class ClearEnvCacheDemo {
    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        
        JSONObject data = new JSONObject();
        data.put("id", "181");
        
        JSONArray cacheList = new JSONArray();
        cacheList.put("indexedDB");
        cacheList.put("localStorage");
        cacheList.put("cookies");
        data.put("cacheList", cacheList);
        
        data.put("clearEnvFolder", 0);
        
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:60000/api/v2/env/clearCache"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(data.toString()))
                .build();
        
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
} 