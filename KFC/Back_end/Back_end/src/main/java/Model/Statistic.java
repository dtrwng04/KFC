package Model;

public class Statistic {
	private int totalBookings;
    private int totalCustomers;
    private double totalRevenue;
    private MenuItem topMenuItem;
    
    
	public Statistic() {
		super();
	}
	public Statistic(int totalBookings, int totalCustomers, double totalRevenue, MenuItem topMenuItem) {
		super();
		this.totalBookings = totalBookings;
		this.totalCustomers = totalCustomers;
		this.totalRevenue = totalRevenue;
		this.topMenuItem = topMenuItem;
	}
	public int getTotalBookings() {
		return totalBookings;
	}
	public void setTotalBookings(int totalBookings) {
		this.totalBookings = totalBookings;
	}
	public int getTotalCustomers() {
		return totalCustomers;
	}
	public void setTotalCustomers(int totalCustomers) {
		this.totalCustomers = totalCustomers;
	}
	public double getTotalRevenue() {
		return totalRevenue;
	}
	public void setTotalRevenue(double totalRevenue) {
		this.totalRevenue = totalRevenue;
	}
	public MenuItem getTopMenuItem() {
		return topMenuItem;
	}
	public void setTopMenuItem(MenuItem topMenuItem) {
		this.topMenuItem = topMenuItem;
	}
    
    
}
