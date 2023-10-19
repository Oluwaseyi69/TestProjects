package contactApp;

public class Contact {
    private String name;
    private String address;
    private String telephone;
    private String email;

    private String contact;
    public Contact(String name, String address, String telephone, String email){
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
    }

    public void addName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public String getAddress() {
        return address;
    }
    public void addAddress(String address){
        this.address = address;
    }

    public void addPhone(String telephone) {
        this.telephone = telephone;
    }

    public String getTelephone() {
        return telephone;
    }

    public void addEmail(String email) {
        this.email = email;
    }
    public String getEmail(){
       if (email.matches("^[A-Za-z0-9+_,-]+@(.+)$")){
           return email;
       }
       else {
           throw new RuntimeException("enter a valid email");
       }

    }

    public String getContact() {
        return contact;
    }
}
