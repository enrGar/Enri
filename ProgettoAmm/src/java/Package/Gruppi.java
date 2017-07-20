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
import java.util.ArrayList;
import java.util.List;

public class Gruppi {
    
    private int id; //id gruppo
    private int idAdmin; // id dell'admin
    private String Nome; //nome del gruppo
    private String Immagine; //immagine del gruppo
    private List<UtentiRegistrati> ListaMembri= new ArrayList<>(); //lista utenti iscritti al gruppo
    
public  Gruppi() {

    id=0;
    Nome="";
    idAdmin=0;
}

// Acquisizione id 

public int getid () {
    return id;
}

public void setid (int id) {
    this.id= id;
}

//Acquisizione id admin

public int getidAdmin() {
    return idAdmin;
}

public void setidAdmin (int idAdmin) {
    this.idAdmin= idAdmin;
}

// Acquisizione nome gruppo

public String getNome() {
    return Nome;
}

public void setNome(String Nome) {
    this.Nome= Nome;
} 

//Acquisizione lista utenti iscritti

public List<UtentiRegistrati> getListaMembri() {
    return ListaMembri;
}

public void setListaMembri(List<UtentiRegistrati> ListaMembri) {
    this.ListaMembri= ListaMembri; 
}

//stampa della lista dei membri del gruppo

public void stampaListaMembri() {
    this.getListaMembri().forEach((i)-> {System.out.println(i.getNomeMembro());});
}

//Aggiunta membri

public void aggiungere(UtentiRegistrati utenti) {
    this.getListaMembri().add(utenti);
}

public void aggiungere(List<UtentiRegistrati> elenco) {
    elenco.forEach((i)->{this.getListaMembri().add(i);
    });
}

}


