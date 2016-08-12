package self.aub.study.mvc.act;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/inter")
public class InterAct {

	@RequestMapping("index")
	public String index(ModelMap mm) {
		mm.put("message", "inter index");
		return "inter";
	}

	@RequestMapping("false")
	public String interFalse(ModelMap mm) {
		mm.put("message", "inter false");
		return "inter";
	}

	@RequestMapping("true")
	public String interTrue(ModelMap mm) {
		mm.put("message", "inter true");
		return "inter";
	}

}
