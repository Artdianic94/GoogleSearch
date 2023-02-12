package driver;

public class DriverFactory {

    public DriverManager getManager(DriverType type) {

        DriverManager driverManager;

        if (type == DriverType.CHROME) {
            driverManager = new ChromeDriverManager();
        } else {
            throw new IllegalStateException("Unexpected driver type: " + type);
        }
        return driverManager;
    }

}
