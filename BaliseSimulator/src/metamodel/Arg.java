package metamodel;

public class Arg implements MMEntity {

	String id;
	String val;

	public Arg(String id, String val) {
		super();
		this.id = id;
		this.val = val;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub

	}

}
