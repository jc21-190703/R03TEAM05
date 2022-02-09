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
		if(iconNo==null) {
			this.iconNo=null;
		}else {
			this.iconNo=iconNo;
		}
	}
	public void setFoodName(String foodName) {
		if(foodName!=null) {
			this.foodName=foodName;
		}else {
			this.foodName=null;
		}
	}
	public void setExpryDate(String expryDate) {
		if(expryDate!=null) {
			this.expryDate=expryDate;
		}else {
			this.expryDate=null;
		}
	}
	public void setQuantity(String quantity) {
		if(quantity!=null) {
			this.quantity=quantity;
		}else {
			this.quantity=null;
		}
	}
	
	public void print() {
		System.out.println(this.iconNo+" "+this.foodName+" "+this.expryDate+" "+this.quantity);
	}
}
