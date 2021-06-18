/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jazz;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DEll
 */
public class UpdatePackage extends javax.swing.JFrame {

    int index = -1;
    
    /**
     * Creates new form UpdatePackage
     */
    public UpdatePackage() {
        initComponents();
        SetTable();
        if(JazzWorld.worldInstance().getPack().size()>0)
            addDatatoRow();
        else
            JOptionPane.showMessageDialog(this, "No Data to display","Null data",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void SetTable()
    {
        jScrollPane1.setBackground(new Color(0,0,0,0));
        jScrollPane1.setOpaque(false);
        jTable1.setOpaque(false);
        ((DefaultTableCellRenderer)jTable1.getDefaultRenderer(Object.class)).setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
    }
    
    public void addDatatoRow()
    {
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        Object rowData[] = new Object[4];
        model.setRowCount(0);
        for(int i=0;i<JazzWorld.worldInstance().getPack().size();i++)
        {
            rowData[0]=i+1;
            rowData[1]=JazzWorld.worldInstance().getPack().get(i).getID();
            rowData[2]=JazzWorld.worldInstance().getPack().get(i).getName();
            rowData[3]=JazzWorld.worldInstance().getPack().get(i).getCode();
            model.addRow(rowData);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idText = new javax.swing.JTextField();
        checkButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        codeText = new javax.swing.JTextField();
        mbText = new javax.swing.JTextField();
        minutesText = new javax.swing.JTextField();
        smsText = new javax.swing.JTextField();
        priceText = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Packages");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jazz/jazzbgd.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 72)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(251, 255, 0));
        jLabel2.setText("Management System");

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jTable1.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 204, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sr No.", "ID", "Name", "Code"
            }
        ));
        jTable1.setEnabled(false);
        jTable1.setSelectionBackground(new java.awt.Color(51, 153, 255));
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(248, 1, 1));
        jLabel3.setText("UPDATE PACKAGE");

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(251, 255, 0));
        jLabel4.setText("Details");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 26)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("ID :");

        idText.setBackground(new java.awt.Color(0, 0, 0));
        idText.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        idText.setForeground(new java.awt.Color(204, 204, 204));
        idText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));

        checkButton.setBackground(new java.awt.Color(0, 0, 0));
        checkButton.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        checkButton.setForeground(new java.awt.Color(255, 255, 255));
        checkButton.setText("Search");
        checkButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(251, 255, 0), 2));
        checkButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(idText)
                    .addComponent(checkButton, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(11, 11, 11)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(251, 255, 0));
        jLabel6.setText("Name :");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(251, 255, 0));
        jLabel7.setText("Code :");

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(251, 255, 0));
        jLabel8.setText("MBs :");

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(251, 255, 0));
        jLabel9.setText("Minutes :");

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(251, 255, 0));
        jLabel10.setText("SMS :");

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(251, 255, 0));
        jLabel11.setText("Price :");

        nameText.setBackground(new java.awt.Color(0, 0, 0));
        nameText.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        nameText.setForeground(new java.awt.Color(204, 204, 204));
        nameText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));

        codeText.setBackground(new java.awt.Color(0, 0, 0));
        codeText.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        codeText.setForeground(new java.awt.Color(204, 204, 204));
        codeText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));

        mbText.setBackground(new java.awt.Color(0, 0, 0));
        mbText.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        mbText.setForeground(new java.awt.Color(204, 204, 204));
        mbText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));

        minutesText.setBackground(new java.awt.Color(0, 0, 0));
        minutesText.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        minutesText.setForeground(new java.awt.Color(204, 204, 204));
        minutesText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));

        smsText.setBackground(new java.awt.Color(0, 0, 0));
        smsText.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        smsText.setForeground(new java.awt.Color(204, 204, 204));
        smsText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));

        priceText.setBackground(new java.awt.Color(0, 0, 0));
        priceText.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        priceText.setForeground(new java.awt.Color(255, 204, 0));
        priceText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        priceText.setEnabled(false);

        updateButton.setBackground(new java.awt.Color(0, 0, 204));
        updateButton.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(251, 255, 0), 3));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(204, 0, 0));
        cancelButton.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancel");
        cancelButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(251, 255, 0), 3));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(codeText, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mbText, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(minutesText, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(smsText, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
                        .addGap(273, 273, 273))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(codeText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(mbText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(minutesText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(smsText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        WorldAdminMenu menu=new WorldAdminMenu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed
        // TODO add your handling code here:
        String id=idText.getText();
        if(id.equals("") || id.equals(null))
            JOptionPane.showMessageDialog(this,"The Input is Empty","Null Input",JOptionPane.ERROR_MESSAGE);
        else
        {
            for(int i =0;i<JazzWorld.worldInstance().getPack().size();i++)
            {
                if(JazzWorld.worldInstance().getPack().get(i).getID().equals(id))
                {
                    index=i;
                    nameText.setText(JazzWorld.worldInstance().getPack().get(i).getName());
                    codeText.setText(JazzWorld.worldInstance().getPack().get(i).getCode());
                    mbText.setText(JazzWorld.worldInstance().getPack().get(i).getMbs()+"");
                    minutesText.setText(JazzWorld.worldInstance().getPack().get(i).getMinutes()+"");
                    smsText.setText(JazzWorld.worldInstance().getPack().get(i).getMessages()+"");
                    if(JazzWorld.worldInstance().getPack().get(i).getValidity()==1)
                        priceText.setText(30+"");
                    else if(JazzWorld.worldInstance().getPack().get(i).getValidity()==7)
                        priceText.setText(200+"");
                    else if(JazzWorld.worldInstance().getPack().get(i).getValidity()==30)
                        priceText.setText(620+"");
                    break;
                }
            }
            if(index==-1)
                JOptionPane.showMessageDialog(this,"The ID not found","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_checkButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        if(index==-1)
            JOptionPane.showMessageDialog(this,"The ID input is Empty\nYou need to first search the ID","Null Input",JOptionPane.ERROR_MESSAGE);
        else
        {
            String name=nameText.getText();
            String code=codeText.getText();
            String mb=mbText.getText();
            String minutes=minutesText.getText();
            String sms=smsText.getText();
            String str = "";
            boolean flag=false;
            
           
            if( sms.equals("") || sms.equals(null))
            {
//                pack.setValidity(JazzWorld.worldInstance().getPack().get(index).getValidity());
                 Packages pack= new Packages(JazzWorld.worldInstance().getPack().get(index).getMessages(),JazzWorld.worldInstance().getPack().get(index).getValidity());
            }
            else
            {
                Packages pack= new Packages(Integer.parseInt(minutes),JazzWorld.worldInstance().getPack().get(index).getValidity());
            
                if( name.equals("") || name.equals(null))
                    pack.setName(JazzWorld.worldInstance().getPack().get(index).getName());
                else
                {
                    flag=pack.setName(name);
                    if(!flag)
                        str+="Name\n";
                }
                if( code.equals("") || code.equals(null))
                    pack.setCode(JazzWorld.worldInstance().getPack().get(index).getCode());
                else
                {
                    flag=pack.setCode(code);
                    if(!flag)
                        str+="Code\n";
                }
                if( mb.equals("") || mb.equals(null))
                    pack.setMbs(JazzWorld.worldInstance().getPack().get(index).getMbs());
                else
                {
                    flag=pack.setMbs(Integer.parseInt(mb));
                    if(!flag)
                        str+="MBs\n";
                }
                if( minutes.equals("") || minutes.equals(null))
                    pack.setMinutes(JazzWorld.worldInstance().getPack().get(index).getMinutes());
                else
                {
                    flag=pack.setMinutes(Integer.parseInt(minutes));
                    if(!flag)
                        str+="Minutes\n";
                }


                if(str.equals("") || str.equals(null))
                {
                    pack.setID(JazzWorld.worldInstance().getPack().get(index).getID());
                    pack.setSubscribers(JazzWorld.worldInstance().getPack().get(index).getSubscribers());
                    
                    JazzWorld.worldInstance().getPack().set(index, pack);
                    JOptionPane.showMessageDialog(this,"Data has been Updated","Updation completed", JOptionPane.INFORMATION_MESSAGE);
                    JazzWorld.worldInstance().writePackData();
                    WorldAdminMenu menu=new WorldAdminMenu();
                    menu.setVisible(true);
                    this.dispose();
                }
                else
                    JOptionPane.showMessageDialog(this,"The following Data is incorrect\n"+str,"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        
        
    }//GEN-LAST:event_updateButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UpdatePackage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdatePackage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdatePackage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdatePackage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdatePackage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton checkButton;
    private javax.swing.JTextField codeText;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField mbText;
    private javax.swing.JTextField minutesText;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField priceText;
    private javax.swing.JTextField smsText;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
