import org.json.simple.JSONObject;
import org.junit.Test;
import org.junit.Assert;

public class UnitTest {

    
	@Test
    public void testGet(){
    	HelperClass testObj = new HelperClass();
        JSONObject response =
                testObj.calculate("QEW", "Appleby Line");

        
        Assert.assertEquals("2.4772499", response.get("costOfTrip").toString());
    }
	
//	Test: When Same Location is Passed
	@Test
    public void sameLocationCheck(){
    	HelperClass testObj = new HelperClass();
        JSONObject response =
                testObj.calculate("QEW", "QEW");

        
        Assert.assertEquals("0.0", response.get("costOfTrip").toString());
    }
	
	//Test: If the location passed has incorrect spelling
	@Test
    public void spellingCheck(){
    	HelperClass testObj = new HelperClass();
        JSONObject response =
                testObj.calculate("Apple by Line", "QEW");

        
        Assert.assertEquals("fail", response.get("status").toString());
    }
	
	// Test: If atleast one of the passed value is null
	@Test
    public void nullCheck(){
    	HelperClass testObj = new HelperClass();
        JSONObject response =
                testObj.calculate("", "QEW");

        
        Assert.assertEquals("null", response.get("status").toString());
    }
	
}