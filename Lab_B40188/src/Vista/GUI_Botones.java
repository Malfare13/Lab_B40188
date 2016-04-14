/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorAutomovil;

/**
 *
 * @author Angelica
 */
public class GUI_Botones extends javax.swing.JPanel {

    /**
     * Creates new form GUI_Botones
     */
    
    ControladorAutomovil controlador;
    
    public GUI_Botones() {
        initComponents();
        
    }
    
    
    public void agregarEventos(ControladorAutomovil controlador){
        this.controlador=controlador;
        this.btn_Agregar.addActionListener(controlador);
        this.btn_Modificar.addActionListener(controlador);
        this.btn_Eliminar.addActionListener(controlador);
    }
    
    public void estadoInicial(){
        btn_Agregar.setEnabled(false);
        btn_Modificar.setEnabled(false);
        btn_Eliminar.setEnabled(false);
    }
    
    public void habilitarAgregar(){
        btn_Modificar.setEnabled(false);
        btn_Eliminar.setEnabled(false);
        btn_Agregar.setEnabled(true);
    }
    
    public void habilitarModificarYEliminar(){
        btn_Agregar.setEnabled(false);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Eliminar = new javax.swing.JButton();
        btn_Modificar = new javax.swing.JButton();
        btn_Agregar = new javax.swing.JButton();

        btn_Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ELIMINAR (2).png"))); // NOI18N
        btn_Eliminar.setActionCommand("Eliminar");
        btn_Eliminar.setContentAreaFilled(false);

        btn_Modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MODIFICAR.png"))); // NOI18N
        btn_Modificar.setActionCommand("Modificar");
        btn_Modificar.setContentAreaFilled(false);

        btn_Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AGREGAR.png"))); // NOI18N
        btn_Agregar.setActionCommand("Agregar");
        btn_Agregar.setContentAreaFilled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(btn_Agregar)
                .addGap(55, 55, 55)
                .addComponent(btn_Modificar)
                .addGap(72, 72, 72)
                .addComponent(btn_Eliminar)
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Modificar)
                    .addComponent(btn_Agregar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Eliminar)
                        .addGap(14, 14, 14)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Modificar;
    // End of variables declaration//GEN-END:variables
}
