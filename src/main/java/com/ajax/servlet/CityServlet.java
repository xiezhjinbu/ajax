package com.ajax.servlet;

import java.io.IOException;
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
		// TODO Auto-generated method stub
	}

}
