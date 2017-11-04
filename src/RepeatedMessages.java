
public class RepeatedMessages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thousandMessages();
	}
	
	public static void tenMessages() {
        System.out.println("Milhouse did not test cootie positive.");
        System.out.println("Milhouse did not test cootie positive.");
        System.out.println("Milhouse did not test cootie positive.");
        System.out.println("Milhouse did not test cootie positive.");
        System.out.println("Milhouse did not test cootie positive.");
        System.out.println("Milhouse did not test cootie positive.");
        System.out.println("Milhouse did not test cootie positive.");
        System.out.println("Milhouse did not test cootie positive.");
        System.out.println("Milhouse did not test cootie positive.");
        System.out.println("Milhouse did not test cootie positive.");
    }
	
	public static void hundredMessages() {
		tenMessages();
		tenMessages();
		tenMessages();
		tenMessages();
		tenMessages();
		tenMessages();
		tenMessages();
		tenMessages();
		tenMessages();
		tenMessages();
	}
	
	public static void thousandMessages() {
		hundredMessages();
		hundredMessages();
		hundredMessages();
		hundredMessages();
		hundredMessages();
		hundredMessages();
		hundredMessages();
		hundredMessages();
		hundredMessages();
		hundredMessages();
	}
}
