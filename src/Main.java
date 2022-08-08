


public class Main {
    public static void main(String [] args) {
        ContactsManager myContactManager = new ContactsManager();

        Contact friend1 = new Contact();
        friend1.name = "Can";
        friend1.phoneNumber = "05324046187";

        Contact friend2 = new Contact();
        friend2.name = "Onur";
        friend2.phoneNumber = "05324046188";

        Contact friend3 = new Contact();
        friend3.name = "Taylan";
        friend3.phoneNumber = "05324046189";

        Contact friend4 = new Contact();
        friend4.name = "Tayfun";
        friend4.phoneNumber = "05324046190";

        Contact friend5 = new Contact();
        friend5.name = "Baris";
        friend5.phoneNumber = "05324046191";

        myContactManager.addContact(friend1);
        myContactManager.addContact(friend2);
        myContactManager.addContact(friend3);
        myContactManager.addContact(friend4);
        myContactManager.addContact(friend5);

        Contact searchedFriend = myContactManager.searchContact("Taylan");
        System.out.println("Found:");
        System.out.println(searchedFriend.name);
        System.out.println(searchedFriend.phoneNumber);

    }
}
