package com.ajax.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 城市二级联动菜单 servlet版
 */
public class CityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * get方法请求
	 * 处理：当用户用get方法请求的时候直接让它调用doPost()方法
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * post请求
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");//设置请求编码为"UTF-8"
		String province=request.getParameter("province");
		response.setCharacterEncoding("UTF-8");//设置响应编码为UTF-8 注意这个必须放在write前面才有效!!
		PrintWriter write=response.getWriter();
		if("河南省".equals(province)){
			write.println("<option>郑州市</option>");
			write.println("<option>洛阳市</option>");
			write.println("<option>商丘市</option>");
			write.println("<option>安阳市</option>");
			write.println("<option>南阳市</option>");
			write.println("<option>开封市</option>");
			write.println("<option>平顶山</option>");
			write.println("<option>焦作市</option>");
			write.println("<option>新乡市</option>");
			write.println("<option>鹤壁市</option>");
			write.println("<option>濮阳市</option>");
			write.println("<option>许昌市</option>");
			write.println("<option>三门峡</option>");
			write.println("<option>信阳市</option>");
			write.println("<option>周口市</option>");
			write.println("<option>驻马店</option>");
			write.println("<option>济源市</option>");
		}
	}

}
