import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTest {
   
	private GradeBook gradetest, gradetest2;

    @Before
    public void setUp() throws Exception {
       
    	gradetest = new GradeBook(5);
    	gradetest.addScore(60);
    	gradetest.addScore(66);
    	gradetest.addScore(76);
    	gradetest.addScore(79);
    	gradetest.addScore(81);

    	gradetest2 = new GradeBook(5);
    	gradetest2.addScore(47);
    	gradetest2.addScore(56);
    	gradetest2.addScore(77);
    	gradetest2.addScore(78);
    	gradetest2.addScore(89);
    }

    @After
    public void tearDown() throws Exception{
    	gradetest = gradetest2 = null;
    }

    @Test
    public void addScore(){
    	assertTrue(gradetest.toString().equals("60.0 66.0 76.0 79.0 81.0 "));
        assertTrue(gradetest2.toString().equals("47.0 56.0 77.0 78.0 89.0 "));
    }

    @Test
    public void sum(){
        assertEquals(362, gradetest.sum(), 0.001);
        assertEquals(347, gradetest2.sum(), 0.001);
    }

    @Test
    public void minimum(){
        assertEquals(60, gradetest.minimum(), 0.001);
        assertEquals(47, gradetest2.minimum(), 0.001);
    }

    @Test
    public void finalScore(){
        assertEquals(302, gradetest.finalScore(), 0.001);
        assertEquals(300, gradetest2.finalScore(), 0.001);
    }
}