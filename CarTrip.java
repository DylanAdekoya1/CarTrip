//Dylan Adekoya

public class CarTrip {
	//Instance Fields
	private int startO;
	private int endO;
	private int time;
	private int gallonsUsed;
	
	//Constructor
	public CarTrip(int start, int end, int theTime, int gal){
		this.startO= start;
		this.endO= end;
		this.time= theTime;
		this.gallonsUsed= gal;
	}
	
	//Getter Methods
	public int getStart(){
		return this.startO;
	}
	public int getEnd(){
		return this.endO;
	}
	public int getTime(){
		return this.time;
	}
	public int getGalu(){
		return this.gallonsUsed;
	}
	
	//Setter Methods
	public void setStart(int newStart){
		this.startO= newStart;
	}
	public void setEnd(int newEnd){
		this.endO= newEnd;
	}
	public void setTime(int newTime){
		this.time= newTime;
	}
	public void setGal(int newGal){
		this.gallonsUsed= newGal;
	}
	//Trip Distance Method
	public int getTripDistance(){
		return (this.endO-this.startO);

	}
//Average Speed Method
	public int getAverageSpeed(){
		return ((this.endO-this.startO)/this.time);
	}
	
	//get GasMileage
	public int getGasMileage(){
		return(this.gallonsUsed*20);
	}
	//get Total Gas Price
	public int getTGP(){
		return (this.getGasMileage());
	}
	
	//toString Method
	public String toString(){
		return ("Start Odometer: " + this.startO + "\nEnd Odometer: " + this.endO 
				+ "\nTime Made: " + this.time + " hours\nGallons Used: " + this.gallonsUsed
				+ "Distance Traveled: " +  this.getTripDistance() + " miles." + "\nSpeed: " + this.getAverageSpeed()
				+ "\nGallons of gas cost $20 so the gas mileage is: " + this.getGasMileage()
				+ "Total Gas Price: " + this.getTGP());
	}
	
