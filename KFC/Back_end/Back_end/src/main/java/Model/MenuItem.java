package Model;

public class MenuItem {
	 private int id;
	    private String name;
	    private String description;
	    private double price;
	    private String category;
	    private String imageUrl;
	    private boolean available;
	    
	    
		public MenuItem() {
			super();
		}
		public MenuItem(int id, String name, String description, double price, String category, String imageUrl,
				boolean available) {
			super();
			this.id = id;
			this.name = name;
			this.description = description;
			this.price = price;
			this.category = category;
			this.imageUrl = imageUrl;
			this.available = available;
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
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public String getImageUrl() {
			return imageUrl;
		}
		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}
		public boolean isAvailable() {
			return available;
		}
		public void setAvailable(boolean available) {
			this.available = available;
		}
	    
		
	    
}
