import javafx.scene.layout.Region;

public class ManagementCompany {


	private final int MAX_PROPERTY = 5;
	private double mgmFeePer;
	private String name;
	private Property[] properties;
	private String taxID;
	private int MGMT_WIDTH = 10;
	private int MGMT_DEPTH = 10;
	private Plot plot ;


	public ManagementCompany() {

		properties = new Property[MAX_PROPERTY];
		this.taxID = "";
		this.plot = new Plot (0,0,MGMT_WIDTH,MGMT_DEPTH);
		this.name= "";
	}


	public ManagementCompany(java.lang.String name, java.lang.String taxID, double mgmFeePer) {

		properties = new Property[MAX_PROPERTY];
		this.taxID = taxID;
		this.mgmFeePer = mgmFeePer;
		this.plot = new Plot (0,0,10,10);
		this.name = name;
	}

	public ManagementCompany(java.lang.String name, java.lang.String taxID, double mgmFeePer,int x, int y, int width, int depth) {

		properties = new Property[MAX_PROPERTY];
		this.taxID = taxID;
		this.mgmFeePer = mgmFeePer;
		this.name = name;


	}
	public ManagementCompany(ManagementCompany otherCompany) {

		properties = new Property[MAX_PROPERTY];

		taxID = otherCompany.taxID;
		mgmFeePer = otherCompany.mgmFeePer;
		plot = otherCompany.plot;
		name = otherCompany.name;
	}

	private int num =0;
	public int addProperty(Property property) {

		for(int i =0; i < num; i++) {
			if(properties[i].getPlot().overlaps(property.getPlot())) {
				return -4;
			}
		}
		if(!this.plot.encompasses(property.getPlot()) ) {
			return  -3;
		}

		if(property== null) {
			return  -2;

		}
		if(num >= MAX_PROPERTY) {
			return  -1;
		}
		else 
		{
			properties[num]=property;
			num++;
			
		}
		return num-1;
	}

	public int addProperty(String name, String city, double rent, String owner){


		Property property = new Property(name,city,rent,owner);


		for(int i =0; i < num; i++) {
			if(properties[i].getPlot().overlaps(property.getPlot())) {


				return -4;
			}
		}

		if(num >= MAX_PROPERTY) {
			return  -1;
		}

		if(property== null) {
			return  -2;

		}
		if(!this.plot.encompasses(property.getPlot()) ) {
			return  -3;
		}
		else 
		{
			properties[num]=property;
			num++;
		}
		return num-1;
	}



	public int addProperty(String name, String city, double rent, String owner, int x, int y, int width,int depth) {

		Property property = new Property(name, city, rent, owner, x, y,width, depth);


		for(int i =0; i < num; i++) {
			if(properties[i].getPlot().overlaps(property.getPlot())) {


				return -4;
			}
		}

		if(!this.plot.encompasses(property.getPlot()) ) {
			return  -3;
		}

		if(property== null) {
			return  -2;

		}
		if(num >= MAX_PROPERTY) {
			return  -1;
		}
		else 
		{
			properties[num]=property;
			num++;
	
		}
		return num-1;
	}



	public int getMAX_PROPERTY() {
		return MAX_PROPERTY;
	}


	public double totalRent() {

		double totalRent =0.0 ;

		for(int i = 0; i < num; i++) {
			if(properties[i] != null) {


				totalRent += properties[i].getRentAmount();
			}
		}
		
		int i =0;
		if(properties[i ].equals(null)) {
			return totalRent;
			}
		return totalRent;
	}


	public int maxPropertyRentIndex() {

		int MaxRent=0;

		for (int a =0; a < num; a++) {

			if(properties[a] != null) {

				if(properties[MaxRent].getRentAmount() < properties[a].getRentAmount()) {
					MaxRent = a;
				}

			}
			if(properties[a].equals(null)) {
				return MaxRent;
				}
		}

		return MaxRent;
	}


	public double maxRentProp() {

		double Amount = 0;
		Amount = properties[maxPropertyRentIndex()].getRentAmount();
		return Amount;
	}

	public String displayPropertyAtIndex(int i){

		String display = "";
		
		if(properties[i].equals(null)) {
		return display;
		}
		if(properties[i] != null) {
			display= ("Owner: " + properties[i].getOwner() + "City: " + properties[i].getCity() + "Property Name: " + properties[i].getPropertyName() + "Rent Amount: " + properties[i].getRentAmount()+ "Plot: " + properties[i].getPlot());
		}
		return display;
	}

	public String toString() {

		double fee;
		String managementinfo = "";
		String info = "";
		fee = mgmFeePer/100;
		System.out.println("List of the properties for Alliance, taxID: " + taxID + "\n _________________________________________________");
		for(int a = 0; a < 5; a++){
			if(properties[a] != null){
				managementinfo = (" Property Name: " + properties[a].getPropertyName() +"\n" +" Located in: " + properties[a].getCity() + "\n" + " Belonging to: " + properties[a].getOwner() + "\n" + " Rent Amount: " + properties[a].getRentAmount() + "\n"); 
				System.out.print(managementinfo);
			}
		}
		System.out.println("________________________________________________\n Total Management Fee: " + fee*totalRent());
		return info;
	}


	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	public Plot getPlot() {
		// TODO Auto-generated method stub
		return plot;
	}

}