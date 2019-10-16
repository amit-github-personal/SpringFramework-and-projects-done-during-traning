/**
 * 
 */
package com.springjdbc.SpringResultSetExtractor;

/**
 * @author Amit
 *
 */
public class Employey {
	
	private int Em_id;
	private String Em_name;
	private String desig;
	private String dept;
	private int age;
	
	public int getEm_id() {
		return Em_id;
	}
	public void setEm_id(int em_id) {
		Em_id = em_id;
	}
	public String getEm_name() {
		return Em_name;
	}
	public void setEm_name(String em_name) {
		Em_name = em_name;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
