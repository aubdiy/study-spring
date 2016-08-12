package self.aub.study.mvc.act;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import self.aub.study.mvc.act.bean.AA;
import self.aub.study.mvc.util.SpringContext;

@Controller
@RequestMapping("/index")
public class IndexAct {

	@RequestMapping
	public String index(ModelMap mm) {
		SpringContext.get(AA.class).tt();
		return "index";
	}
	
	@RequestMapping("exc")
	public String indexExc(ModelMap mm) {
		throw new RuntimeException("cccc");
	}
}
