package com.ajax.springmvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * springmvc作为ajax后台交互
 * @author lijun
 *
 */
@org.springframework.stereotype.Controller
public class Controller {

	@RequestMapping("/springmvcajax")
	@ResponseBody
	public List<String> post(String province){
		List<String> list=new ArrayList<String>();
		if("河南省".equals(province)){
			list.add("郑州市");
			list.add("洛阳市");
			list.add("商丘市");
			list.add("安阳市");
			list.add("南阳市");
			list.add("开封市");
			list.add("平顶山");
			list.add("焦作市");
			list.add("新乡市");
			list.add("鹤壁市");
			list.add("濮阳市");
			list.add("许昌市");
			list.add("三门峡");
			list.add("信阳市");
			list.add("周口市");
			list.add("驻马店");
			list.add("济源市");
		}
		return list;
	}
}