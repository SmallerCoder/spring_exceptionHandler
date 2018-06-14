package com.example.demo.controller.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.pojo.ErrorReturn;

/**
 * 
 * The class ExceptionThrowableHandler.
 *
 * Description:`NullPointerExceptionHandler`异常会向`Exception`异常传递（但`ArithmeticException`不会向`Exception`传送）
 *
 * @author: huangjiawei
 * @since: 2018年6月13日
 * @version: $Revision$ $Date$ $LastChangedBy$
 *
 */
@ControllerAdvice
public class ExceptionThrowableHandler {

	@ExceptionHandler(Throwable.class)
	@ResponseBody
	public ErrorReturn dealThrowable() {
		ErrorReturn error = new ErrorReturn();
		error.setDesc("处理Throwable!");
		error.setReturnCode("-1");
		return error;
	}

	@ExceptionHandler(Exception.class)
	@ResponseBody
	public ErrorReturn dealCommonException(Exception e) {
		ErrorReturn error = new ErrorReturn();
		// 此处可以采用 instanceof 判断异常类型
		if (e instanceof ArithmeticException) {
			error.setReturnCode("-1");
			error.setDesc("算数异常处理！");
			return error;
		}
		System.err.println("exception");
		error.setReturnCode("-1");
		error.setDesc("公共异常处理！");
		return error;
	}
}
