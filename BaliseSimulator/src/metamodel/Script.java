package metamodel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Script implements MMEntity {

	List<Command> commands;

	public Script() {
		this.commands = new ArrayList<>();
	}

	public void addCommand(Command c) {
		this.commands.add(c);
	}

	public void addAllCommands(List<Command> commandList) {
		this.commands.addAll(commandList);
	}

	public Iterator<Command> commandIterator() {
		return this.commands.iterator();
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitScript(this);

	}

}
