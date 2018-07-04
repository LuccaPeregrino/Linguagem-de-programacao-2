/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.*;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class JFrameAplicacao extends javax.swing.JFrame {

    protected DataInputStream in;
    protected DataOutputStream out;
    protected String nomeProf;
    protected String palavraChave;
    public Prova provaEncontrada;
    public LinkedList<Alternativas> alternativasAplicadas = new LinkedList<>();
    public LinkedList<Boolean> respostasAluno = new LinkedList<>();
    public int posQ = 0, cont = 0;
    public Questao q;
    double nota;
    public String nomeAluno;

    /**
     * Creates new form JFrameQuestao
     *
     */
    public JFrameAplicacao() {
        initComponents();
    }

    public JFrameAplicacao(Prova provaEncontrada, String nomeProf, String palavraChave, DataInputStream in, DataOutputStream out) {
        initComponents();
        setLocationRelativeTo(null);

        try {
            this.nomeProf = nomeProf;
            this.palavraChave = palavraChave;
            this.in = in;
            this.out = out;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Falha no servidor.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        this.provaEncontrada = provaEncontrada;

        nomeAluno = JOptionPane.showInputDialog("Digite seu nome: ");
        
        q = provaEncontrada.listaDeQuestoes().get(posQ);
        alternativasAplicadas = q.listaDeAlternativas();

        //Da o set em todos os campos 
        jTextArea1.setLineWrap(true);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setText(q.getPergunta());

        jTextArea2.setLineWrap(true);
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setText(alternativasAplicadas.get(cont).getAlt());
        buttonAlternativa1.setSelected(false);

        cont++;
        jTextArea3.setLineWrap(true);
        jTextArea3.setWrapStyleWord(true);
        jTextArea3.setText(alternativasAplicadas.get(cont).getAlt());
        buttonAlternativa2.setSelected(false);
        cont++;

        jTextArea4.setLineWrap(true);
        jTextArea4.setWrapStyleWord(true);
        jTextArea4.setText(alternativasAplicadas.get(cont).getAlt());
        buttonAlternativa3.setSelected(false);
        cont++;

        jTextArea5.setLineWrap(true);
        jTextArea5.setWrapStyleWord(true);
        jTextArea5.setText(alternativasAplicadas.get(cont).getAlt());
        buttonAlternativa4.setSelected(false);
        cont++;

        jTextArea6.setLineWrap(true);
        jTextArea6.setWrapStyleWord(true);
        jTextArea6.setText(alternativasAplicadas.get(cont).getAlt());
        buttonAlternativa5.setSelected(false);
        cont++;

    }

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
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Enunciado:");

        jLabel2.setText("Alternativas:");

        buttonAlternativa1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(buttonAlternativa1);
        buttonAlternativa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlternativa1ActionPerformed(evt);
            }
        });

        buttonAlternativa2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(buttonAlternativa2);

        buttonAlternativa3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(buttonAlternativa3);

        buttonAlternativa4.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(buttonAlternativa4);

        buttonAlternativa5.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(buttonAlternativa5);

        jButton1.setText("Próxima");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setBorder(null);
        jScrollPane3.setViewportView(jTextArea2);

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setBorder(null);
        jScrollPane4.setViewportView(jTextArea3);

        jTextArea4.setEditable(false);
        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jTextArea4.setBorder(null);
        jScrollPane5.setViewportView(jTextArea4);

        jTextArea5.setEditable(false);
        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jTextArea5.setBorder(null);
        jScrollPane6.setViewportView(jTextArea5);

        jTextArea6.setEditable(false);
        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jTextArea6.setBorder(null);
        jScrollPane7.setViewportView(jTextArea6);

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
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 933, Short.MAX_VALUE)
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
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(260, 260, 260))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2)
                    .addContainerGap(909, Short.MAX_VALUE)))
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
                .addGap(62, 62, 62)
                .addComponent(jButton1)
                .addContainerGap(264, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(235, 235, 235)
                    .addComponent(jLabel2)
                    .addContainerGap(820, Short.MAX_VALUE)))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cont = 0;

        int posAltSel = 0;

        if (buttonAlternativa1.isSelected()) {
            posAltSel = 1;
        }
        if (buttonAlternativa2.isSelected()) {
            posAltSel = 2;
        }
        if (buttonAlternativa3.isSelected()) {
            posAltSel = 3;
        }
        if (buttonAlternativa4.isSelected()) {
            posAltSel = 4;
        }
        if (buttonAlternativa5.isSelected()) {
            posAltSel = 5;
        }
        if (posAltSel == q.QuestaoCerta()) {
            respostasAluno.add(true);
        } else {
            respostasAluno.add(false);
        }

        posQ++;
        if (posQ < provaEncontrada.listaDeQuestoes().size()) {
            System.out.println("Cheguei na questao: " + posQ);
            q = provaEncontrada.listaDeQuestoes().get(posQ);
            alternativasAplicadas = q.listaDeAlternativas();

            //Da o set em todos os campos 
            jTextArea1.setLineWrap(true);
            jTextArea1.setWrapStyleWord(true);
            jTextArea1.setText(q.getPergunta());

            jTextArea2.setLineWrap(true);
            jTextArea2.setWrapStyleWord(true);
            jTextArea2.setText(alternativasAplicadas.get(cont).getAlt());
            buttonAlternativa1.setSelected(false);
            cont++;

            jTextArea3.setLineWrap(true);
            jTextArea3.setWrapStyleWord(true);
            jTextArea3.setText(alternativasAplicadas.get(cont).getAlt());
            buttonAlternativa2.setSelected(false);
            cont++;

            jTextArea4.setLineWrap(true);
            jTextArea4.setWrapStyleWord(true);
            jTextArea4.setText(alternativasAplicadas.get(cont).getAlt());
            buttonAlternativa3.setSelected(false);
            cont++;

            jTextArea5.setLineWrap(true);
            jTextArea5.setWrapStyleWord(true);
            jTextArea5.setText(alternativasAplicadas.get(cont).getAlt());
            buttonAlternativa4.setSelected(false);
            cont++;

            jTextArea6.setLineWrap(true);
            jTextArea6.setWrapStyleWord(true);
            jTextArea6.setText(alternativasAplicadas.get(cont).getAlt());
            buttonAlternativa5.setSelected(false);
            cont++;

        } else {
            nota = CalculaNota(respostasAluno);
            

            try {
                out.writeInt(53);
                out.writeUTF(nomeProf);
                out.writeUTF(palavraChave);
                out.writeUTF(nomeAluno);
                out.writeDouble(nota);

                JOptionPane.showMessageDialog(this, "Prova concluida com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                dispose();

            } catch (Exception e) {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(this, "Falha no servidor.", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void buttonAlternativa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlternativa1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_buttonAlternativa1ActionPerformed

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

    public static Double CalculaNota(LinkedList<Boolean> n) {
        double nota = 0;
        int cont = 0;

        for (boolean p : n) {
            if (p == true) {
                cont++;
            }
        }
        return nota = ((10.0 / n.size()) * cont);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton buttonAlternativa1;
    private javax.swing.JRadioButton buttonAlternativa2;
    private javax.swing.JRadioButton buttonAlternativa3;
    private javax.swing.JRadioButton buttonAlternativa4;
    private javax.swing.JRadioButton buttonAlternativa5;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    // End of variables declaration//GEN-END:variables
}
