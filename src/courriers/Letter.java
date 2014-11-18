package courriers;

public class Letter<T extends Content> implements Content {

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

	public void action() {
	}

	public T getContent() {
		return this.content;
	}

	public int getCost() {
		return 0;
	}

	public Inhabitant getReceiver() {
		return this.receiver;
	}

	public Inhabitant getSender() {
		return this.sender;
	}

	public String toString() {
		return "letter";
	}

}
