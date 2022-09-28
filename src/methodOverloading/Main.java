package methodOverloading;

public class Main {

	public static void main(String[] args) {
		DortIslemOverload dortIslemOverload = new DortIslemOverload();
		System.out.println(dortIslemOverload.topla(2, 3));
		dortIslemOverload.topla(2, 3, 4);

	}

}
