
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class JFrameQuestao extends javax.swing.JFrame {

    /**
     * Creates new form JFrameQuestao
     */
    public Prova prova;
    public Questao questao;
    public boolean editando;
    
    public JFrameQuestao() {
        initComponents();
    }
    
    // Cria questão
    public JFrameQuestao(Prova prova) {
        this.prova = prova;
        questao = new Questao();
        editando = false;
        initComponents();
    }
    
    // Edita questão
    public JFrameQuestao(Prova prova, Questao questao) {
        initComponents();
        
        this.prova = prova;
        this.questao = questao;
        editando = true;
        
        jTextArea1.setLineWrap(true);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setText(questao.getPergunta());
        
        jTextAreaAltenativa1.setLineWrap(true);
        jTextAreaAltenativa1.setWrapStyleWord(true);
        jTextAreaAltenativa1.setText(questao.listaDeAlternativas().get(0).getAlt()); 
        buttonAlternativa1.setSelected(questao.listaDeAlternativas().get(0).getEhCerta());
        
        jTextAreaAltenativa2.setLineWrap(true);
        jTextAreaAltenativa2.setWrapStyleWord(true);
        jTextAreaAltenativa2.setText(questao.listaDeAlternativas().get(1).getAlt());
        buttonAlternativa2.setSelected(questao.listaDeAlternativas().get(1).getEhCerta());

        jTextAreaAltenativa3.setLineWrap(true);
        jTextAreaAltenativa3.setWrapStyleWord(true);
        jTextAreaAltenativa3.setText(questao.listaDeAlternativas().get(2).getAlt());
        buttonAlternativa3.setSelected(questao.listaDeAlternativas().get(2).getEhCerta());
        
        jTextAreaAltenativa4.setLineWrap(true);
        jTextAreaAltenativa4.setWrapStyleWord(true);
        jTextAreaAltenativa4.setText(questao.listaDeAlternativas().get(3).getAlt());
        buttonAlternativa4.setSelected(questao.listaDeAlternativas().get(3).getEhCerta());
        
        jTextAreaAltenativa5.setLineWrap(true);
        jTextAreaAltenativa5.setWrapStyleWord(true);
        jTextAreaAltenativa5.setText(questao.listaDeAlternativas().get(4).getAlt());
        buttonAlternativa5.setSelected(questao.listaDeAlternativas().get(4).getEhCerta());
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonAlternativa1 = new javax.swing.JRadioButton();
        buttonAlternativa2 = new javax.swing.JRadioButton();
        buttonAlternativa3 = new javax.swing.JRadioButton();
        buttonAlternativa4 = new javax.swing.JRadioButton();
        buttonAlternativa5 = new javax.swing.JRadioButton();
        jButtonSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaAltenativa1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaAltenativa2 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextAreaAltenativa3 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextAreaAltenativa4 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextAreaAltenativa5 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Enunciado:");

        jLabel2.setText("Alternativas: (Preencha as alternativas e selecione a resposta correta)");

        buttonAlternativa1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(buttonAlternativa1);

        buttonAlternativa2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(buttonAlternativa2);

        buttonAlternativa3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(buttonAlternativa3);

        buttonAlternativa4.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(buttonAlternativa4);

        buttonAlternativa5.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(buttonAlternativa5);

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextAreaAltenativa1.setColumns(20);
        jTextAreaAltenativa1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextAreaAltenativa1.setRows(5);
        jTextAreaAltenativa1.setBorder(null);
        jScrollPane3.setViewportView(jTextAreaAltenativa1);

        jTextAreaAltenativa2.setColumns(20);
        jTextAreaAltenativa2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextAreaAltenativa2.setRows(5);
        jTextAreaAltenativa2.setBorder(null);
        jScrollPane4.setViewportView(jTextAreaAltenativa2);

        jTextAreaAltenativa3.setColumns(20);
        jTextAreaAltenativa3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextAreaAltenativa3.setRows(5);
        jTextAreaAltenativa3.setBorder(null);
        jScrollPane5.setViewportView(jTextAreaAltenativa3);

        jTextAreaAltenativa4.setColumns(20);
        jTextAreaAltenativa4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextAreaAltenativa4.setRows(5);
        jTextAreaAltenativa4.setBorder(null);
        jScrollPane6.setViewportView(jTextAreaAltenativa4);

        jTextAreaAltenativa5.setColumns(20);
        jTextAreaAltenativa5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextAreaAltenativa5.setRows(5);
        jTextAreaAltenativa5.setBorder(null);
        jScrollPane7.setViewportView(jTextAreaAltenativa5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(buttonAlternativa1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(buttonAlternativa2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(buttonAlternativa5)
                                    .addComponent(buttonAlternativa3)
                                    .addComponent(buttonAlternativa4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane6)
                                    .addComponent(jScrollPane5)
                                    .addComponent(jScrollPane7))))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(291, 291, 291))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2)
                    .addContainerGap(631, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAlternativa1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAlternativa2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAlternativa3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAlternativa4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAlternativa5))
                .addGap(44, 44, 44)
                .addComponent(jButtonSalvar)
                .addContainerGap(267, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(235, 235, 235)
                    .addComponent(jLabel2)
                    .addContainerGap(805, Short.MAX_VALUE)))
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        ButtonModel m = buttonGroup1.getSelection();
        
        if(jTextArea1.getText().equals("") || jTextAreaAltenativa1.getText().equals("") || jTextAreaAltenativa2.getText().equals("")
           || jTextAreaAltenativa3.getText().equals("") || jTextAreaAltenativa4.getText().equals("") || jTextAreaAltenativa5.getText().equals("") 
           || !apenasUmSelecionado()){
            JOptionPane.showMessageDialog(this, "Preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }else{
            questao.setPergunta(jTextArea1.getText());
            
            if(editando){
                questao.listaDeAlternativas().get(0).setAlt(jTextAreaAltenativa1.getText());
                questao.listaDeAlternativas().get(0).setEhCerta(buttonAlternativa1.isSelected());
                
                questao.listaDeAlternativas().get(1).setAlt(jTextAreaAltenativa2.getText());
                questao.listaDeAlternativas().get(1).setEhCerta(buttonAlternativa2.isSelected());
                
                questao.listaDeAlternativas().get(2).setAlt(jTextAreaAltenativa3.getText());
                questao.listaDeAlternativas().get(2).setEhCerta(buttonAlternativa3.isSelected());
                
                questao.listaDeAlternativas().get(3).setAlt(jTextAreaAltenativa4.getText());
                questao.listaDeAlternativas().get(3).setEhCerta(buttonAlternativa4.isSelected());
                
                questao.listaDeAlternativas().get(4).setAlt(jTextAreaAltenativa5.getText());
                questao.listaDeAlternativas().get(4).setEhCerta(buttonAlternativa5.isSelected());
            } else {
                Alternativas alternativa1 = new Alternativas(jTextAreaAltenativa1.getText(), buttonAlternativa1.isSelected());
                questao.adicionaAlternativa(alternativa1);

                Alternativas alternativa2 = new Alternativas(jTextAreaAltenativa2.getText(), buttonAlternativa2.isSelected());
                questao.adicionaAlternativa(alternativa2);

                Alternativas alternativa3 = new Alternativas(jTextAreaAltenativa3.getText(), buttonAlternativa3.isSelected());
                questao.adicionaAlternativa(alternativa3);

                Alternativas alternativa4 = new Alternativas(jTextAreaAltenativa4.getText(), buttonAlternativa4.isSelected());
                questao.adicionaAlternativa(alternativa4);

                Alternativas alternativa5 = new Alternativas(jTextAreaAltenativa5.getText(), buttonAlternativa5.isSelected());
                questao.adicionaAlternativa(alternativa5);
                
                prova.adicionaQuestao(questao);
            } 
            
            dispose();
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    public boolean apenasUmSelecionado(){
        int quantidade = 0;
        
        if(buttonAlternativa1.isSelected()) quantidade++;
        if(buttonAlternativa2.isSelected()) quantidade++;
        if(buttonAlternativa3.isSelected()) quantidade++;
        if(buttonAlternativa4.isSelected()) quantidade++;
        if(buttonAlternativa5.isSelected()) quantidade++;
       
        if(quantidade != 1 ){
            return false;
        } else {
            return true;
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameQuestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameQuestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameQuestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameQuestao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameQuestao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton buttonAlternativa1;
    private javax.swing.JRadioButton buttonAlternativa2;
    private javax.swing.JRadioButton buttonAlternativa3;
    private javax.swing.JRadioButton buttonAlternativa4;
    private javax.swing.JRadioButton buttonAlternativa5;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextAreaAltenativa1;
    private javax.swing.JTextArea jTextAreaAltenativa2;
    private javax.swing.JTextArea jTextAreaAltenativa3;
    private javax.swing.JTextArea jTextAreaAltenativa4;
    private javax.swing.JTextArea jTextAreaAltenativa5;
    // End of variables declaration//GEN-END:variables
}
