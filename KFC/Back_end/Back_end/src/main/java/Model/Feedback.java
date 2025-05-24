package Model;
import java.time.LocalDateTime;

public class Feedback {
	private int id;
    private String name;
    private String email;
    private String message;
    private LocalDateTime submittedAt;
    private String status;
    
    
	public Feedback() {
		super();
	}
	public Feedback(int id, String name, String email, String message, LocalDateTime submittedAt, String status) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.message = message;
		this.submittedAt = submittedAt;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public LocalDateTime getSubmittedAt() {
		return submittedAt;
	}
	public void setSubmittedAt(LocalDateTime submittedAt) {
		this.submittedAt = submittedAt;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	} 
    
    
}
