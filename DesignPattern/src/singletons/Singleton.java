package singletons;

public class Singleton {
	private static Singleton singleton = new Singleton();

	// 생성자 private(외부에서 호출 금지)
	private Singleton() {
		System.out.println("Successfully created an instance.");
	}

	public static Singleton getInstance() {
		return singleton;
	}

}
