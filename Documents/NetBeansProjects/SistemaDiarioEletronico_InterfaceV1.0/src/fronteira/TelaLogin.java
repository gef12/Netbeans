
package fronteira;

import controle.GerenciadorUsuariosSingleton;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author rebeca
 */
public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
    }
    

    
    public boolean autenticarAlunoArquivo(String matricula, String senha){
        for(int i = 0; i < GerenciadorUsuariosSingleton.getInstance().getListaProfessores().size();i++){
                if((GerenciadorUsuariosSingleton.getInstance().getListaProfessores().get(i).getMatricula().equals(matricula))&&
                        (GerenciadorUsuariosSingleton.getInstance().getListaProfessores().get(i).getSenha().equals(senha))){
                    return true; //usuario autenticado
                }
            } 
        
        return true; //usuario não atenticado tem que mudar pra false 
    }
    
    
    int contClickUsuario = 0;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_ApagarLogin = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTF_matricula = new javax.swing.JTextField();
        jBT_login = new javax.swing.JButton();
        jPF_senha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jL_mensagens = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("TELA LOGIN");
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(325, 150, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(720, 480));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(720, 480));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButton_ApagarLogin.setBackground(new java.awt.Color(255, 153, 153));
        jButton_ApagarLogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton_ApagarLogin.setForeground(new java.awt.Color(255, 255, 255));
        jButton_ApagarLogin.setText("Sair");
        jButton_ApagarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ApagarLoginActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acesso para professores e alunos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 51, 51))); // NOI18N

        jTF_matricula.setEditable(false);
        jTF_matricula.setBackground(new java.awt.Color(204, 204, 204));
        jTF_matricula.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTF_matricula.setText("Matricula");
        jTF_matricula.setToolTipText("Insira sua matrícula");
        jTF_matricula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTF_matriculaMousePressed(evt);
            }
        });

        jBT_login.setBackground(new java.awt.Color(0, 153, 153));
        jBT_login.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBT_login.setForeground(new java.awt.Color(255, 255, 255));
        jBT_login.setText("LOGIN");
        jBT_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBT_loginMouseClicked(evt);
            }
        });
        jBT_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBT_loginActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTF_matricula, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(jPF_senha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(jBT_login)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jTF_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPF_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBT_login, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("v0.1");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fronteira/logoEdiario.png"))); // NOI18N

        jL_mensagens.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jL_mensagens.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jL_mensagens, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(421, 421, 421)
                            .addComponent(jButton_ApagarLogin))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(70, 70, 70)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL_mensagens, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_ApagarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ApagarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ApagarLoginActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton_ApagarLoginActionPerformed

    private void jBT_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBT_loginActionPerformed
        if(autenticarAlunoArquivo(jTF_matricula.getText(),jPF_senha.getText())){
                TelaProfessor tp = new TelaProfessor(jTF_matricula.getText());
                tp.setExtendedState(MAXIMIZED_BOTH);
                tp.setVisible(true);
        }
        else{
                JOptionPane.showMessageDialog(rootPane, "Usuário e/ou senha incorretos!");
            }
        
        
        
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
    }//GEN-LAST:event_jBT_loginActionPerformed

    private void jTF_matriculaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTF_matriculaMousePressed

        if(contClickUsuario == 0){
            jTF_matricula.setText("");
            jTF_matricula.setEditable(true);
            contClickUsuario++;
        }
        
    }//GEN-LAST:event_jTF_matriculaMousePressed

    private void jPF_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPF_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPF_senhaActionPerformed

    private void jPF_senhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPF_senhaMouseClicked
        jPF_senha.setText("");
        jPF_senha.setEditable(true);
    }//GEN-LAST:event_jPF_senhaMouseClicked

    private void jBT_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBT_loginMouseClicked
        if(jTF_matricula.getText().equals("") || (jPF_senha.getText().equals(""))){
            JOptionPane.showMessageDialog(rootPane, "Preenchimento dos campos é obrigatório");
        }
    }//GEN-LAST:event_jBT_loginMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            GerenciadorUsuariosSingleton.getInstance().obterUsuarioArquivo();
        } catch (IOException ex) {
            Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBT_login;
    private javax.swing.JButton jButton_ApagarLogin;
    private javax.swing.JLabel jL_mensagens;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPF_senha;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTF_matricula;
    // End of variables declaration//GEN-END:variables
}
