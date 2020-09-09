package classes;

public class DogsHouse {

	Dog[] dogsKennel;
	DogsHouse() {
		dogsKennel = new Dog[]{new Dog("Henry", 4),
				new Dog("Ball", 5),
				new Dog("Lulu", 1)};
	}

	public Dog[] getKennel(){
		return this.dogsKennel;
	}

	//////////
	public static void printDogs(Dog[] dogsKennel){//Метод вывода данных о собаках
		System.out.println("Данные о животных в питомнике:");
		for(Dog dog:dogsKennel) {
			System.out.println(dog.toString());
		}
	/////////

	}
    public static void main(String[] args) {
	DogsHouse kennel = new DogsHouse();//создание питомника
	//////////////
	(kennel.getKennel())[1].setAgeOfDog(2);//для второй собаки возраст становится 2 года
	System.out.println((kennel.getKennel())[1].getAgeOfDog());//Возраст второй собаки
	System.out.println((kennel.getKennel())[2].getNameOfDog());//Имя третей собаки
	////////////
    printDogs(kennel.getKennel());//Вывод данных о питомнике
    }
}
