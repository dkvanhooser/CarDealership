
public class UsedCar extends Car{
	
int miles;

public UsedCar(String make, String model, int year, double price, int miles) {
	super(make, model, year, price);
	this.miles = miles;
	}
	

public int getMiles() {
	return miles;
}

public void setMiles(int miles) {
	this.miles = miles;
}

public String toString(){
	
	return (getMake() + "\t" + getModel() + "\t" +getYear() + "\t($" + getPrice() +")\t"+getMiles()+" miles" );
	
}

}
