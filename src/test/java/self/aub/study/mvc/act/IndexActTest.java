package self.aub.study.mvc.act;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import self.aub.study.UnitWeb;

public class IndexActTest extends UnitWeb {
	@Ignore
	@Test
	public void index() throws Exception {
		request.setRequestURI("/index");
		final ModelAndView mav = request();
		System.out.println(mav.getViewName());
		System.out.println(mav.getModel().get("message"));
	}

	@Ignore
	@Test
	public void index1() throws Exception {
		// TODO liujinxin ajax测试没成功
		request.setRequestURI("/json/ajax");
		request.addHeader("accept", "application/json");
		request.setMethod("POST");
		request.setContentType("application/json");
		request.setContent("{'i':'100','s':'snowolf'}".getBytes());
		final ModelAndView mav = request();
		System.out.println(mav.getViewName());
		System.out.println(mav.getModel().get("message"));
	}
}
