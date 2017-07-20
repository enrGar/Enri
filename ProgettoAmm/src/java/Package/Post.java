/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

/**
 *
 * @author Enrico
 */
public class Post {
     
    protected int IdPost;
    protected UtentiRegistrati User;
    private int idUser;
    private String Oggetto;
    private String Didascalia;
    
    public Post() {
        IdPost=0;
        User= null;
        Didascalia = "";
        Oggetto = "";
    }
    
   
    public int getIdUser() {
        return idUser;
    }
    
    public void setidUser(int idUser) {
        this.idUser= idUser;
    }
    
    public int getIdPost() {
        return IdPost;
    }
    
    public void setIdPost() {
        this.IdPost= IdPost;
    }
    
    public UtentiRegistrati getUser() {
        return User;
    }
    
    public void setUser(UtentiRegistrati User) {
        this.User= User;
    }
    
    public String getOggetto() {
        return Oggetto;
    }

    public void setOggetto(String Oggetto) {
        this.Oggetto = Oggetto;
    }
    
    public String getDidascalia() {
        return Didascalia;
    }
        
    public void setDidascalia(String Didascalia) {
        this.Didascalia = Didascalia;
    }
}
