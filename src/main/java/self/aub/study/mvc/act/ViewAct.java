package self.aub.study.mvc.act;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import self.aub.study.mvc.act.bean.JsonBean;

@Controller
@RequestMapping("/view")
public class ViewAct {

	@RequestMapping()
	public String index(ModelMap mm) {
		mm.put("message", "view index");
		return "view";
	}

	@RequestMapping("list")
	public String list(ModelMap mm) {
		mm.put("message", "view list");
		final List<String> list = new ArrayList<String>();
		list.add("111");
		list.add("222");
		list.add("333");
		mm.put("list", list);
		return "view";
	}

	@RequestMapping("map")
	public String map(ModelMap mm) {
		mm.put("message", "view map");
		final Map<String, String> map = new HashMap<String, String>();
		map.put("a", "av");
		map.put("b", "bv");
		map.put("c", "cv");
		mm.put("map", map);
		return "view";
	}

	@RequestMapping("listbean")
	public String listBean(ModelMap mm) {
		mm.put("message", "list bean");
		final List<JsonBean> listBean = new ArrayList<JsonBean>();
		listBean.add(new JsonBean(1, "s1"));
		listBean.add(new JsonBean(2, "s2"));
		listBean.add(new JsonBean(3, "s3"));
		mm.put("listbean", listBean);
		return "view";
	}

}
