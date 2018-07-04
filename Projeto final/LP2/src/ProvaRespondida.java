import java.io.Serializable;

public class ProvaRespondida implements Serializable{
    public String aluno;
    public double nota;
    private String palavraChave;
    private String loginProf;
    
    public ProvaRespondida(String a, double n){
        aluno = a;
        nota = n;
    }
    public void setLoginProf(String loginProf){
        this.loginProf = loginProf;
    }
     public String getLoginProf(){
            return loginProf;
    }
    public void setPalavraChave(String palavraChave){
        this.palavraChave = palavraChave;
    }
     public String getPalavraChave(){
            return palavraChave;
    }
    public String getAluno(){
            return aluno;
    }
    
    public double getNota(){
            return nota;
    }
        
}
