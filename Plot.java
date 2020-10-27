public class Plot {
  
	private int x;
   private int y;
   private int width;
   private int depth;
 
   
   public Plot(){
    
	   this.x = 0;
       this.y = 0;
       this.width = 1;
       this.depth = 1;
   }
 
   public Plot(Plot p){
      
	   this.x = p.x;
       this.y = p.y;
       this.width = p.width;
       this.depth = p.depth;
   }
   
   public Plot(int x, int y, int width, int depth){
      
	   this.x = x;
       this.y = y;
       this.width = width;
       this.depth = depth;
   }
   
   public boolean overlaps(Plot plot){
	   boolean overlaps= false;
	  
	   if(x < plot.x + plot.width && x + width > plot.x && y < plot.y + plot.depth && y + depth > plot.y) {
			 overlaps = true;
		 }
		  
		   return overlaps;
   }
   
   public boolean encompasses(Plot plot) {
      
	   double newX = plot.getX()+plot.getWidth();
	   double newY = plot.getY() + plot.getDepth();
	   double Xs = x + width;
       double Ys = y + depth;
      
       
    
       return (this.x<=plot.getX() && plot.getX()<=Xs && this.y<=plot.getY() && plot.getY()<=Ys
               && this.x<=Xs && newX<=Xs
               && this.y<=newY && newY<=Ys);
   }


   public void setX(int x)
   {
       this.x = x;
   }
   public int getX()
   {
       return x;
   }
  
   public void setY(int y)
   {
       this.y = y;
   }
   public int getY()
   {
       return y;
   }

   public void setWidth(int width)
   {
       this.width = width;
   }
   public int getWidth()
   {
       return width;
   }
 
   public void setDepth(int depth)
   {
       this.depth = depth;
   }
   public int getDepth()
   {
       return depth;
   }
 
   public String toString()
   {
       return "Upper left: (" + x + " " + y + ") Width: " + width + " Depth: " + depth;
   }
}