
	/*
	* New Animal Class Name Cow.
	*/

	public class Cow extends Animal {

	public Cow()
	{
	//super();
	System.out.println("Now you are a Cow!");
	}

	@Override
	public String sleep() {
		return "A Cow sleeps...";
	}

	@Override
	public String eat() {
		return "A Cow eats...";
	}

	@Override
	public String Hunt() {
		return "A Cow Hunts...";
	}

	@Override
	public String Reproduce() {
		return "A Cow Reproduces...";
	}


	public String muhhh(){
		return "muhhh...";
	}


	}
