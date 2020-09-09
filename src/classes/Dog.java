package classes;
public class Dog {
    //Свойства
    String nameOfDog;
    int ageOfDog;

    //Конструкторы
    Dog(String nameOfDog, int ageOfDog) {
        this.nameOfDog = nameOfDog;
        this.ageOfDog = ageOfDog;
    }

    Dog() {//инициализирован пустой объект
        this.nameOfDog = "undefined";
        this.ageOfDog = -1;
    }
    //Геттеры

    public int getAgeOfDog() {
        return ageOfDog;
    }

    public String getNameOfDog() {
        return nameOfDog;
    }

    //Сеттеры


    public void setAgeOfDog(int ageOfDog) {
        this.ageOfDog = ageOfDog;
    }

    public void setNameOfDog(String nameOfDog) {
        this.nameOfDog = nameOfDog;
    }

    public int dogAgeToHuman() {
        return ageOfDog * 7;
    }

    @Override
    public String toString() {
        return "_____________\n"
                + "Имя собаки:" + nameOfDog + "\n"
                + "Возраст собаки:" + ageOfDog + "\n"
                + "Возраст собаки в возрасте людей:"
                + dogAgeToHuman() + "\n_____________";
    }
}