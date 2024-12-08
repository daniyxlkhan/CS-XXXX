import java.io.*;

public class Contact implements Comparable<Contact> {
    private String firstName, lastName, phone;

    public Contact(String first, String last, String telephone){
        firstName = first;
        lastName = last;
        phone = telephone;
    }

    public String toString (){
        return lastName + "," + firstName + "," + phone;
    }

    public int compareTo(Contact other) {
        int lastNameCompare = this.lastName.compareTo(other.lastName);
        if (lastNameCompare != 0) {
            return lastNameCompare;
        }

        int firstNameCompare = this.firstName.compareTo(other.firstName);
        if (firstNameCompare != 0) {
            return firstNameCompare;
        }

        return this.phone.compareTo(other.phone);
    }
}

