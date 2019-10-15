import models.Employee;
import services.BeerService;
import services.CustomerService;

public class ProductManager {

    private Employee employee;
    private CustomerService customerService;
    private BeerService beerService;

    public ProductManager(){
        employee = new Employee(1, "Dr. Strange", "admin", "admin123");
        customerService = new CustomerService();
        beerService = new BeerService();
    }

    public boolean validateEmployee(String username, String password) {
        if(employee.getUsername().equals(username) && employee.getPassword().equals(password))
            return true;
        return false;
    }

    public void createAccount(String fullName, String dateOfBirth, String phoneNumber, double initialAmount) {
    }

    public void deleteAccount(int accNum) {
    }

    public boolean searchAccount(int accNum) {
        return false;
    }

    public void updateAccountDetails(String phoneNumber, int accNum) {
    }

    public void printCustomerAccountDetails(int accNum) {
    }
}
