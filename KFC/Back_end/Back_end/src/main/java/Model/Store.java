package Model;

public class Store {
	private int id;
    private String name;
    private String address;
    private String phone;
    private String city;
    
    
	public Store() {
		super();
	}
	public Store(int id, String name, String address, String phone, String city) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.city = city;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
    
    
}
