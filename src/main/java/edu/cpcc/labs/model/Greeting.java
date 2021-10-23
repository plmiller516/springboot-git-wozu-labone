package edu.cpcc.labs.model;

public class Greeting {

	private Long id;
	private String message;
	
	public Greeting (long id, String message) {
		this.setId(id);
		this.setMessage(message);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(this.getId());
		builder.append(":");
		builder.append(this.getMessage());
		return builder.toString();
	}
}
