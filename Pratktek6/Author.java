/*
 Nama:Alya Septriasa
 kelas: tekom1B
 */
package Praktikum23042026;

/**
 *
 * @author alyas
 */
public class Author{
    private final String nama;
    private String email;
    private final char gender;
    
    public Author(String nama, String email, char gender){
        this.nama=nama;
        this.email=email;
        this.gender=gender;
    }
    
    public String getNama(){
        return nama;
    }
    public char getGender(){
        return gender;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    
    
    
}


