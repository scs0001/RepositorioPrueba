/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controladores.Ingredientes_Controller;
import Utils.DB4OException;
import Utils.ConexionDB4O;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Modelo.Ingrediente;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class Ventana_Aniadir_Ingrediente extends javax.swing.JDialog {

    public boolean editmode = false;
    public int idIngrediente = -1;

    /**
     * Creates new form Ventana_Aniadir_Ingrediente
     */
    public Ventana_Aniadir_Ingrediente() {
        initComponents();

        setModal(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pNuevoIngrediente = new javax.swing.JPanel();
        lbNuevoIngrediente = new javax.swing.JLabel();
        lbCodigo = new java.awt.Label();
        lbPrecio = new java.awt.Label();
        lbComentarios = new java.awt.Label();
        tfCodigo = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
        tfComentarios = new javax.swing.JTextField();
        bAniadirIngrediente = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        tfPrecio = new javax.swing.JTextField();
        lbNombre2 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pNuevoIngrediente.setBackground(new java.awt.Color(255, 255, 255));

        lbNuevoIngrediente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbNuevoIngrediente.setForeground(new java.awt.Color(255, 153, 51));
        lbNuevoIngrediente.setText("Nuevo Ingrediente");

        lbCodigo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbCodigo.setText("Codigo");

        lbPrecio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbPrecio.setText("Precio");

        lbComentarios.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbComentarios.setText("Comentarios");

        tfCodigo.setBackground(new java.awt.Color(204, 204, 204));
        tfCodigo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfCodigo.setForeground(new java.awt.Color(0, 0, 0));
        tfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoActionPerformed(evt);
            }
        });

        tfNombre.setBackground(new java.awt.Color(204, 204, 204));
        tfNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfNombre.setForeground(new java.awt.Color(0, 0, 0));
        tfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreActionPerformed(evt);
            }
        });

        tfComentarios.setBackground(new java.awt.Color(204, 204, 204));
        tfComentarios.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfComentarios.setForeground(new java.awt.Color(0, 0, 0));
        tfComentarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfComentariosActionPerformed(evt);
            }
        });

        bAniadirIngrediente.setBackground(new java.awt.Color(0, 0, 0));
        bAniadirIngrediente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bAniadirIngrediente.setForeground(new java.awt.Color(255, 153, 51));
        bAniadirIngrediente.setText("Confirmar");
        bAniadirIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAniadirIngredienteActionPerformed(evt);
            }
        });

        bCancelar.setBackground(new java.awt.Color(0, 0, 0));
        bCancelar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bCancelar.setForeground(new java.awt.Color(255, 153, 51));
        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        tfPrecio.setBackground(new java.awt.Color(204, 204, 204));
        tfPrecio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tfPrecio.setForeground(new java.awt.Color(0, 0, 0));
        tfPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPrecioActionPerformed(evt);
            }
        });

        lbNombre2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbNombre2.setText("Nombre");

        javax.swing.GroupLayout pNuevoIngredienteLayout = new javax.swing.GroupLayout(pNuevoIngrediente);
        pNuevoIngrediente.setLayout(pNuevoIngredienteLayout);
        pNuevoIngredienteLayout.setHorizontalGroup(
            pNuevoIngredienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNuevoIngredienteLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(lbNuevoIngrediente))
            .addGroup(pNuevoIngredienteLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pNuevoIngredienteLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lbNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pNuevoIngredienteLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lbPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(tfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pNuevoIngredienteLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lbComentarios, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tfComentarios, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pNuevoIngredienteLayout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(bAniadirIngrediente)
                .addGap(11, 11, 11)
                .addComponent(bCancelar))
        );
        pNuevoIngredienteLayout.setVerticalGroup(
            pNuevoIngredienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNuevoIngredienteLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lbNuevoIngrediente)
                .addGap(26, 26, 26)
                .addGroup(pNuevoIngredienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pNuevoIngredienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pNuevoIngredienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pNuevoIngredienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbComentarios, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfComentarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(pNuevoIngredienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bAniadirIngrediente)
                    .addComponent(bCancelar)))
        );

        getContentPane().add(pNuevoIngrediente, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setLocation(755, 290);
    }//GEN-LAST:event_formWindowOpened

    private void tfComentariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfComentariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfComentariosActionPerformed

    private void bAniadirIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAniadirIngredienteActionPerformed

        Ingredientes_Controller ingC = new Ingredientes_Controller();
                
        try {
            
            ingC.AniadirIngrediente();
            
        } catch (Exception ex) {
            Logger.getLogger(Ventana_Aniadir_Ingrediente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        dispose();
            
            
    }//GEN-LAST:event_bAniadirIngredienteActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreActionPerformed

    private void tfPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPrecioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAniadirIngrediente;
    private javax.swing.JButton bCancelar;
    private java.awt.Label lbCodigo;
    private java.awt.Label lbComentarios;
    private java.awt.Label lbNombre2;
    private javax.swing.JLabel lbNuevoIngrediente;
    private java.awt.Label lbPrecio;
    private javax.swing.JPanel pNuevoIngrediente;
    public javax.swing.JTextField tfCodigo;
    public javax.swing.JTextField tfComentarios;
    public javax.swing.JTextField tfNombre;
    public javax.swing.JTextField tfPrecio;
    // End of variables declaration//GEN-END:variables
}