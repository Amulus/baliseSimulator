package metamodel;

import java.util.List;


public class Call implements MMEntity {

	String idVar;
	String idMeth;
	List<Arg> args;
	public Call(String idVar, String idMeth, List<Arg> args) {
		super();
		this.idVar = idVar;
		this.idMeth = idMeth;
		this.args = args;
	}
	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visitCall(this);
	}

}
