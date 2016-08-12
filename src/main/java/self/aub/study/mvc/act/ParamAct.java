package self.aub.study.mvc.act;

import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import self.aub.study.mvc.act.bean.Bean;
import self.aub.study.mvc.act.bean.TT;
import self.aub.study.mvc.ent.EntityBean;
import self.aub.study.mvc.ent.SysUserEnt;

@Controller
@RequestMapping("/param")
public class ParamAct {

	@RequestMapping()
	public String index(ModelMap mm) {
		mm.put("message", "param index");
		return "param";
	}

	@RequestMapping("int")
	public String paramInt(int i, ModelMap mm) {
		mm.put("message", "param int " + i);
		return "param";
	}

	@RequestMapping("str")
	public String paramStr(@RequestParam(required = false) String str, ModelMap mm) {
		mm.put("message", "param str " + str);
		return "param";
	}
	
	@RequestMapping("map")
	public String paramMap(@RequestParam Map<String, String> map, ModelMap mm) {
		final Entry<String, String> entry = map.entrySet().iterator().next();
		mm.put("message", "param map key :  " + entry.getKey() + ", value : " + entry.getValue());
		return "param";
	}

	@RequestMapping("bean")
	public String paramBean(@ModelAttribute Bean bean, ModelMap mm) {
		mm.put("message", "param bean :  " + bean.getI() + "," + bean.getS() + "," + bean.getM().get("a"));
		return "param";
	}

	@RequestMapping(value = "rest/{i}", method = RequestMethod.GET)
	public String paramRes(@PathVariable long i, ModelMap modelMap) {
		modelMap.put("message", "rest " + i);
		return "param";
	}

	@RequestMapping("entity")
	public String paramEntityBean(@ModelAttribute EntityBean bean, ModelMap mm) {
		mm.put("message", "EntityBean " + bean.get(SysUserEnt.loginName));
		return "param";
	}

	@RequestMapping("e")
	public String e(@ModelAttribute TT t, ModelMap mm) {
		mm.put("message", "EntityBean " + t.get("a"));
		return "param";
	}

	@RequestMapping("d")
	public String d(@RequestParam Date date, ModelMap mm) {
		mm.put("message", "EntityBean " + date);
		return "param";
	}

}
