package com.example.demo.controller.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.pojo.ErrorReturn;

/**
 * 
 * The class NullPointerExceptionHandler.
 *
 * Description:处理空指针
 *
 * @author: huangjiawei
 * @since: 2018年6月13日
 * @version: $Revision$ $Date$ $LastChangedBy$
 *
 */
@ControllerAdvice
public class NullPointerExceptionHandler {

	@ResponseBody
	@ExceptionHandler(NullPointerException.class)
	public ErrorReturn dealNullPointerException() {
		System.err.println("null");
		ErrorReturn error = new ErrorReturn();
		error.setReturnCode("-1");
		error.setDesc("出现空指针异常啦！");
		return error;
	}

}
