package linuxos;

import java.io.File;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Corra
 */
public class Intentos {
//        package linuxos;
//
//    import java.io.File;
//    import javax.swing.tree.DefaultMutableTreeNode;
//    import javax.swing.tree.DefaultTreeModel;
//
//    public class Os extends javax.swing.JFrame {
//        FileSystemModel as;
//        public Os() {
//            initComponents();
//            this.treeSystem.setEditable(true);
//            this.showFolder();
//        }
//
//        @SuppressWarnings("unchecked")
//        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
//        private void initComponents() {
//
//            jPanel1 = new javax.swing.JPanel();
//            jScrollPane1 = new javax.swing.JScrollPane();
//            treeSystem = new javax.swing.JTree();
//            txtUsername = new javax.swing.JTextField();
//            btnAddUser = new javax.swing.JButton();
//            jLabel1 = new javax.swing.JLabel();
//            btnDirectorio = new javax.swing.JButton();
//
//            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//
//            treeSystem.setModel(new FileSystemModel(new File("C:\\Users\\Corra\\NetBeansProjects\\LinuxOS\\Z")));
//            treeSystem.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
//            javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Z:/");
//            treeSystem.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
//            jScrollPane1.setViewportView(treeSystem);
//
//            txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
//            txtUsername.setForeground(new java.awt.Color(0, 0, 0));
//            txtUsername.addActionListener(new java.awt.event.ActionListener() {
//                public void actionPerformed(java.awt.event.ActionEvent evt) {
//                    txtUsernameActionPerformed(evt);
//                }
//            });
//
//            btnAddUser.setText("Add User");
//            btnAddUser.addActionListener(new java.awt.event.ActionListener() {
//                public void actionPerformed(java.awt.event.ActionEvent evt) {
//                    btnAddUserActionPerformed(evt);
//                }
//            });
//
//            jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
//            jLabel1.setText("Add a new User:");
//
//            btnDirectorio.setText("Directorio");
//            btnDirectorio.addActionListener(new java.awt.event.ActionListener() {
//                public void actionPerformed(java.awt.event.ActionEvent evt) {
//                    btnDirectorioActionPerformed(evt);
//                }
//            });
//
//            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
//            jPanel1.setLayout(jPanel1Layout);
//            jPanel1Layout.setHorizontalGroup(
//                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                .addGroup(jPanel1Layout.createSequentialGroup()
//                    .addGap(22, 22, 22)
//                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
//                    .addGap(116, 116, 116)
//                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
//                            .addComponent(txtUsername)
//                            .addComponent(btnAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
//                        .addGroup(jPanel1Layout.createSequentialGroup()
//                            .addGap(26, 26, 26)
//                            .addComponent(jLabel1))
//                        .addComponent(btnDirectorio, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
//                    .addContainerGap(104, Short.MAX_VALUE))
//            );
//            jPanel1Layout.setVerticalGroup(
//                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                .addGroup(jPanel1Layout.createSequentialGroup()
//                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addGroup(jPanel1Layout.createSequentialGroup()
//                            .addGap(20, 20, 20)
//                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE))
//                        .addGroup(jPanel1Layout.createSequentialGroup()
//                            .addGap(63, 63, 63)
//                            .addComponent(btnDirectorio, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
//                            .addGap(103, 103, 103)
//                            .addComponent(jLabel1)
//                            .addGap(18, 18, 18)
//                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
//                            .addGap(18, 18, 18)
//                            .addComponent(btnAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
//                    .addContainerGap(24, Short.MAX_VALUE))
//            );
//
//            jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddUser, txtUsername});
//
//            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//            getContentPane().setLayout(layout);
//            layout.setHorizontalGroup(
//                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//            );
//            layout.setVerticalGroup(
//                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//            );
//
//            pack();
//        }// </editor-fold>                        
//
//        private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {                                            
//            // TODO add your handling code here:
//        }                                           
//
//        private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {                                           
//        //Quiero que agarre por default la carpeta Users, por ahora no puedo
//    //        DefaultTreeModel model = (DefaultTreeModel) treeSystem.getModel();
//    //        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
//    //        DefaultMutableTreeNode newNode;
//    //        
//    //        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) treeSystem.getSelectionPath().getLastPathComponent();
//    //        if(selectedNode == null) {
//    //            JOptionPane.showMessageDialog(null, "Select the Users Directory");
//    //            return;
//    //        }
//    //        DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(txtUsername.getText());
//    //        selectedNode.add(newNode);
//        }                                          
//
//        private void btnDirectorioActionPerformed(java.awt.event.ActionEvent evt) {                                              
//    //        JFileChooser dir = new JFileChooser();
//    //        dir.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//    //        int value = dir.showSaveDialog(dir);
//    //        if(value == JFileChooser.APPROVE_OPTION) {
//    //            String path = dir.getSelectedFile().getPath();
//    //            DefaultTreeModel model = (DefaultTreeModel) treeSystem.getModel();
//    //            DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
//    //            
//    //            root.removeAllChildren();
//    //            fillTree(path, root);
//    //            model.reload();
//    //        }
//        }                                             
//
//        private void showFolder() {
//            String path = "C:\\Users\\Corra\\Desktop\\Z";
//            DefaultTreeModel model = (DefaultTreeModel) treeSystem.getModel();
//            DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
//            root.removeAllChildren();
//            fillTree(path, root);
//            model.reload();
//        }
//
//
//        private DefaultMutableTreeNode fillTree(String path, DefaultMutableTreeNode father) {
//            String[] list = (new File(path)).list();
//            if(list != null && list.length > 0)
//                for (String string : list)
//                    father.add( fillTree(path + "\\" + string, new DefaultMutableTreeNode(string)));
//            else if(list != null)
//                return new DefaultMutableTreeNode(list[0]);
//            return father;
//        }
//
//
//        public static void main(String args[]) {
//            /* Set the Nimbus look and feel */
//            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//             * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//             */
//            try {
//                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                    if ("Nimbus".equals(info.getName())) {
//                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                        break;
//                    }
//                }
//            } catch (ClassNotFoundException ex) {
//                java.util.logging.Logger.getLogger(Os.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//            } catch (InstantiationException ex) {
//                java.util.logging.Logger.getLogger(Os.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//            } catch (IllegalAccessException ex) {
//                java.util.logging.Logger.getLogger(Os.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//                java.util.logging.Logger.getLogger(Os.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//            }
//            //</editor-fold>
//
//            /* Create and display the form */
//            java.awt.EventQueue.invokeLater(new Runnable() {
//                public void run() {
//                    new Os().setVisible(true);
//                }
//            });
//        }
//
//        // Variables declaration - do not modify                     
//        private javax.swing.JButton btnAddUser;
//        private javax.swing.JButton btnDirectorio;
//        private javax.swing.JLabel jLabel1;
//        private javax.swing.JPanel jPanel1;
//        private javax.swing.JScrollPane jScrollPane1;
//        private javax.swing.JTree treeSystem;
//        private javax.swing.JTextField txtUsername;
//        // End of variables declaration                   
//    }

    
    
    
}
