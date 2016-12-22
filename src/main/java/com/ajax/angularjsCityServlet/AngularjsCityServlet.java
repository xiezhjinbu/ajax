package com.ajax.angularjsCityServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;

/**
 * Servlet implementation class AngularjsCityServlet
 */
public class AngularjsCityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");//设置请求编码为"UTF-8"
		String province=request.getParameter("province");
		response.setCharacterEncoding("UTF-8");//设置响应编码为UTF-8 注意这个必须放在write前面才有效!!
		PrintWriter write=response.getWriter();
		request.setAttribute("data", "信阳市");
		List<String> list=new ArrayList<>();
		JSONArray jsonArray = new JSONArray();  
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
			jsonArray.put(list);
			write.print(jsonArray);
		}
	}

}
