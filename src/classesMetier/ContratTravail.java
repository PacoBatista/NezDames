/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesMetier;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author paco
 */
public class ContratTravail implements Serializable {
    private int numContratTravail;
    private String role;
    private int nombreHeures;
    private boolean edition;
    private ArrayList <ContratTravail> lesContrats ;
    private Intermittent Intermittent; 
    private ContratCession numeroContratCession;   
    private String datedebut;
    private String datecrea;
    private String heure;
    private String daterepresen;
    private String lieu;
    

    public ContratTravail( String role, String datedebut,String datecrea,String heure,int nombreHeures,String daterepresen,
              String lieu,ContratCession numeroContratCession,Intermittent Intermittent,
              boolean edition  ) {
        //this.numContratTravail = numContratTravail;
        this.role = role;
        this.datedebut = datedebut;
        this.datecrea=datecrea;
        this.heure=heure;
        this.nombreHeures = nombreHeures;
        this.daterepresen=daterepresen;
        this.lieu=lieu;
        this.edition = edition;
       
        this.Intermittent = Intermittent;
        this.numeroContratCession = numeroContratCession;
    }

    public int getNumContratTravail() {
        return numContratTravail;
    }

    public void setNumContratTravail(int numContratTravail) {
        this.numContratTravail = numContratTravail;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getNombreHeures() {
        return nombreHeures;
    }

    public void setNombreHeures(int nombreHeures) {
        this.nombreHeures = nombreHeures;
    }

    public boolean isEdition() {
        return edition;
    }

    public void setEdition(boolean edition) {
        this.edition = edition;
    }

    public ArrayList<ContratTravail> getLesContrats() {
        return lesContrats;
    }

    public void setLesContrats(ArrayList<ContratTravail> lesContrats) {
        this.lesContrats = lesContrats;
    }

    public Intermittent getIntermittent() {
        return Intermittent;
    }

    public void setIntermittent(Intermittent Intermittent) {
        this.Intermittent = Intermittent;
    }

    public ContratCession getNumeroContratCession() {
        return numeroContratCession;
    }

    public void setNumeroContratCession(ContratCession numeroContratCession) {
        this.numeroContratCession = numeroContratCession;
    }

    
            
    
    
    public void ajouterContratTravail(int numContratTravail, String role, int nombreHeures, boolean edition,Intermittent Intermittent, ContratCession numeroContratCession) {
        this.numContratTravail = numContratTravail;
        this.role = role;
        this.nombreHeures = nombreHeures;
        this.edition = edition;
        this.lesContrats = lesContrats;
        this.Intermittent = Intermittent;
        this.numeroContratCession = numeroContratCession;
    
    
    }
    
    
    public void modifierContratTravail(int numContratTravail, String role, int nombreHeures, boolean edition,Intermittent Intermittent, ContratCession numeroContratCession) {
        this.numContratTravail = numContratTravail;
        this.role = role;
        this.nombreHeures = nombreHeures;
        this.edition = edition;
        this.lesContrats = lesContrats;
        this.Intermittent = Intermittent;
        this.numeroContratCession = numeroContratCession;
    
    }
 
    
    public void visualitionContratTravail (int numContratTravail){
    
    
    }
    
 public void suppressionContratTravail(int numContratTravail){
        this.numContratTravail = numContratTravail;
       
    
         }

    

    
 
 

}




