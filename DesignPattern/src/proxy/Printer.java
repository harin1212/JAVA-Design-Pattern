package proxy;

/**
 * <h1>Printer</h1>
 * <p>
 * Printer 클래스는 Pintable 인터페이스를 구현하며 프린터 객체를 나타냅니다.
 * </p>
 * <p>
 * 이 클래스는 프린터의 이름을 설정하고 얻는 메서드를 제공하며, 프린터를 사용하여 텍스트를 출력하는 기능을 제공합니다.
 * </p>
 * <p>
 * 또한 이 클래스는 잠깐의 지연을 포함한 무거운 작업을 시뮬레이션하는데 사용됩니다. 이는 설명 목적으로 사용됩니다.
 * </p>
 * 
 * @author harin
 * @version 1.0
 */

public class Printer implements Printable {
	private String name; // 프린터 이름

	/**
	 * 생성자 이름을 지정하지 않고 <code>Printer</code> 인스턴스를 생성합니다. 작업 시뮬레이션을 위한 지연을 포함합니다.
	 */
	public Printer() {
		heavyJob("Creating Printer Instance");
	}

	/**
	 * 생성자 지정된 이름으로 <code>Printer</code> 인스턴스를 생성합니다.
	 * 
	 * @param name
	 */
	Printer(String name) {
		this.name = name;
		heavyJob("Creating Printer instance(" + name + ")");
	}

	// 이름 설정
	@Override
	public void setPrinterName(String name) {
		this.name = name;

	}

	// 이름 취득
	@Override
	public String getPrinterName() {
		return name;
	}

	// 이름 붙여서 표시
	@Override
	public void print(String string) {
		System.out.println("=== " + name + " ===");
		System.out.println(string);

	}

	// 무거운 작업이라고 가정
	private void heavyJob(String msg) {
		System.out.println(msg);
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(".");
		}
		System.out.println("finish");
	}

}
