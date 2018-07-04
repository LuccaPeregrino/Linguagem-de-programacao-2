import java.net.*;
import java.io.*;

public class ServerThreads implements Runnable {

    private Socket socket;

    public ServerThreads(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        Protocolo protocolo = new Protocolo();
        Professor professor;
        Prova prova;
        ProvaRespondida provaRespondida;
        String user, senha, palavraChave, nomeAluno;
        int opcao, tam;

        try {
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            

            boolean taRodando = true;

            try {
                while (taRodando) {
                    //System.out.println("_________ " + cont + " VEZ __________");
                    opcao = in.readInt();
                    //System.out.println("Opção: " + opcao);

                    switch (opcao) {
                        // Efetua login
                        case 36:

                            user = in.readUTF();
                            //System.out.println("Login: " + user);
                            senha = in.readUTF();
                            //System.out.println("Senha: " + senha);
                            professor = Protocolo.procuraProfessor(user, senha);

                            if (professor == null) {
                                //System.out.println("Professor não encontrado");
                                out.writeBoolean(false);
                            } else {
                                //System.out.println("Professor encontrado");
                                byte[] bytes = Protocolo.converterObjetoParaArrayByte(professor);
                                out.writeBoolean(true);
                                out.writeInt(bytes.length);
                                out.write(bytes, 0, bytes.length);
                            }

                            break;

                        // Manda Prova        
                        case 42:

                            tam = in.readInt();
                            //System.out.println("Tamanho: " + tam);
                            byte[] bytes = new byte[tam];
                            //System.out.println("Criei os bytes");
                            in.read(bytes);

                            professor = (Professor) Protocolo.converterByteArrayParaObjeto(bytes);
                            out.writeBoolean(Protocolo.atualizarDados(professor));

                            break;

                        // Adiciona prova respondida    
                        case 53:
                            user = in.readUTF();
                            palavraChave = in.readUTF();
                            nomeAluno = in.readUTF();
                            //System.out.println("Nome do Aluno: " + nomeAluno);
                            double nota = in.readDouble();
                            //System.out.println("Nota: " + nota);

                            prova = Protocolo.procuraProva(user, palavraChave);
                            provaRespondida = new ProvaRespondida(nomeAluno, nota);
                            prova.adicionaProvaRespondida(provaRespondida);

                            //System.out.println("Aluno: " + provaR.getAluno() + " NOTA: " + provaR.getNota());

                            break;

                        // Aplica prova
                        case 60:
                            user = in.readUTF();
                            //System.out.println("Login: " + userProf);
                            palavraChave = in.readUTF();
                            //System.out.println("Palavra-Chave: " + palavraChave);
                            prova = Protocolo.procuraProva(user, palavraChave);

                            if (prova == null) {
                                //System.out.println("Prova não encontrado");
                                out.writeBoolean(false);
                            } else {
                                //System.out.println("Prova encontrado");
                                byte[] bytes3 = Protocolo.converterObjetoParaArrayByte(prova);
                                out.writeBoolean(true);
                                out.writeInt(bytes3.length);
                                out.write(bytes3, 0, bytes3.length);
                            }

                            break;
                            
                        // Cria novo professor    
                        case 89:
                            user = in.readUTF();
                            senha = in.readUTF();
                            
                            out.writeBoolean(Protocolo.adicionaProfessor(user, senha));
                            break;
                            
                        // Publica prova
                        case 19:
                            user = in.readUTF();
                            palavraChave = in.readUTF();
                            
                            out.writeBoolean(Protocolo.publicarProva(user, palavraChave));
                            break;
                        
                        // Remover prova
                        case 67:
                            user = in.readUTF();
                            System.out.println("Nome do prof que quer remover prova: " + user);
                            palavraChave = in.readUTF();
                            System.out.println("Palavra chave da prova:" + palavraChave);
                            
                            out.writeBoolean(Protocolo.removerProva(user, palavraChave));
                            break;
                    }
                }
            } catch (Exception ex) {
                System.out.println("Closing connection. Reason: " + ex.toString());
            }

            in.close();
            out.close();
            socket.close();

        } catch (Exception e) {
            System.out.println("Closing connection. Reason: " + e.toString());
        }
    }
}
