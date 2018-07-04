/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */

import java.util.*;
import java.io.IOException;
import java.net.*;
import java.util.concurrent.*;
   
public class Servidor {
    // LinkedList que armazena os professores:
    public static LinkedList<Professor> professores = new LinkedList <Professor>();
  
    public static void main (String []args) throws IOException{
               
        ExecutorService e = Executors.newCachedThreadPool();
        ServerSocket servidor = new ServerSocket(27888);
             
             // Espera a conexão dos usuários:
             while(true){
                 // Quando estabelece conexao, executa na PooldeThreads:
                 Socket socket = servidor.accept();
                 e.execute(new ServerThreads(socket));
                 
             }
      
        
    }
    
    
}

