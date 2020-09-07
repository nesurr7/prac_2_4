package classes;

public class Main {

    public static void main(String[] args) {
	Dog[] dogsKennel = new Dog[]{new Dog("Henry",4),
                                 new Dog("Ball",5),
                                 new Dog("Lulu",1)};
	dogsKennel[1].setAgeOfDog(2);
	System.out.println(dogsKennel[1].getAgeOfDog());
	System.out.println(dogsKennel[2].getNameOfDog());
	System.out.println("Данные о животных в питомнике:");
	for(Dog dog:dogsKennel) {
        System.out.println(dog.toString());
    }
    }
}
