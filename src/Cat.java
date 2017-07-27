/*
* All Cats are Animals but all Animals are not Cats
*/
public class Cat extends Animal {

public Cat()
{
super();
System.out.println("Now I am a Cat!");
}

@Override
public String sleep() {
	return "A cat sleeps...";
}

@Override
public String eat() {
	return "A cat eats...";
}

@Override
public String Hunt() {
	return "A Cat Hunts...";
}

@Override
public String Reproduce() {
	return "A Cat Reproduces...";
}

public String purr(){
	return "purrr...";
}

}

