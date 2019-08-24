package com.gagko.project.selectTest.vo;

public class VO {
	
	int testPkey 	 ;
	String testName  ;
	String testPhone ;
	public int getTestPkey() {
		return testPkey;
	}
	public void setTestPkey(int testPkey) {
		this.testPkey = testPkey;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public String getTestPhone() {
		return testPhone;
	}
	public void setTestPhone(String testPhone) {
		this.testPhone = testPhone;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
