import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackToSenderTest{
	@Test 
	public void testThatBackToSenderFunctionReturnTheCorrectWage(){
		BackToSender BackToSender = new BackToSender();

		int riderDailyWage = BackToSender.backToSenderFunction(80);

		assertEquals(45000, riderDailyWage);
	}
}