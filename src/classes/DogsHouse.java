package classes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DogsHouse {

	private ArrayList<Dog> dogsKennel;
	DogsHouse() {
		dogsKennel = new ArrayList<>(10);
		dogsKennel.add(new Dog("Henry", 4));
		dogsKennel.add(new Dog("Ball", 5));
		dogsKennel.add(new Dog("Lulu", 1));
	}

	public void addNewDog() {//Новая собака
			System.out.println("Введите имя собаки:");
			Scanner in = new Scanner(System.in);
			String nameOfDog = in.nextLine();
			int ageOfDog;
			while (true) {
				System.out.println("Введите возраст собаки:");
				ageOfDog = in.nextInt();
				if (ageOfDog < 0) {//ошибка
					System.out.println("Возраст собаки не может быть меньше нуля , повторите ввод");
					continue;
				}
				break;
			}
			dogsKennel.add(new Dog(nameOfDog , ageOfDog));
		}


	public ArrayList<Dog> getKennel(){
		return this.dogsKennel;
	}

	//////////
	public void printDogs(){//Метод вывода данных о собаках
		System.out.println("Данные о животных в питомнике:");
		for(Dog dog:dogsKennel) {
			System.out.println(dog.toString());
		}
	/////////

	}
    public static void main(String[] args) {
	DogsHouse kennel = new DogsHouse();//создание питомника
	((kennel.getKennel()).get(1)).setAgeOfDog(2);//для второй собаки возраст становится 2 года
	System.out.println(((kennel.getKennel()).get(1)).getAgeOfDog());//Возраст второй собаки
	System.out.println(((kennel.getKennel()).get(2).getNameOfDog()));//Имя третей собаки
	////////////
	kennel.addNewDog();
    kennel.printDogs();//Вывод данных о питомнике
    }
}
