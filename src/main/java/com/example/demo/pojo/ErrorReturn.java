package com.example.demo.pojo;

/**
 * 
 * The class ErrorReturn.
 *
 * Description:统一错误返回对象
 *
 * @author: huangjiawei
 * @since: 2018年6月13日
 * @version: $Revision$ $Date$ $LastChangedBy$
 *
 */
public class ErrorReturn {

	private String returnCode;
	private String desc;

	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public ErrorReturn(String returnCode, String desc) {
		super();
		this.returnCode = returnCode;
		this.desc = desc;
	}

	public ErrorReturn() {
		super();
	}

	@Override
	public String toString() {
		return "ErrorReturn [returnCode=" + returnCode + ", desc=" + desc + "]";
	}

}
