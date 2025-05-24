package Model;
import java.time.LocalDateTime;

public class Booking {
	private int id;
    private String customerName;
    private String phoneNumber;
    private String email;
    private int numberOfGuests;
    private LocalDateTime bookingTime;
    private String note;
    private String status;
    
    
	public Booking() {
		super();
	}
	public Booking(int id, String customerName, String phoneNumber, String email, int numberOfGuests, LocalDateTime bookingTime,
			String note, String status) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.numberOfGuests = numberOfGuests;
		this.bookingTime = bookingTime;
		this.note = note;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNumberOfGuests() {
		return numberOfGuests;
	}
	public void setNumberOfGuests(int numberOfGuests) {
		this.numberOfGuests = numberOfGuests;
	}
	public LocalDateTime getBookingTime() {
		return bookingTime;
	}
	public void setBookingTime(LocalDateTime bookingTime) {
		this.bookingTime = bookingTime;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
    
	
    
}
