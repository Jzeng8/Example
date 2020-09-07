import java.util.Scanner;

public class Assignment {
	public static void main(String[] args) {
		String a,b,c,d;
		
		Scanner newscanner = new Scanner(System.in); //this is to start cin 
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.\n");
		System.out.println("First step: reboot your computer");
		System.out.println("Are you able to connect with the internet? (yes or no)");
		a = newscanner.nextLine();// this is cin
		
		if(a.equals("no")){
			System.out.println("Second step: reboot your router");
			System.out.println("Now are you able to connect with the internet? (yes or no)");
		}else{
			System.out.println("Rebooting your computer seemed to work");
			System.exit(0);
		}
		b = newscanner.nextLine();
	
		if(b.equals("no")){
			System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power");
			System.out.println("Now are you able to connect with the internet? (yes or no)");
						
		}else{
			System.out.println("rebooting your router seem to work");
			System.exit(0);
		}
	
		c = newscanner.nextLine();
	
		if(c.equals("no")){
			System.out.println("Fourth step: move your computer closer to your router");
			System.out.println("Now are you able to connect with the internet? (yes or no)");
		
		}else{
			System.out.println("Checking the router cables seem to work");
			System.exit(0);
		}
	
		d = newscanner.nextLine();
	
		if(d.equals("no")){
			System.out.println("Fifth step: contact your ISP");
			System.out.println("Make sure your ISP is hooked up to your router");
		}else {
			System.out.println("Moving your computer closer to the router seems to work");
			System.exit(0);
		}
	
		System.exit(0);

		}
}

