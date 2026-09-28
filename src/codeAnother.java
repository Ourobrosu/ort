import java.util.Scanner;

public class codeAnother {
	public static void main(String[] args) {
		Scanner wacher = new Scanner(System.in);

		System.out.print("教科を入力: ");
		String Another1 = wacher.nextLine();

		System.out.print("点数を入力: ");
		int Another2 = wacher.nextInt();

		codeA conclusion = new codeA(Another1, Another2);
		conclusion.codeA();

		if (conclusion.code2 == 100) {
			System.out.println("申し分無し");
		} else if (conclusion.code2 >= 101) {
			System.out.println("error");
		} else if (conclusion.code2 >= 90) {
			System.out.println("あと、もう少し");
		} else if (conclusion.code2 >= 70) {
			System.out.println("ケアレスミスがあったかもしれない");
		} else if (conclusion.code2 >= 50) {
			System.out.println("危機感をもった方が良い");
		} else if (conclusion.code2 >= 31) {
			System.out.println("赤点ギリギリ");
		} else if (conclusion.code2 >= 0) {
			System.out.println("赤点");
		} else if (conclusion.code2 < 0) {
			System.out.println("error");

		} else {
			System.out.println("error");
		}

		if (conclusion.code2 < 100) {
			if (conclusion.code1.equals("国語")) {
				System.out.println("文章読解、漢字、文法などを確認しよう");
			} else if (conclusion.code1.equals("数学")) {
				System.out.println("計算ミスがないか確認しよう");
			} else if (conclusion.code1.equals("英語")) {
				System.out.println("スペルが間違ってないか、聞き間違いがないか確認しよう");
			} else if (conclusion.code1.equals("理科")) {
				System.out.println("難しい単語と仕組みをしっかり覚えよう");
			} else if (conclusion.code1.equals("社会")) {
				System.out.println("時系列と、難しい単語をしっかり覚えよう");
			}
		} else if (conclusion.code2 == 100) {
			if (conclusion.code1.equals("国語")) {
				System.out.println("次に備えよう");
			} else if (conclusion.code1.equals("数学")) {
				System.out.println("次に備えよう");
			} else if (conclusion.code1.equals("英語")) {
				System.out.println("次に備えよう");
			} else if (conclusion.code1.equals("社会")) {
				System.out.println("次に備えよう");
			} else if (conclusion.code1.equals("理科")) {
				System.out.println("次に備えよう");
			}
		} else {
			System.out.println("error");
		}

		wacher.close();
	}
}