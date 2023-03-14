import java.util.Scanner;
import java.util.LinkedList;
public class ContactBook {
    static Scanner input = new Scanner(System.in);

    static class Contact {
        String name;
        String phone;
        String email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }
    }

    public static void main(String[] args) {
        LinkedList<Contact> sLL = new LinkedList<>();
        boolean run = true;
        while (run) {
            System.out.println("*********");
            System.out.println("(A)dd");
            System.out.println("(D)elete");
            System.out.println("(E)mail Search");
            System.out.println("(P)rint List");
            System.out.println("(S)earch");
            System.out.println("(Q)uit");
            System.out.println("*********");
            System.out.print("Please Enter a Command: ");
            String cmd = input.nextLine();
            switch (cmd) {
                case "A":
                    System.out.println(" ");
                    System.out.print("Input Name        : ");
                    String name = input.nextLine();
                    System.out.print("Input Phone Number: ");
                    String phone = input.nextLine();
                    System.out.print("Input Email       : ");
                    String email = input.nextLine();
                    Contact NewContact = new Contact(name, phone, email);
                    sLL.add(NewContact);
                    break;
                case "D":
                    if (sLL.size() == 0) {
                        System.out.println(" ");
                        System.out.println("Contact Book is Empty");
                        break;
                    }
                    System.out.println(" ");
                    System.out.print("Input Name of Contact Book to Delete: ");
                    String dName = input.nextLine();
                    System.out.println(" ");
                    System.out.print("List of Deleted Contacts: ");
                    int i = 0;
                    int x = 0;
                    while(i < sLL.size()) {
                        if(sLL.get(i).name.equals(dName)) {
                            System.out.println(" ");
                            System.out.println(x+1 + ". ");
                            System.out.println("Name        : " + sLL.get(i).name);
                            System.out.println("Phone Number: " + sLL.get(i).phone);
                            System.out.println("Email       : " + sLL.get(i).email);
                            sLL.remove(i);
                            i--;
                            x++;
                        }
                        i++;
                    }
                    if(x == 0) {
                        System.out.print("Doesn't Exist");
                        System.out.println(" ");
                    }
                    break;
                case "E":
                    if (sLL.size() == 0) {
                        System.out.println(" ");
                        System.out.println("Contact Book is Empty");
                        break;
                    }
                    System.out.println(" ");
                    System.out.print("Search Contact Book With Email: ");
                    String sEmail = input.nextLine();
                    System.out.println(" ");
                    System.out.print("List of Searched Email Contact: ");
                    int j = 0;
                    for (Contact contact : sLL) {
                        if (contact.email.equals(sEmail)) {
                            j++;
                            System.out.println(" ");
                            System.out.println(j + ". ");
                            System.out.println("Name        : " + contact.name);
                            System.out.println("Phone Number: " + contact.phone);
                            System.out.println("Email       : " + contact.email);
                        }
                    }
                    if (j==0) {
                        System.out.print("Doesn't Exist");
                        System.out.println(" ");
                    }
                    break;
                case "P":
                    if (sLL.size() == 0) {
                        System.out.println(" ");
                        System.out.println("Contact Book is Empty");
                        break;
                    }
                    int q = 0;
                    for (Contact contact : sLL) {
                        q++;
                        System.out.println(" ");
                        System.out.println(q + ". ");
                        System.out.println("Name        : " + contact.name);
                        System.out.println("Phone Number: " + contact.phone);
                        System.out.println("Email       : " + contact.email);
                    }
                    break;
                case "S":
                    if (sLL.size() == 0) {
                        System.out.println(" ");
                        System.out.println("Contact Book is Empty");
                        break;
                    }
                    System.out.println(" ");
                    System.out.print("Search Contact Book With Name: ");
                    String sName = input.nextLine();
                    System.out.println(" ");
                    System.out.print("List of Searched Name Contact: ");
                    int w = 0;
                    for (Contact contact : sLL) {
                        if (contact.name.equals(sName)) {
                            w++;
                            System.out.println(" ");
                            System.out.println(w + ". ");
                            System.out.println("Name        : " + contact.name);
                            System.out.println("Phone Number: " + contact.phone);
                            System.out.println("Email       : " + contact.email);
                        }
                    }
                    if (w==0) {
                        System.out.print("Doesn't Exist");
                        System.out.println(" ");
                    }
                    break;
                case "Q":
                    System.out.println(" ");
                    System.out.println("Closing Program");
                    run = false;
                    break;
                default:
                    System.out.println("Not Valid Input");
            }
            System.out.println(" ");
        }
    }
}