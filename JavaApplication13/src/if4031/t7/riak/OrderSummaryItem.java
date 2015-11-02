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
public class OrderSummaryItem
{
    public OrderSummaryItem() { }
    public OrderSummaryItem(Order parentOrder) {
        OrderId = parentOrder.OrderId;
        Total = parentOrder.Total;
        OrderDate = parentOrder.OrderDate;
    }

    public long OrderId;
    public Double Total;
    public String OrderDate;
}