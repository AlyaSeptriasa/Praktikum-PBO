/*
 Nama:Alya Septriasa
 kelas: tekom1B
 */
package Praktikum23042026;

/**
 *
 * @author alyas
 */
public class MainBook {
    public static void main(String[]args){
        Author Rin=new Author("Alya Septriasa","alya@gmail.com",'p');
        System.out.println(Rin);
        
        
        Book dummyBook = new Book("Algoritma dan pemograman",Rin,9800,99);
        System.out.println(dummyBook);
        
        dummyBook.setPrice(120000);
        dummyBook.setQty(88);
        System.out.println("name is:"+dummyBook.getNama());
        System.out.println("price is:"+dummyBook.getPrice());
        System.out.println("qty is:"+dummyBook.getQty());
        System.out.println("author is:"+dummyBook.getAuthor());
           
        System.out.println("author's name is:"+dummyBook.getAuthor().getNama());
           System.out.println("author's email is:"+dummyBook.getAuthor().getEmail());
           System.out.println("Author's gender is:"+dummyBook.getAuthor().getGender());
           
           Book moreDummyBook = new Book("java for more dummies",new Author("peter lee","peter@nowhere",'p'),19.99,8);
           System.out.println(moreDummyBook);
        
        
    }
    
}
