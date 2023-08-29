package template_method;

public class CharDisplay extends AbstractDisplay {
	private char ch;

	// 생성자
	public CharDisplay(char ch) {
		this.ch = ch;
	}

	@Override
	public void open() {
		System.out.println("<<");

	}

	@Override
	public void print() {
		System.out.println(ch);

	}

	@Override
	public void close() {
		System.out.println(">>");

	}

}
