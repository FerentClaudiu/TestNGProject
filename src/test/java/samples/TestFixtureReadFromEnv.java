package samples;

import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestFixtureReadFromEnv {

    protected String username;
    protected String password;

    @BeforeClass
    public void beforeClass() {
        username = System.getenv("USERNAME");
        password = System.getenv("PASSWORD");
    }
}
