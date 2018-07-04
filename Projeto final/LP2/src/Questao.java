
import java.io.Serializable;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Questao implements Serializable {
    private String perg;
    private LinkedList <Alternativas> alternativas = new LinkedList<>();
    
    public LinkedList<Alternativas> listaDeAlternativas(){
        return alternativas;
    }
    
    public Questao(){ 
    }
    
    public Questao(String perg){
        this.perg = perg;
    }
    
    public void adicionaAlternativa(Alternativas alt){
        alternativas.add(alt);
    }
    
    public String getPergunta(){
            return perg;
    }
    
    public void setPergunta (String perg){
            this.perg = perg;
    }
    public int QuestaoCerta(){
        for (Alternativas a : alternativas){
            if(a.getEhCerta()== true){
                return alternativas.indexOf(a)+1;
            }
        }
        return -1;
    }
        
}
