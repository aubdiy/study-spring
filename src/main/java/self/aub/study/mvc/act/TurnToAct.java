package self.aub.study.mvc.act;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/turnto")
public class TurnToAct {

	@RequestMapping()
	public String index(ModelMap mm) {
		mm.put("message", "come from index");
		return "turnto";
	}

	@RequestMapping("forward")
	public String forward(ModelMap mm) {
		mm.put("message", "come from forward");
		return "forward:toforward";
	}

	@RequestMapping("toforward")
	public String toForward(HttpServletRequest req, ModelMap mm) {
		final Object obj = req.getAttribute("message");
		mm.put("message", obj);
		return "turnto";
	}

	@RequestMapping("redirect")
	public String redirect(ModelMap mm) {
		mm.put("a", "a");
		mm.put("c", "c");
		mm.put("message", "come from redirect");
		return "redirect:toredirect";
	}

	@RequestMapping("toredirect")
	public String toRedirect(@RequestParam String message, ModelMap mm) {
		mm.put("message", message);
		return "turnto";
	}

	@RequestMapping("redirect/with/param")
	public String testRedirect(RedirectAttributes attr) {
		attr.addAttribute("a", "a");
		attr.addFlashAttribute("b", "b");
		return "redirect:toredirect";
	}
}
