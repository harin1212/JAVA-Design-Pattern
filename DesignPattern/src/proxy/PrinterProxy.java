package proxy;

/**
 * <h1>Printer Proxy</h1>
 * <p>
 * PrinterProxy 클래스는 Printable 인터페이스를 구현하여 프린터의 프록시 역할을 수행합니다.
 * </p>
 * 
 * @author harin
 * @version 1.0
 */

public class PrinterProxy implements Printable {
	private String name; // 이름
	private Printer real; // 본인

	/**
	 * 이름 없이 기본 생성자를 사용하여 PrinterProxy 객체를 생성합니다.
	 */
	public PrinterProxy() {
		this.name = "No Name";
		this.real = null;
	}

	/**
	 * 지정된 이름을 사용하여 PrintProxy 객체를 생성합니다.
	 * 
	 * @param name 프린터의 이름
	 */
	public PrinterProxy(String name) {
		this.name = name;
		this.real = null;
	}

	/**
	 * 프린터 이름을 취득합니다.
	 * 
	 * @return name
	 */
	@Override
	public String getPrinterName() {
		return name;
	}

	/**
	 * 프린터 이름을 설정합니다.
	 * 
	 * @param name 새로운 프린터의 이름
	 */
	@Override
	public synchronized void setPrinterName(String name) {
		if (real != null) {
			// 본인 에게도 설정한다
			real.setPrinterName(name);
		}
		this.name = name;
	}

	/**
	 * 문자열을 프린터로 출력합니다.
	 * 
	 * @param string 출력할 문자열
	 */
	@Override
	public void print(String string) {
		realize();
		real.print(string);

	}

	/**
	 * 실제 프린터 객체를 생성합니다. 이미 생성되어 있다면 생성하지 않습니다.
	 */
	private synchronized void realize() {
		if (real == null) {
			real = new Printer(name);
		}

	}

}
