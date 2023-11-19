package com._POJOs_Vs_JavaBeans_Vs_SpringBeans;

import java.io.Serializable;

@SuppressWarnings("serial")
public class JavaBean implements Serializable {
	/**
	 * 	must have getters and Setters.
	 * 	Don't have parameterize constructor.
	 */

	private String myName;

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

//	public JavaBean(String myName) {
//		
//		this.myName = myName;
//	}
	
	
}
