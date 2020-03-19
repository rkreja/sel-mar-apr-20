package students.assignments.marina;

public class SmartPhone {

	private String type = "iphone";
	private boolean videocall = true;
	private boolean insert = true;

	public SmartPhone(String newType, boolean newVideocall, boolean newInsert) {
		type = newType;
		videocall = newVideocall;
		insert = newInsert;
	}

	public void type() {
		System.out.println(type);
	}

	public void calling1234() {
		System.out.println(type + " is calling to 1234");
	}

	public void sendtext() {
		System.out.println(type + " is texting to 1234");
	}

	public void canvideocall() {
		System.out.println(" Videocall " + videocall + " for " + type);
	}

	public void insert() {
		System.out.println(" Inserting sdCard  is  " + insert + "   for " + type);
	}
}
