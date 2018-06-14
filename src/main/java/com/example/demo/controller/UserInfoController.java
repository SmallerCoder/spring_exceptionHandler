package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Student;

/**
 * 
 * The class UserInfoController.
 *
 * Description:假设我们的系统出现了各种运行时RuntimeException
 *
 * @author: huangjiawei
 * @since: 2018年6月13日
 * @version: $Revision$ $Date$ $LastChangedBy$
 *
 */
@RestController
public class UserInfoController {

	/**
	 * 正常请求
	 * @return
	 */
	@RequestMapping(value = "getUserInfo.json", method = RequestMethod.GET)
	public Student getUserInfo() {
		return new Student("huangjiawei", 22);
	}

	/**
	 * 抛出异常，但不处理，看看返回什么？（一大堆异常链信息）
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value = "getUserInfoWithNoHandler.json", method = RequestMethod.GET)
	public Student getUserInfoWithNoHandler() throws Exception {
		// 如果找不到该异常类型的handler，则默认会找处理Exception的handler,即向上查找
		throw new ClassCastException();
	}

	/**
	 * 测试空指针错误的处理
	 * @return
	 * @throws NullPointerException
	 */
	@RequestMapping(value = "getUserInfoWithNullPointerException.json", method = RequestMethod.GET)
	public Student getUserInfoWithNullPointerException() throws NullPointerException {
		throw new NullPointerException();
	}

	/**
	 * 测试空指针错误的处理
	 * @return
	 * @throws NullPointerException
	 */
	@RequestMapping(value = "getUserInfoWithArithmeticException.json", method = RequestMethod.GET)
	public Student getUserInfoWithArithmeticException() throws ArithmeticException {
		throw new ArithmeticException();
	}
}
