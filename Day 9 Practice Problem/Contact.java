import java.util.ArrayList;
import java.util.Scanner;

// Contact class (represents a person)
class Contact {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String zip;
    String phoneNumber;
    String email;

    public Contact(String firstName, String lastName, String address,
                   String city, String state, String zip,
                   String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void display() {
        System.out.println(firstName + " " + lastName + ", " + address + ", "
                + city + ", " + state + " - " + zip);
        System.out.println("Phone: " + phoneNumber + ", Email: " + email);
    }
}

// AddressBook class (manages contacts)
class AddressBook {
    private ArrayList<Contact> contacts = new ArrayList<>();

    // UC1: Add contact
    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact added successfully!");
    }

    // UC2: Edit contact by first name
    public void editContact(String firstName, Scanner sc) {
        for (Contact c : contacts) {
            if (c.firstName.equalsIgnoreCase(firstName)) {
                System.out.println("Editing contact... Enter new details:");

                System.out.print("Last Name: ");
                c.lastName = sc.nextLine();

                System.out.print("Address: ");
                c.address = sc.nextLine();

                System.out.print("City: ");
                c.city = sc.nextLine();

                System.out.print("State: ");
                c.state = sc.nextLine();

                System.out.print("Zip: ");
                c.zip = sc.nextLine();

                System.out.print("Phone Number: ");
                c.phoneNumber = sc.nextLine();

                System.out.print("Email: ");
                c.email = sc.nextLine();

                System.out.println("Contact updated!");
                return;
            }
        }
        System.out.println("Contact not found!");
    }

    // UC3: Delete contact by first name
    public void deleteContact(String firstName) {
        for (Contact c : contacts) {
            if (c.firstName.equalsIgnoreCase(firstName)) {
                contacts.remove(c);
                System.out.println("Contact deleted!");
                return;
            }
        }
        System.out.println("Contact not found!");
    }

    // Display all contacts
    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Address Book is empty.");
            return;
        }

        for (Contact c : contacts) {
            c.display();
            System.out.println("----------------------");
        }
    }
}

// Main class
public class AddressBookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook book = new AddressBook();

        System.out.println("Welcome to Address Book Program");

        while (true) {
            System.out.println("\n1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    // UC1: Add
                    System.out.print("First Name: ");
                    String firstName = sc.nextLine();

                    System.out.print("Last Name: ");
                    String lastName = sc.nextLine();

                    System.out.print("Address: ");
                    String address = sc.nextLine();

                    System.out.print("City: ");
                    String city = sc.nextLine();

                    System.out.print("State: ");
                    String state = sc.nextLine();

                    System.out.print("Zip: ");
                    String zip = sc.nextLine();

                    System.out.print("Phone Number: ");
                    String phone = sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    Contact contact = new Contact(firstName, lastName, address,
                            city, state, zip, phone, email);

                    book.addContact(contact);
                    break;

                case 2:
                    // UC2: Edit
                    System.out.print("Enter First Name to Edit: ");
                    String editName = sc.nextLine();
                    book.editContact(editName, sc);
                    break;

                case 3:
                    // UC3: Delete
                    System.out.print("Enter First Name to Delete: ");
                    String deleteName = sc.nextLine();
                    book.deleteContact(deleteName);
                    break;

                case 4:
                    book.displayContacts();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}