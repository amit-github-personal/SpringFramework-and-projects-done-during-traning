/** Developed by Amit Mishra
 * Date : Sep 15, 20198:18:26 PM
 */
package com.springjdbc.SpringAutoWire;

/**
 * @author Amit
 *
 */
public class Marks {
	
	private int Chem;;
	private int Phy;
	private int math;
	private int java;
	
	public int getChem() {
		return Chem;
	}
	public void setChem(int chem) {
		Chem = chem;
	}
	public int getPhy() {
		return Phy;
	}
	public void setPhy(int phy) {
		Phy = phy;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	
	@Override
	public String toString() {
		return "Marks [Chem=" + Chem + ", Phy=" + Phy + ", math=" + math + ", java=" + java + "]";
	}

}
