package metamodel;

public class Assign extends Command implements MMEntity {

	

	String id;
	String value;

	public Assign(String id, String value) {
		super();
		this.id = id;
		this.value = value;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitAssign(this);

	}

}
