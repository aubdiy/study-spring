package self.aub.study.tra;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import self.aub.study.UnitBase;
import self.aub.study.tra.TraService;

@ContextConfiguration(locations = { "/spring-tra-test.xml" })
public class TraServiceTest extends UnitBase {

	@Autowired
	private TraService traService;

	@Before
	public void befor() {
		traService.flush();
	}

	@Test
	public void testRequiredOK() {
		traService.requiredOK();
	}

	@Test
	public void testRequiredFail() {
		try {
			traService.requiredFail();
		} catch (Exception e) {
		}
	}

}
