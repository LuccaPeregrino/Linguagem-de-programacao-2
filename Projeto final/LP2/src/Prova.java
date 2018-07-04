import java.io.Serializable;
import java.util.LinkedList;

public class Prova implements Serializable{
    private String nome;
    private String palavraChave;
    private boolean foiPublicada = false; 
    private LinkedList <Questao> questoes = new LinkedList<>();
    private LinkedList <ProvaRespondida> respondida = new LinkedList<>();
    
    public void adicionaQuestao(Questao q){
        questoes.add(q);
    }
    
    public void adicionaProvaRespondida(ProvaRespondida q){
        respondida.add(q);
    }
    
    public LinkedList<ProvaRespondida> listaDeResultados(){
        return respondida;
    }
    
    public String getPalavraChave(){
            return palavraChave;
    }
    
    public void setPalavraChave(String palavraChave){
            this.palavraChave = palavraChave;
    }
    
    public String getNome(){
            return nome;
    }
    
    public LinkedList<Questao> listaDeQuestoes(){
        return questoes;
    }
    
    public void setNome(String nome){
            this.nome = nome;
    }
   
    public void publicar(){
        foiPublicada = true;
    }
    
    public boolean foiPublicada(){
        return foiPublicada;
    }
    
}
