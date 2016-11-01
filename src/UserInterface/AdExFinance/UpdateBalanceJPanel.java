/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdExFinance;

import Business.Enterprise.AdExchangeEnterprise;
import Business.Enterprise.ProductCompany;
import Business.Finance.FinancialAccount;
import Business.Organization.FinanceOrganization;
import Business.Organization.Organization;
import Business.WorkQueue.PaymentTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.Organization.AdexchangeFinanceOrganization;

/**
 *
 * @author vaibhavagarwal
 */
public class UpdateBalanceJPanel extends javax.swing.JPanel {
 private JPanel container;
 private AdexchangeFinanceOrganization  organization;
 private AdExchangeEnterprise adex;
 private Organization prodcompfinorg;
    /**
     * Creates new form UpdateBalanceJPanel
     */
    public UpdateBalanceJPanel(JPanel container,Organization organization,AdExchangeEnterprise adex) {
        initComponents();
        this.container=container;
        this.organization=(AdexchangeFinanceOrganization)organization;
        this.adex=adex;
        popcombobox();
        
                
    }
    public void popcombobox()
    {
        ProdcompJComboBox.removeAllItems();
        for(ProductCompany pc:adex.getProductcompanies())
            ProdcompJComboBox.addItem(pc);
    }
    
    public void poptable(Organization p)
    {
        DefaultTableModel model = (DefaultTableModel)RequestsJTable.getModel();
        
        model.setRowCount(0);
        
        for (WorkRequest payment : p.getWorkQueue().getWorkRequestList()){
            PaymentTestWorkRequest pay=(PaymentTestWorkRequest)payment;
            Object[] row = new Object[5];
            row[0] = pay.getSender();
            row[1] = pay.getReceiver();
            row[2] = pay.getMessage();
            row[3]=pay.getAmt();
            row[4]=pay.getStatus();
            
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        RequestsJTable = new javax.swing.JTable();
        ProcessJbutton = new javax.swing.JButton();
        ProdcompJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        ViewJbutton = new javax.swing.JButton();
        backJButton2 = new javax.swing.JButton();

        RequestsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Sender", "Reciever", "Message", "Amount paid", "Result Status"
            }
        ));
        jScrollPane1.setViewportView(RequestsJTable);

        ProcessJbutton.setText("Process");
        ProcessJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcessJbuttonActionPerformed(evt);
            }
        });

        ProdcompJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Choose Product Company");

        ViewJbutton.setText("View");
        ViewJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewJbuttonActionPerformed(evt);
            }
        });

        backJButton2.setText("<< Back");
        backJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton2ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(210, 210, 210)
                        .add(jLabel1)
                        .add(35, 35, 35)
                        .add(ProdcompJComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(62, 62, 62)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 676, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createSequentialGroup()
                                .add(ProcessJbutton)
                                .add(53, 53, 53)
                                .add(ViewJbutton)
                                .add(101, 101, 101)
                                .add(backJButton2)))))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(ProdcompJComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1))
                .add(18, 18, 18)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 236, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(65, 65, 65)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(ProcessJbutton)
                    .add(ViewJbutton)
                    .add(backJButton2))
                .add(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ViewJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewJbuttonActionPerformed
        // TODO add your handling code here:
        ProductCompany pc=(ProductCompany)ProdcompJComboBox.getSelectedItem();
        for(Organization org:pc.getOrganizationDirectory().getOrganizationList())
        {
            if (org instanceof FinanceOrganization)
               prodcompfinorg=org; 
        }
        //organization.getWorkQueue().getWorkRequestList().add(prodcompfinorg.getWorkQueue().getWorkRequestList().get(0));
        poptable(prodcompfinorg);
    }//GEN-LAST:event_ViewJbuttonActionPerformed

    private void ProcessJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcessJbuttonActionPerformed
        // TODO add your handling code here:
        int selectedRow = RequestsJTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        FinanceOrganization org = (FinanceOrganization)RequestsJTable.getValueAt(selectedRow, 0);
       PaymentTestWorkRequest pay2=(PaymentTestWorkRequest)org.getWorkQueue().getWorkRequestList().get(0);
        pay2.setReceiver(organization);
        
        
        
        FinancialAccount fa=new FinancialAccount();
        fa.setCreditamt(pay2.getAmt());
        fa.setDebitamt((90/100)*pay2.getAmt());
        fa.calcAmount();
        adex.setFa(fa);
        pay2.setStatus("Approved");
        organization.getWorkQueue().getWorkRequestList().add(pay2);
        poptable(organization);
        
        /*populateTable();
         ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer, request);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);*/
    }//GEN-LAST:event_ProcessJbuttonActionPerformed

    private void backJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton2ActionPerformed

        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backJButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ProcessJbutton;
    private javax.swing.JComboBox ProdcompJComboBox;
    private javax.swing.JTable RequestsJTable;
    private javax.swing.JButton ViewJbutton;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton backJButton1;
    private javax.swing.JButton backJButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}