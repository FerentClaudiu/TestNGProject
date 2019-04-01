package samples;

import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestFixtureReadFromFile {

    private final ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
    private final Properties properties = new Properties();

    protected String username;
    protected String password;

    @BeforeClass
    public void beforeClass() throws IOException {
        InputStream is = classLoader.getResourceAsStream("accounts.properties");
        properties.load(is);

        username = properties.getProperty("username");
        password = properties.getProperty("password");

    }
}
