
/*
* New Animal Class Name Jaguar.
*/

public class Jaguar extends Animal {

public Jaguar()
{
//super();
System.out.println("Now I am a Jaguar!");
}

@Override
public String sleep() {
	return "A Jaguar sleeps...";
}

@Override
public String eat() {
	return "A Jaguar eats...";
}

@Override
public String Hunt() {
	return "A Jaguar Hunts...";
}

@Override
public String Reproduce() {
	return "A Jaguar Reproduces...";
}


public String grrr(){
	return "grrr...";
}




}

