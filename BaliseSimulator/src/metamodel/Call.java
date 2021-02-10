package metamodel;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;

public class Call implements MMEntity {

	String idVar;
	String idMeth;
	List<Arg> args;
	public Call(String idVar, String idMeth) {
		super();
		this.idVar = idVar;
		this.idMeth = idMeth;
		this.args = new ArrayList<>();
	}
	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub

	}

}
