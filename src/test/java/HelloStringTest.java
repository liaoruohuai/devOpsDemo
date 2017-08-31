import static org.junit.Assert.*;

public class HelloStringTest {
    private HelloString testClass;
    @org.junit.Before
    public void setUp() throws Exception {
        testClass = new HelloString();
    }

    @org.junit.Test
    public void sayHello() throws Exception {
        assertEquals("HelloWorld",testClass.sayHello());
    }

}