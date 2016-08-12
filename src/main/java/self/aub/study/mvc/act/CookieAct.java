package self.aub.study.mvc.act;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cookie")
public class CookieAct {

	@RequestMapping()
	public String index(ModelMap mm) {
		mm.put("message", "cookie index");
		return "cookie";
	}

	@RequestMapping("show")
	public String show(@CookieValue("JSESSIONID") String sessionId, ModelMap mm) {
		mm.put("message", "cookie JSESSIONID : " + sessionId);
		return "cookie";
	}

}
