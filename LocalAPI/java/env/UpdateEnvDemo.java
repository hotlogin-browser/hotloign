import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.JSONObject;
import org.json.JSONArray;

public class UpdateEnvDemo {
    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        
        JSONObject data = new JSONObject();
        data.put("id", "180");
        data.put("name", "P-1-Updated");
        data.put("groupId", "1828956");
        data.put("remark", "remark1-updated");
        
        // 代理配置
        JSONObject proxyConfig = new JSONObject();
        proxyConfig.put("provider", 1);
        proxyConfig.put("type", "SOCKS5");
        proxyConfig.put("address", "38.56.78.156");
        proxyConfig.put("port", 7890);
        proxyConfig.put("hostAccount", "username");
        proxyConfig.put("hostPassword", "password");
        data.put("proxyConfig", proxyConfig);
        
        // 账号信息
        JSONObject accountInfo = new JSONObject();
        JSONArray openUrl = new JSONArray();
        openUrl.put("https://www.baidu.com");
        accountInfo.put("openUrl", openUrl);
        data.put("accountInfo", accountInfo);
        
        // 指纹信息
        JSONObject fingerprint = new JSONObject();
        fingerprint.put("browserType", "chrome");
        fingerprint.put("kernelVersion", 128);
        fingerprint.put("system", 0);
        fingerprint.put("osVersion", "Windows 11");
        data.put("fingerprint", fingerprint);
        
        // 高级设置
        JSONObject advancedSetting = new JSONObject();
        advancedSetting.put("autoTimeZone", 1);
        advancedSetting.put("webRtcType", "BAN");
        advancedSetting.put("geoLocationType", "ASK");
        advancedSetting.put("autoGeoLocation", 1);
        advancedSetting.put("autoLanguage", 1);
        advancedSetting.put("autoInterfaceLanguage", 1);
        advancedSetting.put("resolutionType", "BASE_ON_UA");
        advancedSetting.put("fontType", "DEFAULT");
        advancedSetting.put("canvasType", "NOISE");
        advancedSetting.put("webglImageType", "NOISE");
        advancedSetting.put("webglMetaType", "NOISE");
        advancedSetting.put("webGpuType", "BASEONWEBGL");
        advancedSetting.put("audioContextType", "NOISE");
        advancedSetting.put("mediaDeviceType", "NOISE");
        advancedSetting.put("matchDeviceNum", 1);
        advancedSetting.put("speechVoiceType", "NOISE");
        advancedSetting.put("clientRectsType", "NOISE");
        advancedSetting.put("hardwareConcurrencyNum", 4);
        advancedSetting.put("deviceMemory", 8);
        advancedSetting.put("deviceNameType", "CUSTOM");
        advancedSetting.put("deviceName", "DESKTOP-N3TSAO2");
        advancedSetting.put("deviceMacType", "CUSTOM");
        advancedSetting.put("deviceMac", "50:a6:7f:10:9f:b6");
        advancedSetting.put("trackType", "DEFAULT");
        advancedSetting.put("protectScanPort", 1);
        data.put("advancedSetting", advancedSetting);
        
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:60000/api/v2/env/update"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(data.toString()))
                .build();
        
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
} 