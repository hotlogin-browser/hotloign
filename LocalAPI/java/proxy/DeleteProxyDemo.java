import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.JSONObject;
import org.json.JSONArray;

public class DeleteProxyDemo {
    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        
        JSONObject data = new JSONObject();
        JSONArray ids = new JSONArray();
        ids.put("182");
        ids.put("183");
        data.put("ids", ids);
        
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:60000/api/v2/proxy/delete"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(data.toString()))
                .build();
        
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
} 