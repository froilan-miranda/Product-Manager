package services;

import models.Beer;
import models.Customer;

import java.util.ArrayList;

public class CustomerService {

    private static int nextId = 1;

    private ArrayList<Customer> inventory = new ArrayList<>();

    //create
    public Customer create(String name, String username, String password, String email) {
        Customer customer = new Customer(nextId++, name, username, password, email);
        inventory.add(customer);
        return customer;

    }

    //read
    public Customer findBeer(int readId) {
        Customer output = null;

        for(Customer b : inventory)
            if (b.getId() == readId) {
                output = b;
                break;
            }

        return output;
    }

    //read all
    public Customer[] findAll() {
        return inventory.toArray(new Customer[inventory.size()]);
    }

    //update

    //delete
    public boolean delete(int id) {
        boolean isDeleted = false;

        for(Customer b : inventory){
            if(b.getId() == id){
                inventory.remove(b);
                isDeleted = true;
                break;
            }
        }

        return isDeleted;
    }

    public int size(){
        return inventory.size();
    }

}
