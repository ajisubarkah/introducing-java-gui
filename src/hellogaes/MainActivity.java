package hellogaes;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

public class MainActivity extends javax.swing.JFrame {

    private final Utility utils;
    private final DefaultTableModel model;

    public MainActivity() {
        initComponents();
        setLocationRelativeTo(null);
        utils = new Utility();
        model = (DefaultTableModel) tableMahasiswa.getModel();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableMahasiswa = new javax.swing.JTable();
        textFieldName = new javax.swing.JTextField();
        textFieldNPM = new javax.swing.JTextField();
        buttonAdd = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "NPM"
            }
        ));
        jScrollPane1.setViewportView(tableMahasiswa);

        buttonAdd.setText("Add Mahasiswa");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        jButton1.setText("Delete Mahasiswa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldNPM, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldNPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        FormMahasiswa mhs = new FormMahasiswa(this, "Form Mahasiswa", utils);
        if (mhs.run()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Success Added");
            refreshTable();
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Not Added");
        }
    }//GEN-LAST:event_buttonAddActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        deleteMahasiswa();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addMahasiswa() {
        utils.addMahasiswa(textFieldName.getText(), textFieldNPM.getText());
        textFieldNPM.setText("");
        textFieldName.setText("");
    }

    private void deleteMahasiswa() {
        if (tableMahasiswa.getSelectedRowCount() == 1) {
            int index = tableMahasiswa.getSelectedRow();
            utils.removeMahasiswa(index);
            refreshTable();
        } else if (tableMahasiswa.getSelectedRowCount() < 1) {
            javax.swing.JOptionPane.showMessageDialog(null, "SELECT DULU TABLENYA BANGSAT!");
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "SELECT SATU AJA TABLENYA BANGSAT!");
        }
    }

    private void refreshTable() {
        model.setRowCount(0);
        for (Mahasiswa m : utils.mhs) {
            Object row[] = {m.getName(), m.getNPM()};
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableMahasiswa;
    private javax.swing.JTextField textFieldNPM;
    private javax.swing.JTextField textFieldName;
    // End of variables declaration//GEN-END:variables

}
