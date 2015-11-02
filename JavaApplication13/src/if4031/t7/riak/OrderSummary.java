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
import java.util.ArrayList;

public class OrderSummary {

    public OrderSummary() {
        Summaries= new ArrayList<OrderSummaryItem>();
    }
    public long CustomerId;
    public ArrayList<OrderSummaryItem> Summaries;
}