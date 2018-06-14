package com.example.demo.controller.handler.errorpage;

/**
 * 
 * The class MyErrorPageController.
 *
 * Description:自定义错误页面
 *
 * @author: huangjiawei
 * @since: 2018年6月13日
 * @version: $Revision$ $Date$ $LastChangedBy$
 *
 */
public class MyErrorPageController {

	public String handleError() {
		System.err.println("enter error");
		return "error.html";
	}

}
