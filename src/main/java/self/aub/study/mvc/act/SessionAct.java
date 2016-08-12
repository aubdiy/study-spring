package self.aub.study.mvc.act;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/session")
@SessionAttributes("name")
public class SessionAct {

	@RequestMapping()
	public String index(HttpSession session, ModelMap mm) {
		session.setAttribute("name", "aub");
		mm.put("message", "session index");
		return "session";
	}

	@RequestMapping("show")
	public String show(@ModelAttribute("name") String name, ModelMap mm) {
		mm.put("message", "session name : " + name);
		return "session";
	}

}
