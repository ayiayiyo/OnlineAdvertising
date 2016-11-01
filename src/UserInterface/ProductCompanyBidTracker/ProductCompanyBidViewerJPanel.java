/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ProductCompanyBidTracker;

import Business.Enterprise.Enterprise;
import Business.Enterprise.ProductCompany;
import javax.swing.JPanel;

/**
 *
 * @author vaibhavagarwal
 */
public class ProductCompanyBidViewerJPanel extends javax.swing.JPanel {
private JPanel container;
   private ProductCompany prodcomp;
    /**
     * Creates new form ProductCompanyBidViewerJPanel
     */
    public ProductCompanyBidViewerJPanel(JPanel container,Enterprise enterprise) {
        initComponents();
        this.container=container;
        this.prodcomp=(ProductCompany)enterprise;
        ClosingBidJTextfield.setText(String.valueOf(prodcomp.getBid().getBidvalue()));
        WinningStatusJTextfield.setText(prodcomp.getBidstatus());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ClosingBidJTextfield = new javax.swing.JTextField();
        WinningStatusJTextfield = new javax.swing.JTextField();

        jLabel1.setText("Closing Bid");

        jLabel2.setText("Winning Status");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(103, 103, 103)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(layout.createSequentialGroup()
                        .add(jLabel1)
                        .add(106, 106, 106)
                        .add(ClosingBidJTextfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 92, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(jLabel2)
                        .add(83, 83, 83)
                        .add(WinningStatusJTextfield)))
                .addContainerGap(273, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(59, 59, 59)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(ClosingBidJTextfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(59, 59, 59)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(WinningStatusJTextfield, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2))
                .addContainerGap(232, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ClosingBidJTextfield;
    private javax.swing.JTextField WinningStatusJTextfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}