package metamodel;

import java.util.List;

public class Script implements MMEntity {
	
	List<Command> commandList;
	
	public Script(List<Command> commands) {
		// TODO Auto-generated constructor stub
		this.commandList = commands;
	}

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visitScript(this);
	}

}
