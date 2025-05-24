package Model;
import java.time.LocalDate;

public class Promotion {
	 private int id;
	    private String title;
	    private String description;
	    private LocalDate startDate;
	    private LocalDate endDate;
	    private boolean isActive;
	    
	    
		public Promotion() {
			super();
		}


		public Promotion(int id, String title, String description, LocalDate startDate, LocalDate endDate,
				boolean isActive) {
			super();
			this.id = id;
			this.title = title;
			this.description = description;
			this.startDate = startDate;
			this.endDate = endDate;
			this.isActive = isActive;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getTitle() {
			return title;
		}


		public void setTitle(String title) {
			this.title = title;
		}


		public String getDescription() {
			return description;
		}


		public void setDescription(String description) {
			this.description = description;
		}


		public LocalDate getStartDate() {
			return startDate;
		}


		public void setStartDate(LocalDate startDate) {
			this.startDate = startDate;
		}


		public LocalDate getEndDate() {
			return endDate;
		}


		public void setEndDate(LocalDate endDate) {
			this.endDate = endDate;
		}


		public boolean isActive() {
			return isActive;
		}


		public void setActive(boolean isActive) {
			this.isActive = isActive;
		}
	    
	    
}
