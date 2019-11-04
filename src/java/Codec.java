import java.util.HashMap;
import java.util.Map;

/**
 * 535. TinyURL 的加密与解密
 * @author LJY
 */
public class Codec {

    private static Map<String, String> map = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String key = String.valueOf(System.nanoTime());
        map.put(key, longUrl);
        return key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}
