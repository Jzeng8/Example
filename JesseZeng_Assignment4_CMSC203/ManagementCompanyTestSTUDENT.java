import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ManagementCompanyTestSTUDENT {
	Property property1 ,property2,property3,property4,property5,property6;
	ManagementCompany finecompany ; 
	
	@BeforeEach
	public void setUp() throws Exception {
		
		property1 = new Property ("camp son", "rocktown", 4100, "david mith",2,1,2,2);
		property2 = new Property ("towncity", "wood", 4844.00, " Taylor ham",4,1,2,2);
		property3 = new Property ("deer Lodge", "germantown", 6000, "Bubba Burley",6,1,2,2);
		finecompany= new ManagementCompany("Railey", "555555555",6);
	 
		finecompany.addProperty(property1);
		finecompany.addProperty(property2);
		finecompany.addProperty(property3);
	}

	@AfterEach
	public void tearDown() throws Exception {
		property1=null;
		property2=null;
		property3=null;
		property4=null;
		property5=null;
		property6=null;
		finecompany=null;
	}

	@Test
	public void testAddPropertyDefaultPlot() {
		property4 = new Property ("CaveCity", "washington", 5327, "david Wilson",2,5,2,2);
		property5 = new Property ("Earl town", "Lakebeach", 2613, "joey nuggest",4,5,2,2);
		property6 = new Property ("boathouse", "beachcity", 1000, "massad dee",6,5,2,2);
	}

	@Test
	public void testMaxRentProp() {
		assertEquals(finecompany.maxRentProp(),6000.0,0);
	}
	@Test
	public void testTotalRent() {
		assertEquals(finecompany.totalRent(),14944,0);
	}
}
