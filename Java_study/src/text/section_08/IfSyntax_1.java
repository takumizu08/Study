package text.section_08;

public class IfSyntax_1 {

	public static void main(String[] args) {
        // 0～9のいずれかをランダムに生成（乱数を10倍して小数部分を切り捨て）
		int randNum = (int)(Math.random() * 10);
		
		System.out.println(randNum);
		
		if( randNum == 9 ) {
			System.out.println("大当たりです");
		} else if( randNum == 8 ) {
			System.out.println("あたりです");
		} else {
			System.out.println("ハズレです");
		}
	}
}
