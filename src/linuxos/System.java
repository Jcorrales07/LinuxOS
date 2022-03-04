package linuxos;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class System extends javax.swing.JFrame {
    public System() {
        initComponents();
        DefaultMutableTreeNode top = new DefaultMutableTreeNode("Z:/");
        this.treeSystem = new JTree(top);
        createNodes(top);
    }
    
    private void createNodes(DefaultMutableTreeNode top) {
        DefaultMutableTreeNode category = null;
        DefaultMutableTreeNode book = null;
        
        category = new DefaultMutableTreeNode("Users");
        top.add(category);
        
        book = new DefaultMutableTreeNode("Joe");
        category.add(book);
        
        book = new DefaultMutableTreeNode("Melissa");
        category.add(book);
        
        book = new DefaultMutableTreeNode("Neftali");
        category.add(book);
        
        book = new DefaultMutableTreeNode("Perlita");
        category.add(book);
        
        category = new DefaultMutableTreeNode("Default");
        top.add(category);
        
        book = new DefaultMutableTreeNode("User 1");
        category.add(book);
        
        book = new DefaultMutableTreeNode("User 2");
        category.add(book);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        treeSystem = new javax.swing.JTree();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        treeSystem.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        treeSystem.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(treeSystem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1317, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1151, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    private void btnDirectoriosActionPerformed(java.awt.event.ActionEvent evt) {                                               
//                JFileChooser directory = new JFileChooser();
//                directory.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//                int value = directory.showSaveDialog(null);
//        
//                if(value == JFileChooser.APPROVE_OPTION) {
//                        String path = directory.getSelectedFile().getPath();
//                        DefaultTreeModel model = (DefaultTreeModel) system.getModel();
//                        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
//                        root.removeAllChildren();
//                        llenarArbol(path, root);
//                    }
//    }  
    
//    private DefaultMutableTreeNode llenarArbol(String path, DefaultMutableTreeNode padre) {
//        String[] lista = (new File(path).list());
//        if(lista != null && lista.length > 0) {
//            for (String string : lista) {
//                padre.add(llenarArbol(path + "\\"+ string, new DefaultMutableTreeNode(string)));
//            }
//        } else if(lista != null) {
//            return new DefaultMutableTreeNode(lista[0]);
//        }
//        return padre;
//    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new System().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree treeSystem;
    // End of variables declaration//GEN-END:variables
}
