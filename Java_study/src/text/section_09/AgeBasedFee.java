package text.section_09;

public class AgeBasedFee {

	public static void main(String[] args) {
		int age = 30;
		int money = 3000;

		age = switch(money) {
		case 30 -> 3000;
		case 2 -> 2000;
		case 3 -> 1000;
		default -> 0;
		};
		
		System.out.println(age);
	}

}
