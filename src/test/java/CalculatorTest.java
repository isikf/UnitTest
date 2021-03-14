import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add () {
        System.out.println("Add method called");
        int actual= Calculator.add (2,3);
        assertEquals(5, actual);
    }

    @Test
    void testCase1() {
        System.out.println("TC1 executed");
        assertEquals(20, 20);
    }
    @Test
    void testCase2() {
        System.out.println("TC2 executed");
        boolean result= Calculator.add(2,3) ==5;
        assertTrue(result);
        assertTrue(Calculator.operator.equals("add"));
    }
    @Test
    void testCase3 () {
        System.out.println("TC3 executed");
        //test will pass
        assertArrayEquals(new int[]{1,2,3}, new int[]{1,2,3});
        //test will fail
        //assertArrayEquals(new int[]{1,2,3}, new int[]{1,3,2});
    }
    @Test
    void testCase4 () {
        System.out.println("TC4 executed");
        String nullString= null;
        String notNullString= "Cybertek";

        //Test will pass
        assertNotNull (notNullString);
        //Test will pass
        assertNull(nullString);
        //Test will fail
        //assertNotNull(nullString);
    }
    @Test
    void testCase5(){
        System.out.println("TC5 executed");
        Calculator c1= new Calculator();
        Calculator c2= c1;
        Calculator c3= new Calculator();

        //Test will pass
        assertNotSame(c1, c3);
        assertSame(c1, c2);
        //Test will fail
        //assertNotSame(c1, c2);
    }
    @BeforeEach
    void setUpEach() {
        System.out.println("@BeforeEach is executed");
    }
    @BeforeAll
    static void setUpAll() {
        System.out.println("@BeforeAll is executed");
    }
    @AfterAll
    static void tearAll() {
        System.out.println("@AfterAll is executed");
    }
    @AfterEach
    void tearEach () {
        System.out.println("@AfterEach is executed");
    }

}