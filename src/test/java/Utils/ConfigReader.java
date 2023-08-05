package Utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

    static {
        properties = new Properties();
        try {
            InputStream inputStream = ConfigReader.class.getClassLoader().getResourceAsStream("config.properties");
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getBaseUrl() {
        String baseUrl = properties.getProperty("base.url");

        if (baseUrl.startsWith("http://")) {
            baseUrl = "https://" + baseUrl.substring(7);
        }

        return baseUrl;
    }
}
