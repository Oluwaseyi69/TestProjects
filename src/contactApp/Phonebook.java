package contactApp;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    String contact;
    private List<Contact>phonebook = new ArrayList<>();
    public void addContact(String name, String address, String telephone, String email) {
        Contact contact = new Contact(name,address,telephone,email);
        phonebook.add(contact);
    }
   public Contact findBy(String name){
        for(Contact contact: phonebook){
            if(contact.getName().equals(name)){
                return contact;
            }
        }
        throw new IllegalArgumentException("Invalid Contact");
   }

    public void deleteContact(String name, String address, String telephone, String email) {
        Contact contact = new Contact(name,address,telephone,email);
        phonebook.remove(contact);
    }
}
