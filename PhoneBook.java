import java.util.*;
import java.lang.*;


public class PhoneBook {
    private Map<String, List<String>> phoneBook;


    public PhoneBook() {
        phoneBook = new HashMap<>();
    }


    public void add(String lastName, String phoneNumber) {

        List<String> phoneNumbers = phoneBook.getOrDefault(lastName, new ArrayList<>());
        phoneNumbers.add(phoneNumber);
        phoneBook.put(lastName, phoneNumbers);
    }


    public List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, new ArrayList<>());
    }


    public void printPhoneBook() {
        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            System.out.println("Фамилия: " + entry.getKey() + ", Номер: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();


        phoneBook.add("Нуриев", "233131");
        phoneBook.add("Алексеев", "12281488");
        phoneBook.add("Петрушкова", "12312312");
        phoneBook.add("Шукшина", "10001010");
        phoneBook.add("Нуриева", "1233123");
        phoneBook.add("Шукшина", "12342");
        phoneBook.add("Янычева", "12342");


        System.out.println("Телефон Нуриева: " + phoneBook.get("Нуриева"));
        System.out.println("Телефон Алексеев: " + phoneBook.get("Алексеев"));
        System.out.println("Телефон Петрушкова: " + phoneBook.get("Петрушкова"));
        System.out.println("Телефон Шукшина: " + phoneBook.get("Шукшина"));
        System.out.println("Телефон Янычева : " + phoneBook.get("Янычева"));


        System.out.println("\nВесь телефонный справочник:");
        phoneBook.printPhoneBook();
    }
}
