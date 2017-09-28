package test.domain;

public class GrandChild {
	
	private String granChildProp1;
	private int granChildProp2;
	
	@Override
	public String toString() {
		return "GrandChild [granChildProp1=" + granChildProp1 + ", granChildProp2=" + granChildProp2 + "]";
	}
	
	public GrandChild() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GrandChild(String granChildProp1, int granChildProp2) {
		super();
		this.granChildProp1 = granChildProp1;
		this.granChildProp2 = granChildProp2;
	}
	
	public String getGranChildProp1() {
		return granChildProp1;
	}
	
	public void setGranChildProp1(String granChildProp1) {
		this.granChildProp1 = granChildProp1;
	}
	
	public int getGranChildProp2() {
		return granChildProp2;
	}
	
	public void setGranChildProp2(int granChildProp2) {
		this.granChildProp2 = granChildProp2;
	}
	
}
