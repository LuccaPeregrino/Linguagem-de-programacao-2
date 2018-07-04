
import java.io.DataInputStream;
import java.io.DataOutputStream;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFrameConsulta extends javax.swing.JFrame {

    /**
     * Creates new form JFrameConsulta
     */
    protected Professor professor;
    protected DataInputStream in;
    protected DataOutputStream out;

    public JFrameConsulta() {
        initComponents();
    }

    public JFrameConsulta(Professor professor, DataInputStream in, DataOutputStream out) {
        initComponents();

        //Centraliza a janela
        setLocationRelativeTo(null);

        try {
            this.professor = professor;
            this.in = in;
            this.out = out;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Falha no servidor.", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        atualizarTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonEditar = new javax.swing.JButton();
        jButtonRemover = new javax.swing.JButton();
        jButtonResultados = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Palavra chave", "Publicado", "Título"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Boolean.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonRemover.setText("Remover");
        jButtonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverActionPerformed(evt);
            }
        });

        jButtonResultados.setText("Resultados");
        jButtonResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResultadosActionPerformed(evt);
            }
        });

        jButton1.setText("Publicar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonRemover)
                    .addComponent(jButtonResultados)
                    .addComponent(jButton1))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Remover prova
    private void jButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverActionPerformed
        try {
            System.out.println("Entrei no evento de remoção");
            if(!provaSelecionada().foiPublicada()){
                System.out.println("A prova selecionada não foi publicada");
                out.writeInt(67);
                System.out.println("Escrevi 67");
                out.writeUTF(professor.getLogin());
                System.out.println("Mandei o login");
                out.writeUTF(provaSelecionada().getPalavraChave());
                
                
                if (in.readBoolean()) {
                    professor.listaDeProvas().remove(provaSelecionada());
                    JOptionPane.showMessageDialog(this, "Prova removida com sucesso", "Prova adicionada", JOptionPane.INFORMATION_MESSAGE);
                    atualizarTabela();
                } else {
                    JOptionPane.showMessageDialog(this, "Não foi possivel remover a prova. Por favor, tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
                
            } else {
                 JOptionPane.showMessageDialog(this, "Você não pode remover provas já publicadas.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonRemoverActionPerformed

    //Consultar resultados
    private void jButtonResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResultadosActionPerformed
        try {
            if (provaSelecionada().foiPublicada()) {
                JFrameResultado janelaResultado = new JFrameResultado(provaSelecionada().listaDeResultados());
                pack();
                janelaResultado.setVisible(true);
                janelaResultado.setDefaultCloseOperation(JFrameInicial.DISPOSE_ON_CLOSE);
            } else {
                JOptionPane.showMessageDialog(this, "Essa prova não possui resultados, pois ainda não foi publicada.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonResultadosActionPerformed

    //Editar prova
    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        try {
            if (!provaSelecionada().foiPublicada()) {
                JFrameCriarNovaProva janelaEditar = new JFrameCriarNovaProva(professor, provaSelecionada(), in, out);
                pack();
                janelaEditar.setVisible(true);
                janelaEditar.setDefaultCloseOperation(JFrameCriarNovaProva.DISPOSE_ON_CLOSE);
            } else {
                 JOptionPane.showMessageDialog(this, "Você não pode editar provas já publicadas.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        atualizarTabela();
    }//GEN-LAST:event_formWindowGainedFocus

    // Publicar prova
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            if(!provaSelecionada().foiPublicada()){
                out.writeInt(19);
                out.writeUTF(professor.getLogin());
                out.writeUTF(provaSelecionada().getPalavraChave());

                if (in.readBoolean()) {
                    provaSelecionada().publicar();
                    JOptionPane.showMessageDialog(this, "Prova publicada com sucesso", "Prova adicionada", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Não foi possivel publicar a prova. Por favor, tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } else{
                JOptionPane.showMessageDialog(this, "Prova já publicada", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Selecione uma prova.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public Prova provaSelecionada() throws Exception {
        if (jTable1.getSelectedRow() != -1) {
            return professor.listaDeProvas().get(jTable1.getSelectedRow());
        } else {
            throw new Exception("Nenhuma prova selecionada.");
        }
    }

    public void atualizarTabela() {
        // Atualizar os JTables
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        for (Prova prova : professor.listaDeProvas()) {
            Object[] newRow = {prova.getPalavraChave(), prova.foiPublicada(), prova.getNome()};
            model.addRow(newRow);
        }
    }

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
            java.util.logging.Logger.getLogger(JFrameConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JButton jButtonResultados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
