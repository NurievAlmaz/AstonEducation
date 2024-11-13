
import java.lang.*;
public class Main {
    public static void main(String[] args) {

        FoodBowl foodBowl = new FoodBowl(1);


        Cat[] cats = { new Cat(), new Cat(), new Cat() };


        for (Cat cat : cats) {
            cat.eat(foodBowl);
        }


        for (int i = 0; i < cats.length; i++) {
            System.out.println("Кошка " + (i + 1) + " сытость: " + (cats[i].satiety() ? "Да" : "Нет"));
        }


        foodBowl.addFood(1);


        for (Cat cat : cats) {
            cat.eat(foodBowl);
        }


        for (int i = 0; i < cats.length; i++) {
            System.out.println("Кошка " + (i + 1) + " сытость: " + (cats[i].satiety() ? "Да" : "Нет"));
        }

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();




        dog1.run(300);
        dog2.swim(5);
        dog4.run(501);
        dog4.swim(11);
        cat2.swim(11);
        cat1.run(200);
        cat1.run(201);



        System.out.println("Животных: " + Animal.getAnimalCount());
        System.out.println("Собак: " + Dog.giveDogCount());
        System.out.println("Кошек: " + Cat.giveCatCount());
    }
}

class Animal {
    private static int animalCount = 0;
    public Animal() {
        animalCount++;
    }
    public static int getAnimalCount() {
        return animalCount;
    }
    public void run(int distance) {

    }
    public void swim(int distance) {

    }
}
class Dog extends Animal {
    private static int dogCount = 0;
    public Dog() {
        super();
        dogCount++;
    }
    public static int giveDogCount() {
        return dogCount;
    }
    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println("Собака пробежит " + distance + " метров.");
        } else {
            System.out.println("Собака не сможет пробежать " + distance + " метров.");
        }
    }
    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println("Собака проплывет " + distance + " метров.");
        } else {
            System.out.println("Собака не сможет проплыть " + distance + " метров.");
        }
    }
}
class Cat extends Animal {
    private static int catCount = 0;
    private boolean isFull;
    public Cat() {
        super();
        this.isFull = false;
        catCount++;
    }
    public static int giveCatCount() {
        return catCount;
    }
    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println("Кошка пробежит " + distance + " метров.");
        } else {
            System.out.println("Кошка не сможет пробежать " + distance + " метров.");
        }
    }
    @Override
    public void swim(int distance) {
        System.out.println("Кошка не умеет плавать.");
    }
    public void eat(FoodBowl foodBowl) {
        if (foodBowl.getFoodAmount() > 0) {
            foodBowl.decreaseFood();
            this.isFull = true;
            System.out.println("Кошка поела.");
        } else {
            System.out.println("Кошка не может поесть,миска пустая.");
        }
    }
    public boolean satiety() {
        return isFull;
    }
}
class FoodBowl {
    private int foodAmount;
    public FoodBowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }
    public int getFoodAmount() {
        return foodAmount;
    }
    public void decreaseFood() {
        if (foodAmount > 0) {
            foodAmount--;
        }
    }
    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.println("Добавили " + amount + " еды в миску. Теперь в миске " + foodAmount + " еды.");
        } else {
            System.out.println("Ошибка, количество должно быть > 0.");
        }
    }
}
