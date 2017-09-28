package test.domain;

public class Parent {
	
	private String parentProp1;
	private int parentProp2;
	private Integer parentProp3;
	private boolean parentProp4;
	private Boolean parentProp5;
	private float parentProp6;
	private Child parentProp7;
	
	@Override
	public String toString() {
		return "Parent [parentProp1=" + parentProp1 + ", parentProp2=" + parentProp2 + ", parentProp3=" + parentProp3 + ", parentProp4=" + parentProp4 + ", parentProp5=" + parentProp5 + ", parentProp6=" + parentProp6 + ", parentProp7=" + parentProp7 + "]";
	}
	
	public Parent(String parentProp1, int parentProp2, Integer parentProp3, boolean parentProp4, Boolean parentProp5, float parentProp6, Child parentProp7) {
		super();
		this.parentProp1 = parentProp1;
		this.parentProp2 = parentProp2;
		this.parentProp3 = parentProp3;
		this.parentProp4 = parentProp4;
		this.parentProp5 = parentProp5;
		this.parentProp6 = parentProp6;
		this.parentProp7 = parentProp7;
	}
	
	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Integer getParentProp3() {
		return parentProp3;
	}
	
	public void setParentProp3(Integer parentProp3) {
		this.parentProp3 = parentProp3;
	}
	
	public float getParentProp6() {
		return parentProp6;
	}
	
	public void setParentProp6(float parentProp6) {
		this.parentProp6 = parentProp6;
	}
	
	public Child getParentProp7() {
		return parentProp7;
	}
	
	public void setParentProp7(Child parentProp7) {
		this.parentProp7 = parentProp7;
	}
	
	public void setParentProp4(boolean parentProp4) {
		this.parentProp4 = parentProp4;
	}
	
	public void setParentProp5(Boolean parentProp5) {
		this.parentProp5 = parentProp5;
	}
	
	public String getParentProp1() {
		return parentProp1;
	}
	
	public void setParentProp1(String parentProp1) {
		this.parentProp1 = parentProp1;
	}
	
	public int getParentProp2() {
		return parentProp2;
	}
	
	public void setParentProp2(int parentProp2) {
		this.parentProp2 = parentProp2;
	}
	
	public boolean isParentProp4() {
		return parentProp4;
	}
	
	public Boolean getParentProp5() {
		return parentProp5;
	}
	
}
