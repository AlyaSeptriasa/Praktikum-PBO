/*
Nama:Alya Septriasa
kelas: tekom1B
 */
package Praktikum23042026;

/**
 *
 * @author alyas
 */
public class Book {
    private String nama;
    private Author Author;
    private double price;
    private int qty;
    
    public Book(String nama, Author Author, double price, int qty){
        this.nama=nama;
        this.Author=Author;
        this.price=price;
        this.qty=qty;
        
    }
    public String getNama(){
        return nama;
    }
    public Author getAuthor(){
        return Author;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty=qty;
    }
    
    public String toString(){
        return"'"+nama+"'by"+Author;
    }
    
    
}
