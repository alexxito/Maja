/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntodeventa;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.io.File;
import javax.swing.JScrollPane;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeSelectionModel;

/**
 *
 * @author PC
 */
public class Arbolo extends JFrame {

    DefaultTreeModel modelo;
    JScrollPane sp;

    public Arbolo() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(300, 400);
        setLocationRelativeTo(null);
        setTitle("Escoja una ruta");
    }

    private void initComponents() {
        String pathC = "C:\\Users\\PC";
        String pathDoc = "C:\\Users\\PC\\Documents";
        File pathFile = new File(pathC);
        File pathFile2 = new File(pathDoc);
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("C:");
        modelo = new DefaultTreeModel(root);
        JTree arbol = new JTree(modelo);
        arbol.getSelectionModel().addTreeSelectionListener(new Selector());
        arbol.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        if (pathFile.exists()) {
            File[] ficheros = pathFile.listFiles();
            for (int i = 0; i < ficheros.length; i++) {
                root.insert(new DefaultMutableTreeNode(ficheros[i].getName()), i);
                if (ficheros[i].getName().equals("Documents")) {
                    File[] ficheros2 = pathFile2.listFiles();
                    for (int j = 0; j < ficheros2.length; j++) {
                        modelo.insertNodeInto(new DefaultMutableTreeNode(ficheros2[j].getName()), (MutableTreeNode) root.getChildAt(i), j);
                    }
                }
            }
        }
        arbol.repaint();
        sp = new JScrollPane();
        sp.setBounds(10, 80, 150, 130);
        sp.setViewportView(arbol);
        this.add(sp);
    }

    private class Selector implements TreeSelectionListener {

        public void valueChanged(TreeSelectionEvent event) {
            Object obj = event.getNewLeadSelectionPath().getPath();
            System.out.println("" + obj.toString());
        }
    }
}
