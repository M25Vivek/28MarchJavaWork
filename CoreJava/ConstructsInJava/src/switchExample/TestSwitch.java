package switchExample;

public class TestSwitch {

	public static void main(String[] args) {
		String color ="red";
		switch(color) {
		case "green":
			System.out.println("you got green");
		     break;
		case "blue":
			System.out.println("you got blue");
			break;
		case "red":
			System.out.println("you got red");
			break;
		default:
			System.out.println("i got no color");
		}

	}

}
