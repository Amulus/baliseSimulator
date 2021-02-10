package metamodel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Call extends Command implements MMEntity {

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
		visitor.visitCall(this);

	}
	public String getIdVar() {
		return idVar;
	}
	public void setIdVar(String idVar) {
		this.idVar = idVar;
	}
	public String getIdMeth() {
		return idMeth;
	}
	public void setIdMeth(String idMeth) {
		this.idMeth = idMeth;
	}
	
	public void addArg(Arg arg) {
		this.args.add(arg);
	}
	
	public void addAllArgs (List<Arg> argList) {
		this.args.addAll(argList);
	}
	
	public Iterator<Arg> argsIterator(){
		return this.args.iterator();
	}

}
