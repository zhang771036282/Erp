package com.erp.utils;

public class AjaxResult {

	private boolean success;

	private String msg;

	private Object data;

	public AjaxResult(){

	}

	public AjaxResult(boolean success, String msg, Object data){
		this.success = success;
		this.msg = msg;
		this.data = data;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public static AjaxResult success(Object data){
		return new AjaxResult(true, null, data);
	}

	public static AjaxResult success(Object data, String msg){
		return new AjaxResult(true, msg, data);
	}

	public static AjaxResult success(String msg){
		return new AjaxResult(true, msg, null);
	}

    public static AjaxResult fail(String msg){
        return new AjaxResult(false, msg, null);
    }
    
    public static AjaxResult failLocation(Object data, String msg){
        return new AjaxResult(false, msg, data);
    }
}
