/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
import java.io.Serializable;
import java.util.*;

public class Professor implements Serializable{
    private String login, senha;
    private LinkedList <Prova> prova = new LinkedList<>();
    
    public void adicionaProva(Prova p){
        prova.add(p);
    }
    
    public String getLogin(){
            return login;
        }
    
    public void setLogin (String login){
            this.login = login;
    }
    
    public String getSenha(){
            return senha;
        }
    
    public void setSenha (String senha){
            this.senha = senha;
    }
    
    public LinkedList<Prova> listaDeProvas(){
        return prova;
    }
    
    public void removeProva(int posicao){
        prova.remove(posicao);
    }
    
}
