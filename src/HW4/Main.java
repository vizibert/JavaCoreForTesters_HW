package HW4;

public class Main {

    public static void main (String[] args) {

        ContactList contactList = new ContactList();

        contactList.add("Ivanov", "31210");
        contactList.add("Petrov", "31211 ");
        contactList.add("Ivanov"," 31212");

        System.out.println("Ivanov: " + contactList.get("Ivanov"));
        System.out.println("Petrov: " + contactList.get("Ivanov"));

    }
}

