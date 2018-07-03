package com.zm.bean;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

public class Logs implements Serializable{
	private static final long serialVersionUID = -523751828515087879L;
	@Id
	private String logId;
	private String clazzName;
	private String methodName;
	private String params;
	private String tiem;//获取当前系统的时间，以实体类属性为主
	private String timeMax;//条件查询的结束时间
	private String timeMin;//条件查询的开始时间
	private String setIsexception;//存贮异常日志
	private Integer userid;	//存用户ID


	public String getSetIsexception() {
		return setIsexception;
	}

	public void setSetIsexception(String setIsexception) {
		this.setIsexception = setIsexception;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getTimeMax() {
		return timeMax;
	}
	public void setTimeMax(String timeMax) {
		this.timeMax = timeMax;
	}
	public String getTimeMin() {
		return timeMin;
	}
	public void setTimeMin(String timeMin) {
		this.timeMin = timeMin;
	}
	public String getParams() {
		return params;
	}
	public void setParams(String params) {
		this.params = params;
	}
	public String getLogId() {
		return logId;
	}
	public void setLogId(String logId) {
		this.logId = logId;
	}
	public String getClazzName() {
		return clazzName;
	}
	public void setClazzName(String clazzName) {
		this.clazzName = clazzName;
	}
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	
	public String getTiem() {
		return tiem;
	}
	public void setTiem(String tiem) {
		this.tiem = tiem;
	}


	@Override
	public String toString() {
		return "Logs{" +
				"logId='" + logId + '\'' +
				", clazzName='" + clazzName + '\'' +
				", methodName='" + methodName + '\'' +
				", params='" + params + '\'' +
				", tiem='" + tiem + '\'' +
				", timeMax='" + timeMax + '\'' +
				", timeMin='" + timeMin + '\'' +
				", setIsexception='" + setIsexception + '\'' +
				", userid=" + userid +
				'}';
	}
}
