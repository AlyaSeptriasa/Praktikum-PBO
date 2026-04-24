/*
 Nama:Alya Septriasa
 kelas: tekom1B
 */
package Praktikum23042026;

/**
 *
 * @author alyas
 */
public class MainAuthor {
    public static void main(String[]args){
        Author Rin=new Author("Alya Septriasa","alya@gmail.com",'p');
        System.out.println(Rin);
        
        
        Rin.setEmail("alya@gmail.com");
        System.out.println(Rin);
        System.out.println("name is:"+Rin.getNama());
        System.out.println("gender is:"+Rin.getGender());
        System.out.println("email is:"+Rin.getEmail());
        
        
    }
    
}
