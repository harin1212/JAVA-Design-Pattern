package proxy;

/**
 * Main 클래스는 프록시 패턴을 사용하여 프린터를 테스트하는 예제를 제공합니다.
 * 
 * @version : 1.0.1
 * @author : harin
 * 
 */

public class Main {
	public static void main(String[] args) {
		Printable p = new PrinterProxy("Alice");
		System.out.println("My current name is " + p.getPrinterName() + ".");
		p.setPrinterName("Bob");
		System.out.println("My current name is " + p.getPrinterName() + ".");
		p.print("Hello world");
	}

}
