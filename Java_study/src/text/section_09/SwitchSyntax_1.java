package text.section_09;

public class SwitchSyntax_1 {

	public static void main(String[] args) {
        // 0～9のいずれかをランダムに生成
        int randNum = (int)(Math.random() * 10);

        // 乱数randNumの値を出力
        System.out.println(randNum);
        
        //当たり外れの判定
        switch(randNum) {
         case 9 -> System.out.println("大当たり");
         case 8 -> System.out.println("あたり");
         default -> System.out.println("ハズレ");
        }

	}

}
