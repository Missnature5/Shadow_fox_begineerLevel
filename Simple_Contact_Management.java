public class Contact {
    private String name;
    private String phoneNumber;
    private String emailAddress;

    public Contact(String name, String phoneNumber, String emailAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}

public class ContactManager {
    private List<Contact> contacts;

    public ContactManager() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void viewContacts() {
        for (Contact contact : contacts) {
            System.out.println("Name: " + contact.getName());
            System.out.println("Phone Number: " + contact.getPhoneNumber());
            System.out.println("Email Address: " + contact.getEmailAddress());
            System.out.println();
        }
    }

    public void updateContact(String name, String phoneNumber, String emailAddress) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                contact.setPhoneNumber(phoneNumber);
                contact.setEmailAddress(emailAddress);
                return;
            }
        }
    }

    public void deleteContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                contacts.remove(contact);
                return;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();

        while (true) {
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter name:");
                    String name = scanner.next();
                    System.out.println("Enter phone number:");
                    String phoneNumber = scanner.next();
                    System.out.println("Enter email address:");
                    String emailAddress = scanner.next();

                    Contact contact = new Contact(name, phoneNumber, emailAddress);
                    contactManager.addContact(contact);
                    break;
                case 2:
                    contactManager.viewContacts();
                    break;
                case 3:
                    System.out.println("Enter name:");
                    name = scanner.next();
                    System.out.println("Enter new phone number:");
                    phoneNumber = scanner.next();
                    System.out.println("Enter new email address:");
                    emailAddress = scanner.next();

                    contactManager.updateContact(name, phoneNumber, emailAddress);
                    break;
                case 4:
                    System.out.println("Enter name:");
                    name = scanner.next();

                    contactManager.deleteContact(name);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
