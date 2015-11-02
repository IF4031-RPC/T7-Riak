/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if4031.t7.riak;

import java.util.ArrayList;

/**
 *
 * @author Imballinst
 */
public class Order
{
    public Order() { Items= new ArrayList<Item>(); }
    public long OrderId;
    public long CustomerId;
    public long SalespersonId;
    public ArrayList<Item> Items;
    public Double Total;
    public String OrderDate;
}