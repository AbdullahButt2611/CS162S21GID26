/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jazz;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author DEll
 */
public class PayBills extends javax.swing.JFrame {

    int index = -1;
    String type="";
    int amount =-1;
    int pin = -1;
    
    /**
     * Creates new form PayBills
     */
    public PayBills() {
        initComponents();
    }
    
    public PayBills(int index) {
        initComponents();
        this.index = index;
    }
    
    public void writeData()
    {
        try
        {
            FileWriter fr = new FileWriter("Bills.txt",true);
            BufferedWriter br = new BufferedWriter(fr);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
            Date date = new Date(); 
            String dat=formatter.format(date);
            br.write(RegisteredAccounts.getUsersInstance().getUsers().get(index).getUsername()+","+RegisteredAccounts.getUsersInstance().getUsers().get(index).getContact()+","+this.type+","+this.amount+","+this.pin+"\n");
            br.flush();
            br.close();
            fr.close();
        }
        catch(Exception ex)
        {
            System.out.println("Null Exception");
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        billBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        amountText = new javax.swing.JTextField();
        invalidAmount = new javax.swing.JLabel();
        pinText = new javax.swing.JTextField();
        invalidPin = new javax.swing.JLabel();
        passText = new javax.swing.JPasswordField();
        showCheck = new javax.swing.JCheckBox();
        cancelButton = new javax.swing.JButton();
        payButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bill Payment");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jazz/jazzbgd.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 72)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(251, 255, 0));
        jLabel4.setText("Management System");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("BILL PAYMENTS");

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(251, 255, 0));
        jLabel1.setText("Type :");

        billBox.setBackground(new java.awt.Color(153, 153, 153));
        billBox.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        billBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gas", "Electricity", "Water", "PTCL" }));
        billBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 1, true));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(251, 255, 0));
        jLabel2.setText("Amount :");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(251, 255, 0));
        jLabel6.setText("Enter the Pin :");

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(251, 255, 0));
        jLabel7.setText("TPN/Code :");

        amountText.setBackground(new java.awt.Color(153, 153, 153));
        amountText.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        amountText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));

        invalidAmount.setBackground(new java.awt.Color(0, 0, 0));
        invalidAmount.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        invalidAmount.setForeground(new java.awt.Color(204, 204, 204));

        pinText.setBackground(new java.awt.Color(153, 153, 153));
        pinText.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        pinText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));

        invalidPin.setBackground(new java.awt.Color(0, 0, 0));
        invalidPin.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        invalidPin.setForeground(new java.awt.Color(204, 204, 204));

        passText.setBackground(new java.awt.Color(153, 153, 153));
        passText.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        passText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));

        showCheck.setBackground(new java.awt.Color(0, 0, 0));
        showCheck.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        showCheck.setForeground(new java.awt.Color(204, 204, 204));
        showCheck.setText("Show TPN/Code");

        cancelButton.setBackground(new java.awt.Color(204, 0, 0));
        cancelButton.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancel");
        cancelButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(251, 255, 0), 3));
        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        payButton1.setBackground(new java.awt.Color(0, 0, 153));
        payButton1.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        payButton1.setForeground(new java.awt.Color(255, 255, 255));
        payButton1.setText("Pay");
        payButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(251, 255, 0), 3));
        payButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        payButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE)
                        .addGap(22, 22, 22))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(showCheck, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                            .addComponent(invalidPin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(invalidAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(billBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(amountText)
                            .addComponent(pinText)
                            .addComponent(passText)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(627, Short.MAX_VALUE)
                    .addComponent(payButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(132, 132, 132)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(billBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(amountText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(invalidAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(pinText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(invalidPin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(passText)
                        .addGap(5, 5, 5)))
                .addComponent(showCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(540, 540, 540)
                    .addComponent(payButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addGap(21, 21, 21)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        CustomerCashMenu menu=new CustomerCashMenu(index);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void payButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payButton1ActionPerformed
        // TODO add your handling code here:
//        CustomerCashMenu menu=new CustomerCashMenu(index);
//        menu.setVisible(true);
//        this.dispose();
        String type = billBox.getSelectedItem().toString();
        this.type=type;
        String amount = amountText.getText();
        String pin = pinText.getText();
        String code = passText.getText();
        if(amount.equals("") || amount.equals(null) || pin.equals("") ||pin.equals(null) || code.equals(null) || code.equals(""))
        {
            JOptionPane.showMessageDialog(this,"Input fields are empty","Empty Inputs",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            boolean flag=false;
            for(int i=0;i<amount.length();i++)
            {
                if(amount.charAt(i)>='0' && amount.charAt(i)<='9')
                {
                    flag= true;
                }
                else
                {
                    flag=false;
                    break;
                }
            }
            if(flag==false)
                JOptionPane.showMessageDialog(this,"Amount should be in Digits","Digits Exceptions",JOptionPane.ERROR_MESSAGE);
            else
            {
                int am=Integer.parseInt(amount);
                if(JazzCash.cashInstance().getCredit().get(index).isMoneyAvaialbe(am))
                {
                    flag=false;
                    this.amount=am;
                    if(pin.length()==9)
                    {
                        for(int i=0;i<9;i++)
                        {
                            if(pin.charAt(i)>='0' && pin.charAt(i)<='9')
                                flag=true;
                            else
                            {
                                flag=false;
                                break;
                            }
                        }
                        if(!flag)
                            JOptionPane.showMessageDialog(this,"Pin should be in Digits","Digits Exceptions",JOptionPane.ERROR_MESSAGE);
                        else
                        {
                            int pn= Integer.parseInt(pin);
                            this.pin=pn;
                            int tpn=Integer.parseInt(code);
                            if(RegisteredAccounts.getUsersInstance().getUsers().get(index).getTPN()==tpn)
                            {
                                JazzCash.cashInstance().getCredit().get(index).retrieveAmount(am);
                                JOptionPane.showMessageDialog(this,"Bill Paid Successfully","Congratulations",JOptionPane.INFORMATION_MESSAGE);
                                writeData();
                                JazzCash.cashInstance().writeCreditData();
                                CustomerCashMenu menu=new CustomerCashMenu(index);
                                menu.setVisible(true);
                                this.dispose();
                            }
                            else
                                JOptionPane.showMessageDialog(this,"Incorrect Password","TPN Exception",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else
                        JOptionPane.showMessageDialog(this,"Pin length should be 9 digits","Digits Exceptions",JOptionPane.ERROR_MESSAGE);
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"Your wallet does not have enough credit","Credit Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_payButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PayBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PayBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PayBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PayBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PayBills().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountText;
    private javax.swing.JComboBox<String> billBox;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel invalidAmount;
    private javax.swing.JLabel invalidPin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passText;
    private javax.swing.JButton payButton1;
    private javax.swing.JTextField pinText;
    private javax.swing.JCheckBox showCheck;
    // End of variables declaration//GEN-END:variables
}
