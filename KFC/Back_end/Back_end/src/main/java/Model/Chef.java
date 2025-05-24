package Model;

public class Chef {
	private int id;
    private String name;
    private String specialty;
    private double rating;
    
    
	public Chef() {
		super();
	}


	public Chef(int id, String name, String specialty, double rating) {
		super();
		this.id = id;
		this.name = name;
		this.specialty = specialty;
		this.rating = rating;
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


	public String getSpecialty() {
		return specialty;
	}


	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}


	public double getRating() {
		return rating;
	}


	public void setRating(double rating) {
		this.rating = rating;
	}
    
    
}
