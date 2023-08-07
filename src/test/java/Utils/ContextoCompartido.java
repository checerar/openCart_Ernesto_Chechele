package Utils;
import io.cucumber.java.Scenario;

public class ContextoCompartido {
    private static Scenario scenario;
    private static String username;
    private static String password;

    public static Scenario getScenario() {
        return scenario;
    }

    public static void setScenario(Scenario scenario) {
        ContextoCompartido.scenario = scenario;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        ContextoCompartido.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        ContextoCompartido.password = password;
    }
}
