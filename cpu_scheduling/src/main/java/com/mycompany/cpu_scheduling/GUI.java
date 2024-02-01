
package com.mycompany.cpu_scheduling;

import static com.mycompany.cpu_scheduling.process_management.process_temp_list;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class GUI extends javax.swing.JFrame {
 process_management process_temp;
   
    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        select_algorithm = new javax.swing.JComboBox<>();
        calculate_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Process_table = new javax.swing.JTable();
        add_button = new javax.swing.JButton();
        remove_button = new javax.swing.JButton();
        process_label = new javax.swing.JLabel();
        arival_label = new javax.swing.JLabel();
        burst_label = new javax.swing.JLabel();
        Process_name = new javax.swing.JTextField();
        Arival_time = new javax.swing.JTextField();
        burst_time = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        result_name = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label2 = new java.awt.Label();
        label1 = new java.awt.Label();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setText("jLabel1");

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 255));
        setForeground(new java.awt.Color(102, 204, 255));
        setName("main_page"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        select_algorithm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FCFS", "SJF" }));
        select_algorithm.setToolTipText("");
        select_algorithm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_algorithmActionPerformed(evt);
            }
        });
        getContentPane().add(select_algorithm, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 79, -1));

        calculate_button.setText("Calculate");
        calculate_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculate_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(calculate_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, -1, -1));

        Process_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process Name", "Arival Time", "Burst Time"
            }
        ));
        Process_table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(Process_table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 470, 240));

        add_button.setText("Add");
        add_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_buttonMouseClicked(evt);
            }
        });
        add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(add_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 150, -1));

        remove_button.setText("Remove");
        remove_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(remove_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 220, 166, -1));

        process_label.setText("Process Name:");
        getContentPane().add(process_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 90, -1));

        arival_label.setText("Arival Time:");
        getContentPane().add(arival_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 80, -1));

        burst_label.setText("Burst Time:");
        getContentPane().add(burst_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 110, 80, -1));

        Process_name.setToolTipText("");
        getContentPane().add(Process_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 90, -1));
        getContentPane().add(Arival_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 110, 20));

        burst_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                burst_timeActionPerformed(evt);
            }
        });
        getContentPane().add(burst_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 110, 120, -1));

        jPanel1.setForeground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addGap(185, 185, 185)
                .addComponent(result_name, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(result_name, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 940, -1));

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setBackground(java.awt.Color.white);
        label2.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 51, 51));
        label2.setText("CPU SCHEDULING");
        getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 590, -1));

        label1.setText("RESULT");
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void select_algorithmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_algorithmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select_algorithmActionPerformed

    private void burst_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_burst_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_burst_timeActionPerformed

    private void add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_buttonActionPerformed
       
        if(Process_name.getText().equals("") || Arival_time.getText().equals("") ||  burst_time.getText().equals("") ){
            JOptionPane.showMessageDialog(this,"Cannot be empty !","Error mesagge",JOptionPane.ERROR_MESSAGE);
        }
        else{
           DefaultTableModel model=(DefaultTableModel) Process_table.getModel();
           process_temp=new process_management(Process_name.getText(),Integer.parseInt(Arival_time.getText()),Integer.parseInt(burst_time.getText()));
           process_temp.addRowToTable(process_temp,model);
         Process_name.setText("");
        Arival_time.setText("");
       
        burst_time.setText("");
        }
        
    }//GEN-LAST:event_add_buttonActionPerformed

    private void add_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_buttonMouseClicked
      
    }//GEN-LAST:event_add_buttonMouseClicked

    private void remove_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_buttonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel delete_model=(DefaultTableModel) Process_table.getModel();
        if(Process_table.getSelectedRow()==1){
            if(Process_table.getSelectedRow()!=-1){
                process_temp_list.remove(Process_table.getSelectedRow());
            }
            delete_model.removeRow(Process_table.getSelectedRow());
            System.out.println(Process_table.getSelectedRow());
        }
        else{
           if(Process_table.getRowCount()==0){
               JOptionPane.showMessageDialog(this,"Process table is empty !","Error",JOptionPane.WARNING_MESSAGE);
           }else{
               JOptionPane.showMessageDialog(this,"Please select single row for delete.","Error",JOptionPane.WARNING_MESSAGE);
           } 
        }
        
    }//GEN-LAST:event_remove_buttonActionPerformed

    private void calculate_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculate_buttonActionPerformed
      
        
        if(select_algorithm.getSelectedItem().toString().equals("FCFS")){
           result_name.setText(process_temp.fcfs_sort()); 
        }
        if(select_algorithm.getSelectedItem().toString().equals("SJF")){
           result_name.setText(process_temp.sjf_sort()); 
        }
        
   
    }//GEN-LAST:event_calculate_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Arival_time;
    private javax.swing.JTextField Process_name;
    private javax.swing.JTable Process_table;
    private javax.swing.JButton add_button;
    private javax.swing.JLabel arival_label;
    private javax.swing.JLabel burst_label;
    private javax.swing.JTextField burst_time;
    private javax.swing.JButton calculate_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JLabel process_label;
    private javax.swing.JButton remove_button;
    private javax.swing.JLabel result_name;
    private javax.swing.JComboBox<String> select_algorithm;
    // End of variables declaration//GEN-END:variables

}