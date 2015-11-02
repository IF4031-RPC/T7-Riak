/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if4031.t7.riak;

/**
 *
 * @author Imballinst
 */
public class Customer {
    public long CustomerId;
    public String Name;
    public String Address;
    public String City;
    public String State;
    public String Zip;
    public String Phone;
    public String CreatedDate;
    
    private static Customer createCustomer() {
        Customer customer = new Customer();
        customer.CustomerId = 1;
        customer.Name = "John Smith";
        customer.Address = "123 Main Street";
        customer.City = "Columbus";
        customer.State = "Ohio";
        customer.Zip = "43210";
        customer.Phone = "+1-614-555-5555";
        customer.CreatedDate = "2013-10-01 14:30:26";
        return customer;
    }
}
