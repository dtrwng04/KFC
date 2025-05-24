package Model;

import java.util.Objects;

public class NhanVien {
	private int id;
    private String username;
    private String password;
    private String fullName;
	public NhanVien() {
		super();
	}
	public NhanVien(int id, String username, String password, String fullName) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.fullName = fullName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(fullName, id, password, username);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NhanVien other = (NhanVien) obj;
		return Objects.equals(fullName, other.fullName) && id == other.id && Objects.equals(password, other.password)
				&& Objects.equals(username, other.username);
	}
    
    
}
