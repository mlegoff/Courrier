package courriers;

public abstract class AbstractContent<T> implements Content {

	private T value;

	public AbstractContent(T value) {
		this.value = value;
	}

	/**
	 * @return the value
	 */
	public T getValue() {
		return value;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "a " + value.getClass().toString().toLowerCase() + " content ("
				+ value + ")";
	}

}
