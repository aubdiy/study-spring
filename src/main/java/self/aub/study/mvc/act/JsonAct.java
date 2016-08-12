package self.aub.study.mvc.act;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import self.aub.study.mvc.act.bean.JsonBean;

@Controller
@RequestMapping("/json")
public class JsonAct {

	@RequestMapping()
	public String index(ModelMap mm) {
		mm.put("message", "json index");
		return "json";
	}

	@RequestMapping("/ajax")
	public @ResponseBody
	JsonBean ajax(@RequestBody JsonBean jb) {
		System.out.println(jb.getI());
		System.out.println(jb.getS());
		return jb;
	}
}
