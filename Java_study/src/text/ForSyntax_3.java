package text;

public class ForSyntax_3 {

	public static void main(String[] args) {
		for( int i = 1; i < 11; i++ ) {
			
			if ( i== 3 ) {
				System.out.println("次に繰り返し処理に進みます");
				continue;
			}
			
			System.out.println(i);
		}

	}

}
