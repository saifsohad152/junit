/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class DemoTest {
@Test
public void test_isTriangle_1(){
	//String input1="1\n";
	assertTrue(Demo.isTriangle(1, 1, 1));
}
@Test
public void test_isTriangle_2(){
	//String input1="1\n";
	assertTrue(Demo.isTriangle(10, 14, 5));
}
@Test
public void test_isTriangle_3(){
	//String input1="1\n";
	assertFalse(Demo.isTriangle(10, 15, 5));
}
@Test
public void test_isTriangle_4(){
	//String input1="1\n";
	assertFalse(Demo.isTriangle(1, 2, -1));

}
@Test
public void test_isTriangle_5(){
	//String input1="1\n";
	assertFalse(Demo.isTriangle(7, 7, 14));

}
@Test
public void test_isTriangle_6(){
	//String input1="1\n";
	assertFalse(Demo.isTriangle(-100, 7, -5));
}
@Test
public void test_isTriangle_7(){
	//String input1="1\n";
	assertFalse(Demo.isTriangle(-1, 7, 5));
}
@Test
public void test_isTriangle_8(){
	//String input1="1\n";
	assertTrue(Demo.isTriangle(10, 14, 5));
}
@Test
public void test_isTriangle_9(){
	//String input1="1\n";
	assertFalse(Demo.isTriangle(-1, -1, -1));
}
@Test
public void test_isTriangle_10(){
	//String input1="1\n";
	assertFalse(Demo.isTriangle(0, 6, 3));
}
@Test
public void test_isTriangle_11(){
	//String input1="1\n";
	assertFalse(Demo.isTriangle(0, 0, 0));
}
@Test
public void test_isTriangle_12(){
	//String input1="1\n";
	assertFalse(Demo.isTriangle(14, -1, 10));
}




@Test
public void test_main_program() {
	ByteArrayInputStream in=new ByteArrayInputStream("5\n6\n9\n".getBytes());
	System.setIn(in);
	ByteArrayOutputStream out=new ByteArrayOutputStream();
	//PrintStream printStream = new PrintStream(out);
	System.setOut(new PrintStream(out));
	//invoke
	String[] args= {};
	Demo.main(args);
	
	String consoleOutput = "Enter side 1: " + System.lineSeparator();
    consoleOutput += "Enter side 2: " + System.lineSeparator();
    consoleOutput += "Enter side 3: " + System.lineSeparator();
    consoleOutput += "This is a triangle." + System.lineSeparator();

    assertEquals(consoleOutput, out.toString());
	
	
}
}


