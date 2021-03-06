/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ProductCompanyFinanceManager;

import Business.Finance.Order;
import Business.Organization.Organization;
import java.awt.CardLayout;
import Business.Organization.FinanceOrganization;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vaibhavagarwal
 */
public class ViewOrdersJPanel extends javax.swing.JPanel {
  private JPanel container;
  private FinanceOrganization organization;
    /**
     * Creates new form ViewOrdersJPanel
     */
    public ViewOrdersJPanel(JPanel container,FinanceOrganization organization) {
        initComponents();
        this.container=container;
        this.organization=organization;
        poptable();
    }

    public void poptable()
    {
        DefaultTableModel model = (DefaultTableModel)OrderJtable.getModel();
        
        model.setRowCount(0);
        
        for (Order o : organization.getListoforders()){
            Object[] row = new Object[4];
            row[0] = o.getOis().get(0).getProduct().getName();
            row[1] = o.getOis().get(0).getAdimp().getWidth();
            row[2]=o.getOis().get(0).getAdimp().getHeight();
            row[3]=o.getOis().get(0).getAdimp().getImpressionno();
            
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
        OrderJtable = new javax.swing.JTable();
        BackJbutton = new javax.swing.JButton();
        ViewJbutton = new javax.swing.JButton();

        OrderJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Advertisement for Product", "AdImpression Width", "AdImpression Height", "AdImpression Position"
            }
        ));
        jScrollPane1.setViewportView(OrderJtable);

        BackJbutton.setText("Back");
        BackJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackJbuttonActionPerformed(evt);
            }
        });

        ViewJbutton.setText("View");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(29, 29, 29)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(ViewJbutton)
                        .add(137, 137, 137)
                        .add(BackJbutton)
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 883, Short.MAX_VALUE)
                        .add(125, 125, 125))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(72, 72, 72)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 152, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 97, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(ViewJbutton)
                    .add(BackJbutton))
                .add(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackJbuttonActionPerformed
        // TODO add your handling code here:

        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_BackJbuttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackJbutton;
    private javax.swing.JTable OrderJtable;
    private javax.swing.JButton ViewJbutton;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
