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
public class UtentiRegistrati {
    
    
    
    private int idMembro; //id 
    private String NomeMembro; //nome
    private String CognomeMembro; //cognome
    private String CompleannoMembro; //data di nascita
    private String Presentazione; //biografia, presentazione
    //private String Immagine; forse
    private String Password; //password
    private String url; //url propic
    
public UtentiRegistrati() {
    
    this.idMembro=-1;
    this.NomeMembro="";
    this.CognomeMembro="";
    this.url="";
    this.CompleannoMembro="";
    this.Password="";
    this.Presentazione="";
    
}

//Acquisizione ID 
public int getidMembro() {
    return idMembro;
}

public void setidMembro(int varId) {
    this.idMembro=varId;
}

//Acquisizione nome 

public String getNomeMembro() {
    return NomeMembro;
}

public void setNomeMembro(String varNome) {
    this.NomeMembro=varNome;
}

//Acquisizione Cognome 

public String getCognomeMembro() {
    return CognomeMembro;
}

public void setCognomeMembro(String varCognome) {
    this.CognomeMembro=varCognome;
}

//Acquisizione url foto del profilo 

public String geturl() {
    return url;
}

public void seturl(String varurl) {
    this.url=varurl;
}

//Acquisizione COmpleanno 

public String getCompleannoMembro() {
    return CompleannoMembro;
}

public void setCompleannoMembro(String varData) {
    this.CompleannoMembro=varData;
}

//Acquisizione Password 


public String getPassword() {
    return Password;
}

public void setPassword(String varPas) {
    this.Password= varPas;
}

// Acquisizione presentazione

public String getPresentazione() {
    return Presentazione;
}

public void setPresentazione(String varPresentazione) {
    this.Presentazione= varPresentazione;
}

//Controllo per stabilire se l'utente è già membro del social network se il controllo entra nell'if vuol dire che l'utente non è iscritto, mentre se entra nell'else significa che è già iscritto

public boolean controlUser (UtentiRegistrati varControllo) {
    if (varControllo.getNomeMembro().equals("") || 
            varControllo.getCognomeMembro().equals("") || varControllo.geturl().equals("") ||
                varControllo.getCompleannoMembro().equals("") || varControllo.getPassword().equals("") || 
                    varControllo.getPresentazione().equals("")) {
        return false;
    }else {
        return true;
    }
        
}
}
