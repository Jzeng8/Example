public class Property {

  private String  city;
  private String owner;
  private String propertyName;
  double rentAmount;
  private Plot plot;



public Property (){

city = "";

owner = "";

propertyName = "";

rentAmount = 0.0;

this.plot = new Plot(0,0,1,1);

}

public Property(Property p) {

    this.propertyName = p.propertyName;
    this.city = p.city;
    this.owner = p.owner;
    this.rentAmount = p.rentAmount;
}


   public Property(java.lang.String propertyName, java.lang.String city, double rentAmount, java.lang.String owner) {

       this.propertyName = propertyName;
       this.city = city;
       this.owner = owner;
       this.rentAmount = rentAmount;
   }


   
   public Property(java.lang.String propertyName, java.lang.String city, double rentAmount, java.lang.String owner, int x, int y, int width, int depth) {
	   
	   this.propertyName = propertyName;
	   this.city = city;
       this.owner = owner;
       this.rentAmount = rentAmount;
       this.plot = new Plot(x,y, width,depth);
   }
   
   
   
   
   
   public void setPropertyName(String name) {
       this.propertyName = name;
   }

   public String getPropertyName() {
       return propertyName;
   }

   public void setCity(String city) {
       this.city = city;
   }
   public String getCity() {
       return city;
   }

   public Plot setPlot(int x, int y, int width, int depth) {
	   
	   this.plot = new Plot(x,y,width,depth);
	  
	   return plot;
   }
   
   public Plot getPlot() {
	   
	
	   return plot;
   }
  
   public void setOwner(String owner) {
       this.owner = owner;
   }
   public String getOwner() {
       return owner;
   }

   public void setRentAmount(double rentAmount) {
       this.rentAmount = rentAmount;
   }

   public double getRentAmount() {
       return rentAmount;
   }

 
   @Override
   public String toString() {
       return "Property [name=" + propertyName + ", city=" + city + ", owner=" + owner
               + ", rentAmount=" + rentAmount + "]";
   }


}