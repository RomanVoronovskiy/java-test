import org.junit.jupiter.api.*;

public class LifeCycleUt {

    @BeforeAll
    public static void setUp() {
        System.out.println("@BeforeAll - 1 раз ДО всего");
    }

    @BeforeEach
    public void setUpThis() {
        System.out.println("@BeforeEach - перед каждым тестом");
    }

    @Test
    void testOne(){
        System.out.println("testOne");
    }

    @Test
    void testTwo(){
        System.out.println("testTwo");
    }

    @Test
    void testThree(){
        System.out.println("testThree");
    }

    @AfterEach
    void tearThis(){
        System.out.println("@AfterEach - после каждого теста");
    }

    @AfterAll
    static void tear(){
        System.out.println("@AfterAll - после всех тестов");
    }
}
