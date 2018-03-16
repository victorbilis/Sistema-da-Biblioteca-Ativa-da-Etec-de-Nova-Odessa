/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bblioteca.eno;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author V
 */
public class livros extends javax.swing.JFrame {

    /**
     * Creates new form livros
     */
    public livros() {
        initComponents();
        this.setLocationRelativeTo(null);
        getContentPane().setBackground(Color.orange);
        URL url = this.getClass().getResource("livro.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(iconeTitulo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        digita = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bblioteca/eno/Sign-Add-icon.png"))); // NOI18N
        jButton2.setText("Cadastar Livros");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel1.setText("Pesquisar:");

        digita.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                digitaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                digitaKeyTyped(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "title 5"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable2);

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel2.setText("LIVROS");

        jButton3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bblioteca/eno/Button.png"))); // NOI18N
        jButton3.setText("Atualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(digita, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(digita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(263, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(111, 111, 111)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void digitaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_digitaKeyReleased
        int qtd = digita.getText().length();

        if (qtd >= 1) {
            DefaultTableModel lista = new DefaultTableModel();
            lista.addColumn("Livro");
            lista.addColumn("Autor");
            lista.addColumn("Edição");
            lista.addColumn("Gênero");
            lista.addColumn("Quantidade");
            functions func = new functions();

            ResultSet rs = func.execute("SELECT * FROM livros WHERE nome_livro LIKE \"%" + digita.getText() + "%\" OR autor LIKE \"%" + digita.getText() + "%\" OR edicao LIKE \"%" + digita.getText() + "%\" OR genero LIKE \"%" + digita.getText() + "%\" OR quantidade=\"" + digita.getText() + "\"", "SELECT");

            try {
                while (rs.next()) {
                    String livro = rs.getString("nome_livro");
                    String autor = rs.getString("autor");
                    String edicao = rs.getString("edicao");
                    String genero = rs.getString("genero");
                    int qtd2 = rs.getInt("quantidade");
                    String[] acumula = {livro, autor, edicao, genero, "" + qtd2};
                    lista.addRow(acumula);

                }
                jTable2.setModel(lista);

            } catch (Exception e) {
                System.out.println("" + e);
            }
        }
        else
        {
         DefaultTableModel lista = new DefaultTableModel();
        lista.addColumn("Livro");
        lista.addColumn("Autor");
        lista.addColumn("Edição");
        lista.addColumn("Gênero");
        lista.addColumn("Quantidade");
        functions func = new functions();
        ResultSet rs = func.execute("SELECT * FROM livros ORDER BY nome_livro ASC;", "SELECT");
        try {
            while (rs.next()) {
                String livro = rs.getString("nome_livro");
                String autor = rs.getString("autor");
                String edicao = rs.getString("edicao");
                String genero = rs.getString("genero");
                int qtd2 = rs.getInt("quantidade");
                String[] livros = {livro, autor, edicao, genero, "" + qtd2};
                lista.addRow(livros);
            }
        } catch (Exception e) {
            System.out.println("" + e);
        }
        jTable2.setModel(lista);   
        }
    }//GEN-LAST:event_digitaKeyReleased

    private void digitaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_digitaKeyTyped

    }//GEN-LAST:event_digitaKeyTyped

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
int selecionado = jTable2.getSelectedRow();
        String livro = jTable2.getValueAt(selecionado, 0).toString();
        String autor = jTable2.getValueAt(selecionado, 1).toString();
        String edicao = jTable2.getValueAt(selecionado, 2).toString();
        String genero = jTable2.getValueAt(selecionado, 3).toString();
        String qtd = jTable2.getValueAt(selecionado, 4).toString();
        functions func = new functions();
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja excluir o livro '" +livro + "'?");
        if (resposta == 0) {
            func.execute("DELETE FROM livros WHERE nome_livro='" + livro + "'AND autor='" + autor + "' AND edicao='" + edicao + "' AND genero='" + genero + "';", "INSERT");
            livros frm = new livros();
            frm.setVisible(true);
            this.dispose();
        } else if (resposta == 1) {

        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DefaultTableModel lista = new DefaultTableModel();
        lista.addColumn("Livro");
        lista.addColumn("Autor");
        lista.addColumn("Edição");
        lista.addColumn("Gênero");
        lista.addColumn("Quantidade");
        functions func = new functions();
        ResultSet rs = func.execute("SELECT * FROM livros ORDER BY nome_livro ASC;", "SELECT");
        try {
            while (rs.next()) {
                String livro = rs.getString("nome_livro");
                String autor = rs.getString("autor");
                String edicao = rs.getString("edicao");
                String genero = rs.getString("genero");
                int qtd = rs.getInt("quantidade");
                String[] livros = {livro, autor, edicao, genero, "" + qtd};
                lista.addRow(livros);
            }
        } catch (Exception e) {
            System.out.println("" + e);
        }
        jTable2.setModel(lista);
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        livro frm = new livro();
        frm.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            livros frm = new livros();
            frm.setVisible(true);
            this.dispose();        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(livros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(livros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(livros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(livros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new livros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField digita;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
