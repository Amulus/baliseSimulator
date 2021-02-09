package metamodel;

public interface Visitor {
	public void visitScript(Script day);
	public void visitCommand(Command meeting);
	public void visitAssign(Assign practice);
	public void visitCall(Call schedule);
	public void visitArg(Arg sleeping);
}
