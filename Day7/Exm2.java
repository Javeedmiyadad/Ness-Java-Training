package Day7;

//factory design pattern

public class Exm2 {
	public static void main(String[] args) {
//		Audi a = new Audi();
//		a.getBrand();
//		a.getModel();  //this is normal usage
//		Bmw a1 = new Bmw();
//		a1.getBrand();
//		a1.getModel();
		Icar icar = carFactory.getCar(1);
		icar.getBrand();
		icar.getModel();
		icar.getPrice();
		System.out.println("********************************");
		Icar icar1 = carFactory.getCar(2);
		icar1.getBrand();
		icar1.getModel();
		icar1.getPrice();
		System.out.println("********************************");
		Icar icar2 = carFactory.getCar(3);
		icar2.getBrand();
		icar2.getModel();
		icar2.getPrice();
		System.out.println("********************************");
	}

}

interface Icar {
	void getBrand();

	void getModel();

	void getPrice();
}

class Audi implements Icar {
	@Override
	public void getBrand() {
		System.out.println("Audi New");
	}

	@Override
	public void getModel() {
		System.out.println("Audi A6");
	}

	@Override
	public void getPrice() {
		System.out.println("Audi Cost : 500000lakh");
	}
}

class Bmw implements Icar {
	@Override
	public void getBrand() {
		System.out.println("Bmw New");
	}

	@Override
	public void getModel() {
		System.out.println("Bmw A6");
	}

	@Override
	public void getPrice() {
		System.out.println("Bmw Cost : 400000lakh");
	}
}

class Honda implements Icar {
	@Override
	public void getBrand() {
		System.out.println("Honda New");
	}

	@Override
	public void getModel() {
		System.out.println("Honda A6");
	}

	@Override
	public void getPrice() {
		System.out.println("Honda Cost : 300000lakh");
	}
}

class carFactory {
	public static Icar getCar(int id) {
		switch (id) {
		case 1: {
			return new Audi();
		}
		case 2: { // Factory method
			return new Bmw();
		}
		case 3: {
			return new Honda();
		}
		default: {
			return null;
		}

		}
	}
}