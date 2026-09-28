public class codeA {
	// テスト結果保持Model
	public String code1;

	public int code2;

	public codeA(String code1, int code2) {

		this.code1 = code1;
		this.code2 = code2;
	}

	public void codeA(String code1, int code2) {

		this.code1 = code1;
		this.code2 = code2;
	}

	public void codeA() {
		System.out.println(code1 + "：" + code2 + "点");
	}

	public String getCode1() {
		return code1;
	}

	public void setCode1(String code1) {
		this.code1 = code1;
	}

	public int getCode2() {
		return code2;
	}

	public void setCode2(int code2) {
		this.code2 = code2;
	}

}
