package metamodel;

public abstract class Command implements MMEntity {

	public abstract void accept (Visitor visitor);

}
