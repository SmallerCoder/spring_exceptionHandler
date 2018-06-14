package com.example.demo.controller.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.pojo.ErrorReturn;

@ControllerAdvice
public class ArithmeticExceptionHandler {

	/**
	 * 处理ArithmeticException异常
	 * @return
	 */
	@ResponseBody
	public ErrorReturn dealArithmeticException() {
		ErrorReturn errorObject = new ErrorReturn();
		errorObject.setReturnCode("-1");
		errorObject.setDesc("算数处理出现异常！");
		return errorObject;
	}

}
