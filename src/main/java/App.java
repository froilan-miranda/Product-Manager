import java.util.Scanner;

public class App {

    Scanner input = new Scanner(System.in);
    int choice = -1;
    ProductManager pm = new ProductManager();

    public static void main(String[] args) {
        App app = new App();
        app.init();
    }

    public void init() {

        do {
            System.out.println("**********************************************");
            System.out.println("**          BANK MANAGEMENT SYSTEM          **");
            System.out.println("**********************************************");
            System.out.println("1. Login as Bank Employee");
            System.out.println("0. Exit from the System");
            System.out.println("----------------------------------------------");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(input.nextLine());
            if(choice >= 0) {
                switch (choice) {
                    case 1:
                    {
                        String username, password;
                        int counter = 3;
                        do {
                            System.out.println("***********************************");
                            System.out.println("**     EMPLOYEE VERIFICATION     **");
                            System.out.println("***********************************");
                            System.out.print("Enter the username: ");
                            username = input.nextLine();
                            System.out.print("Enter the password: ");
                            password = input.nextLine();
                            System.out.println("-----------------------------------");
                            if(pm.validateEmployee(username, password)) {
                                break;
                            }
                            else {
                                counter--;
                                if(counter == 0) {
                                    System.out.println("You're not an authorized user. Alarm Rings!");
                                    return;
                                }
                            }
                        }while(counter != 0);
                        System.out.println("Successfully Logged in...\n");

                        do {
                            System.out.println("***********************************************");
                            System.out.println("*             BANK EMPLOYEE MENU             **");
                            System.out.println("***********************************************");
                            System.out.println("1. Create new Account");
                            System.out.println("2. Delete Account");
                            System.out.println("3. Update Account");
                            System.out.println("4. Print Account Holder Information");
                            System.out.println("5. Return to Main Menu");
                            System.out.println("-----------------------------------------------");
                            System.out.print("Enter your Choice: ");
                            switch (choice = Integer.parseInt(input.nextLine())) {
                                case 1: {
                                    String fullName, dateOfBirth, phoneNumber; double initialAmount;
                                    System.out.print("Enter full name of customer: ");
                                    fullName = input.nextLine();
                                    System.out.print("Enter date of birth of customer(dd-mm-yyyy): ");
                                    dateOfBirth = input.nextLine();
                                    System.out.print("Enter phone number of customer(123-1111-123-1234): ");
                                    phoneNumber = input.nextLine();
                                    System.out.print("Enter the initial deposit of customer(min. 500): ");
                                    initialAmount = Double.parseDouble(input.nextLine());

                                    pm.createAccount(fullName, dateOfBirth, phoneNumber, initialAmount);
                                    System.out.println("-----------------------------------------------");
                                    break;
                                }
                                case 2: {
                                    System.out.print("Enter the account number: ");
                                    int accNum = Integer.parseInt(input.nextLine());
                                    pm.deleteAccount(accNum);
                                    System.out.println("-----------------------------------------------");
                                    break;
                                }
                                case 3: {
                                    System.out.print("Enter the account number: ");
                                    int accNum = Integer.parseInt(input.nextLine());
                                    if(pm.searchAccount(accNum)) {
                                        String phoneNumber;

                                        System.out.print("Enter new phone number of customer(123-1111-123-1234): ");
                                        phoneNumber = input.nextLine();
                                        pm.updateAccountDetails(phoneNumber, accNum);
                                        System.out.println("-----------------------------------------------");
                                    }
                                    break;
                                }
                                case 4: {
                                    System.out.print("Enter the account number: ");
                                    int accNum = Integer.parseInt(input.nextLine());
                                    pm.printCustomerAccountDetails(accNum);
                                    break;
                                }
                                case 5:
                                {
                                    break;
                                }
                                default:{
                                    System.out.print("Please make a valid Selection!");
                                }
                            }

                            if(choice != 5)
                            {
                                System.out.print("Do you want Perform another Option(1-Yes / 5-No): ");
                                choice = Integer.parseInt(input.nextLine());
                            }
                        }while (choice != 5);
                        break;
                    }
                }
            }
        } while(choice != 0);
    }
}
