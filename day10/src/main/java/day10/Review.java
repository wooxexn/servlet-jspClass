package day10;

public class Review {
	String id;
    String content;

    public void setId(String id) {
		this.id = id;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	public Review(String id, String content) {
		super();
		this.id = id;
		this.content = content;
	}

	public String getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	@Override
	public String toString() {
		return "Review [id=" + id + ", content=" + content + "]";
	}
	
	
}
