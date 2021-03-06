/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.open2jam.gui.parts;

import org.open2jam.Config;
import org.open2jam.GameOptions;

/**
 *
 * @author Thai Pangsakulyanont
 */
public class AdvancedOptions extends javax.swing.JPanel {

    /**
     * Creates new form AdvancedSettings
     */
    public AdvancedOptions() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        go = Config.getGameOptions()
        ;
        hasteModeCheckbox = new javax.swing.JCheckBox();
        bufferSize = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();

        hasteModeCheckbox.setText("Haste Mode");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, go, org.jdesktop.beansbinding.ELProperty.create("${hasteMode}"), hasteModeCheckbox, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        hasteModeCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasteModeCheckboxActionPerformed(evt);
            }
        });

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, go, org.jdesktop.beansbinding.ELProperty.create("${bufferSize}"), bufferSize, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        bufferSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bufferSizeActionPerformed(evt);
            }
        });

        jLabel1.setText("Buffer Size");

        jCheckBox1.setText("Normalize Speed");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, go, org.jdesktop.beansbinding.ELProperty.create("${hasteModeNormalizeSpeed}"), jCheckBox1, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, go, org.jdesktop.beansbinding.ELProperty.create("${hasteMode}"), jCheckBox1, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(47, 47, 47)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(hasteModeCheckbox)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jCheckBox1))
                    .add(layout.createSequentialGroup()
                        .add(bufferSize, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 56, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel1)))
                .addContainerGap(330, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(29, 29, 29)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(hasteModeCheckbox)
                    .add(jCheckBox1))
                .add(26, 26, 26)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(bufferSize, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1))
                .addContainerGap(296, Short.MAX_VALUE))
        );

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void hasteModeCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasteModeCheckboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasteModeCheckboxActionPerformed

    private void bufferSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bufferSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bufferSizeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bufferSize;
    private org.open2jam.GameOptions go;
    private javax.swing.JCheckBox hasteModeCheckbox;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
