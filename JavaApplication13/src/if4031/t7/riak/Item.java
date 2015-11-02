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
public class Item
{
    public Item() { }
    public Item(String itemId, String title, Double price) {
        ItemId = itemId;
        Title = title;
        Price = price;
    }
    public String ItemId;
    public String Title;
    public Double Price;
}