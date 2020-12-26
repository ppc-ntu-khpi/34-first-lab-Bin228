/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twopr;

/**
 *
 * @author vipbi
 */
public class TwoPR {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static class Shirt {
        public int shirtID = 666; // стандартне значення номера моделі сорочки
        public String description = "lamborghini urus 20x20x20 centimeters"; // стандартний опис сорочки
        // коди кольорів: R=червоний, B=синій, G=зелений, U=невідомо
        public char colorCode = 'U';
        public double price = 9999.9; // стандартна вартість сорочки
        public int quantityInStock = 0; // стандартна кількість на складі
        
        // цей метод просто виводить всю інформацію про сорочку на екран
        public void displayShirtInformation() {
        System.out.println("Shirt ID: " + shirtID);
        System.out.println("Shirt description:" + description);
        System.out.println("Color Code: " + colorCode);
        System.out.println("Shirt price: $" + price);
        System.out.println("Quantity in stock: " + quantityInStock);
        } // кінець методу displayShirtInformation
    } // кінець опису класу
    
    public static class Quotation {
        String quote = "Hello world!";
        public void display() {
           System.out.println(quote);
        }
    }
    
}
