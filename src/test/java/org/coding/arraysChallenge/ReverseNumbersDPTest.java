/**
 *   File Name: ReverseNumbersDPTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Sep 10, 2017
 *   
 */

package org.coding.arraysChallenge;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

import org.testng.ITest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * ReverseNumbersDPTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
public class ReverseNumbersDPTest implements ITest {	// String csvFile = "a.csv"
	
	ReverseNumbers rn;
	
	String csvFile = System.getProperty("testcases");	// mvn site -Dtestcases="./input.csv"
	
	private String test_name = "";
	
	@Override
	public String getTestName() {
		return test_name;
	}
	
	private void setTestName(String a) {
		test_name = a;
	}
	
	@BeforeClass(alwaysRun = true)
	public void setUpRemoveDuplicatesDPTest() {
		rn = new ReverseNumbers();
	}
	
	@BeforeMethod(alwaysRun = true)
	public void bm(Method method, Object[] parameters) {
		setTestName(method.getName());
		TestDataIF a = method.getAnnotation(TestDataIF.class);
		String testCaseId = (String) parameters[a.id()];
		setTestName(testCaseId);	
	}
	
	@DataProvider(name = "dp")
	public Iterator<String[]> a2d() throws InterruptedException, IOException {
		String cvsLine = "";
		String[] a = null;
		ArrayList<String[]> al = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader(csvFile));
		while ((cvsLine = br.readLine()) != null) {
			a = cvsLine.split(",");
			al.add(a);
		}
		br.close();
		return al.iterator();
	}
	
	@TestDataIF
	@Test(dataProvider = "dp")
	public void test(String a, String b, String c, String d) {
		//System.out.println(a + "," + b + ", " + c + ", " + d);
		assertThat(Integer.parseInt(b) + Integer.parseInt(c), is(Integer.parseInt(d)));
	}

}
