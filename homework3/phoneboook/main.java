package homework3.phoneboook;

import java.util.List;

public class main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Alex", "11111");
        phoneBook.add("Alex", "22222");
        phoneBook.add("John", "33333");
        phoneBook.add("Peter", "44444");
        phoneBook.add("Alice", "55555");
        
        List<String> strings = phoneBook.get("Alex");
        System.out.println(strings);
    }
}
