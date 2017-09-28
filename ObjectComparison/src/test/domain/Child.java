package test.domain;

public class Child {
	
	private String childProp1;
	private int childProp2;
	private GrandChild childProp3;
	
	@Override
	public String toString() {
		return "Child [childProp1=" + childProp1 + ", childProp2=" + childProp2 + ", childProp3=" + childProp3 + "]";
	}
	
	public Child() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Child(String childProp1, int childProp2, GrandChild childProp3) {
		super();
		this.childProp1 = childProp1;
		this.childProp2 = childProp2;
		this.childProp3 = childProp3;
	}
	
	public String getChildProp1() {
		return childProp1;
	}
	
	public void setChildProp1(String childProp1) {
		this.childProp1 = childProp1;
	}
	
	public int getChildProp2() {
		return childProp2;
	}
	
	public void setChildProp2(int childProp2) {
		this.childProp2 = childProp2;
	}
	
	public GrandChild getChildProp3() {
		return childProp3;
	}
	
	public void setChildProp3(GrandChild childProp3) {
		this.childProp3 = childProp3;
	}
	
}
