import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class methods {
	 @Test
	  public void setup() {
		  String str = "klh";
		  String str1 = "klh";
		  String str2 = "null";
		  String str3 = "edu";
		  int val = 5;
		  int val1 = 7;
		  String[] expectedArray= {"one","two","three"};
		  String[] resultArray = {"one","two","three"};
		  //assertEquals: checks whether two primitives are same or not
		  assertEquals(str,str1);
		  
		  
	  }
	 @Test
	 public void AsseSame() {
		 //assertSame:"assertSame()" functionality is to check that the two objects refer to the same object.
		 String str = "klh";
		 String str1 = "klh";
		 String str2 = "null";
		 assertSame(str, str1);
	 }

}
