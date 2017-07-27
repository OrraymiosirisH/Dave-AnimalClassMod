
public class AnimalApp {

	public static void main(String[] args) {

		Animal a = new Animal();
		print(a.eat());
		print(a.sleep());
		print(a.Hunt());
		print(a.Reproduce());

		Cat c = new Cat();
		print(c.eat());
		print(c.sleep());
		//print(c.Hunt());
		//print(c.Reproduce());
		print(c.purr());
		

		Bird b = new Bird();
		print(b.eat());
		print(b.sleep());
		//print(b.Hunt());
		//print(b.Reproduce());
		print(b.fly());
		
		Jaguar j = new Jaguar();
		print(j.eat());
		print(j.sleep());
		print(j.Hunt());
		print(j.Reproduce());
		print(j.grrr());
		
		Cow v = new Cow();
		print(v.eat());
		print(v.sleep());
		print(v.Hunt());
		print(v.Reproduce());
		print(v.muhhh());
		

	}
	
	private static void print(String s){
		System.out.println(s);
	}
}

/*
**@Osiris Guevara.
** I also Created 2 more animals...
**I add the 2 new Methods to all Animals.
**
*/