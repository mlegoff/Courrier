package courriers;

public abstract class Letter<T extends Content> implements Content {

	protected T content;
	protected Inhabitant receiver;
	protected Inhabitant sender;

	/**
	 * @param content
	 * @param receiver
	 * @param sender
	 */
	public Letter(T content, Inhabitant receiver, Inhabitant sender) {
		this.content = content;
		this.receiver = receiver;
		this.sender = sender;
	}

	public abstract void action();

	public abstract int getCost();

	public T getContent() {
		return this.content;
	}

	public Inhabitant getReceiver() {
		return this.receiver;
	}

	public Inhabitant getSender() {
		return this.sender;
	}

	public String toString() {
		return "a letter whose content is " + content.toString();
	}

}
