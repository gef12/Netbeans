/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area15;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author Gerferson
 */
public class Tela_login extends javax.swing.JFrame {
    String seta="com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
    /**
     * Creates new form Principal
     */
    public Tela_login() {
        lookandfell();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    int contClickUsuario = 0;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTF_matricula = new javax.swing.JTextField();
        jBT_logout = new javax.swing.JButton();
        jPF_senha = new javax.swing.JPasswordField();
        jBT_login1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acesso Restrito", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 51, 51))); // NOI18N

        jTF_matricula.setEditable(false);
        jTF_matricula.setBackground(new java.awt.Color(204, 204, 204));
        jTF_matricula.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTF_matricula.setText("Login");
        jTF_matricula.setToolTipText("Insira seu login");
        jTF_matricula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTF_matriculaMousePressed(evt);
            }
        });

        jBT_logout.setBackground(new java.awt.Color(0, 153, 153));
        jBT_logout.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBT_logout.setText("LOGOUT");
        jBT_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT_logoutActionPerformed(evt);
            }
        });

        jPF_senha.setEditable(false);
        jPF_senha.setBackground(new java.awt.Color(204, 204, 204));
        jPF_senha.setText("Senha");
        jPF_senha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPF_senhaMouseClicked(evt);
            }
        });
        jPF_senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPF_senhaActionPerformed(evt);
            }
        });

        jBT_login1.setBackground(new java.awt.Color(0, 153, 153));
        jBT_login1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBT_login1.setText("LOGIN");
        jBT_login1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBT_login1MouseClicked(evt);
            }
        });
        jBT_login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT_login1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTF_matricula, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(jPF_senha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBT_login1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBT_logout, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jBT_login1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBT_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTF_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPF_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))))
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fronteira/inicio.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(jLabel4)
                    .addContainerGap(523, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(378, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTF_matriculaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTF_matriculaMousePressed
        

        if(contClickUsuario == 0){
            jTF_matricula.setText("");
            jTF_matricula.setEditable(true);
            contClickUsuario++;
        }

    }//GEN-LAST:event_jTF_matriculaMousePressed

    private void jBT_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT_logoutActionPerformed
                                                             
        System.exit(0);
      

//if(autenticarAlunoArquivo(jTF_matricula.getText(),jPF_senha.getText())){
            //TelaProfessor tp = new TelaProfessor(jTF_matricula.getText());
            //tp.setExtendedState(MAXIMIZED_BOTH);
            //tp.setVisible(true);
        //}
        //else{
            //JOptionPane.showMessageDialog(rootPane, "Usuário e/ou senha incorretos!");
        //}

        //        try {
            //            if(lerArquivoProfessor(jTF_matricula.getText(), jPF_senha.getText())){
                //                jL_mensagens.setText("Seja Bem-vindo, Professor(a) " + jTF_matricula.getText());
                //                TelaProfessor tp = new TelaProfessor(jTF_matricula.getText());
                //                tp.setExtendedState(MAXIMIZED_BOTH);
                //                tp.setVisible(true);
                //            }
            //            else{
                //                JOptionPane.showMessageDialog(rootPane, "Usuário e/ou senha incorretos!");
                //            }
            //        } catch (FileNotFoundException excecaoArquivo) {
            //            jL_mensagens.setText("[ERROR 404] Erro ao criar/escrever no arquivo!");
            //            System.out.println("[ E R R O ] Erro ao criar/escrever no arquivo" + excecaoArquivo);
            //        }
    }//GEN-LAST:event_jBT_logoutActionPerformed

    private void jPF_senhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPF_senhaMouseClicked
        jPF_senha.setText("");
        jPF_senha.setEditable(true);
    }//GEN-LAST:event_jPF_senhaMouseClicked

    private void jPF_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPF_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPF_senhaActionPerformed

    private void jBT_login1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBT_login1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jBT_login1MouseClicked

    private void jBT_login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT_login1ActionPerformed
        // TODO add your handling code here:
        sargento sa=new sargento();
        
        sa.setVisible(true);
       dispose();
    }//GEN-LAST:event_jBT_login1ActionPerformed

    
    
     public void lookandfell() {
    try{
        UIManager.setLookAndFeel(seta);
        SwingUtilities.updateComponentTreeUI(this);
        
    }catch(Exception erro){
        JOptionPane.showMessageDialog(null,"erro em alterar o tema"+erro);
    }
}
     public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBT_login1;
    private javax.swing.JButton jBT_logout;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPF_senha;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTF_matricula;
    // End of variables declaration//GEN-END:variables
}
