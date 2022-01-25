package HW4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContactList {
        private HashMap <String, HashSet<String>> contactList = new HashMap<>();

        public void add(String surname, String extNumber) {
            HashSet<String> extNumbers;
            if (contactList.containsKey(surname)) {
                extNumbers = contactList.get(surname);
            }
            else {
                extNumbers = new HashSet<>();
            }
            extNumbers.add(extNumber.replaceAll(" ", ""));
            contactList.put(surname,extNumbers);
        }

        public Set<String> get (String surname){
            return contactList.get(surname);
        }

    }

