package text.section_09;

public class SwitchSyntax_4 {

	public static void main(String[] args) {
		int ranking = 1;
		String award = "";
		
		
		award = switch(ranking) {
			case 1 -> "金メダル";
			case 2 -> "銀メダル";
			case 3 -> "銅メダル";
			default -> "参加賞";
		};
		
		System.out.println(award);

	}

}

