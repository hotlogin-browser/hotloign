import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.JSONObject;

public class UpdateProxyDemo {
    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        
        JSONObject data = new JSONObject();
        data.put("id", "181");
        data.put("provider", 1);
        data.put("type", "SOCKS5");
        data.put("agentGroupName", "默认分组");
        data.put("address", "38.56.78.156");
        data.put("port", 7890);
        data.put("hostAccount", "username");
        data.put("hostPassword", "password");
        data.put("refreshUrl", "https://www.a.com");
        data.put("queryChannel", "IP2Location");
        data.put("remark", "备注");
        
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:60000/api/v2/proxy/update"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(data.toString()))
                .build();
        
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
} 