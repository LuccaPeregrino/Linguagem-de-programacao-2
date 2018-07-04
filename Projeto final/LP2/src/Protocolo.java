
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class Protocolo {

    public static Professor procuraProfessor(String login, String senha) {
        for (Professor p : Servidor.professores) {
            if ((p.getLogin().equals(login))) {
                if ((p.getSenha().equals(senha))) {
                    return p;
                } else {
                   break;
                }
            }
        }
        return null;
    }
    
    public static boolean procuraProfessor(String login) {
        for (Professor p : Servidor.professores) {
            if ((p.getLogin().equals(login))) {
               return true;
            }
        }
        return false;
    }

    public static Prova procuraProva(String loginProf, String palavraChave){
        for (Professor p : Servidor.professores) {
            if(p.getLogin().equals(loginProf)){
                 for (Prova a : p.listaDeProvas()) {
                    if ((a.getPalavraChave().equals(palavraChave))) {
                        if(a.foiPublicada()){
                            return a;
                        } else{
                            return null;
                        }
                        
                    }
                }
            }
        }
        return null;
    }
       
    public static boolean adicionaProva(Professor professor, Prova prova){
        try{
            int index = Servidor.professores.indexOf(professor);
            Servidor.professores.get(index).listaDeProvas().add(prova);
            return true;
        } catch(Exception e){
            return false;
        }
    }
    
    public static boolean atualizarDados(Professor professor){
       for (Professor p : Servidor.professores) {
            if ((p.getLogin().equals(professor.getLogin()))) {
                Servidor.professores.remove(p);
                Servidor.professores.add(professor);     
                return true;
            }
        }
        return false;
    }
    
    public synchronized static boolean adicionaProfessor(String user, String senha){
        if(Protocolo.procuraProfessor(user)){
            return false;
        } else{
            Professor p = new Professor();
            p.setLogin(user);
            p.setSenha(senha);
            Servidor.professores.add(p);
            return true;
        }

    }
    
    public static boolean publicarProva(String user, String palavraChave){
        for (Professor p : Servidor.professores) {
            if(p.getLogin().equals(user)){
                 for (Prova a : p.listaDeProvas()) {
                    if ((a.getPalavraChave().equals(palavraChave))) {
                       a.publicar();
                       return true;
                    }
                }
            }
        }
        
        return false;
       
    }
    
    public static boolean removerProva(String user, String palavraChave){
        for (Professor p : Servidor.professores) {
            if(p.getLogin().equals(user)){
                System.out.println("Achei um prof com o nome: " + user);
                 for (Prova a : p.listaDeProvas()) {
                    if ((a.getPalavraChave().equals(palavraChave))) {
                        System.out.println("Achei uma prova com a palavra chave: " + palavraChave);
                        p.listaDeProvas().remove(a);
                        return true;
                    }
                }
            }
        } 
        return false;  
    }
    
    public static byte[] converterObjetoParaArrayByte(Object object) {
        byte[] bytes = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(object);
            objectOutputStream.flush();
            objectOutputStream.close();
            byteArrayOutputStream.close();
            bytes = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
         
       
        return bytes;
    }
    
    public static Object converterByteArrayParaObjeto(byte[] bytes) {
        Object object = null;
 
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            object = objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        return object;
    }
    
}