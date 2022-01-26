package edit;

public class FoodDate {
	String iconNo;
	String foodName;
	String expryDate;
	String quantity;
	
	public FoodDate() {
		this.iconNo="NotEntered.";
		this.foodName="NotEntered.";
		this.expryDate="NotEntered.";
		this.quantity="NotEntered.";
	}
	
//get
	public String getIconNo() {
		return iconNo;
	}
	public String getFoodName() {
		return foodName;
	}
	public String getExpryDate() {
		return expryDate;
	}
	public String getQuantity() {
		return quantity;
	}
	
//set
	public void setIconNo(String iconNo) {
		this.iconNo=iconNo;
	}
	public void setFoodName(String foodName) {
		this.foodName=foodName;
	}
	public void setExpryDate(String expryDate) {
		this.expryDate=expryDate;
	}
	public void setQuantity(String quantity) {
		this.quantity=quantity;
	}
	
	public void print() {
		System.out.println(this.iconNo+this.foodName+this.expryDate+this.quantity);
	}
}
