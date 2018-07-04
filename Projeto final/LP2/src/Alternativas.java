
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Alternativas implements Serializable{
    private String alt;
    private boolean ehCerta;
   
    
    public Alternativas(String alt, boolean ehCerta){
        this.alt = alt;
        this.ehCerta = ehCerta;
    }
    
    public String getAlt(){
            return alt;
        }
    
    public void setAlt (String alt){
            this.alt = alt;
    }
    
    public boolean getEhCerta(){
            return ehCerta;
    }
    
    public void setEhCerta (boolean ehCerta){
        this.ehCerta = ehCerta;
    }
}
