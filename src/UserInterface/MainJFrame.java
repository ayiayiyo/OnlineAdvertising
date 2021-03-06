/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Ad.AdImpression;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.ConfigureASystem;
import Business.Customer.Cookie;
import Business.Customer.Customer;
import Business.Enterprise.AdExchangeEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.ProductCompany;
import Business.Enterprise.Publisher;
import Business.Network.Network;
//import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.CustomerRole.RegisterJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private EcoSystem system;
    int i = 0;

    private DB4OUtil db = new DB4OUtil();

    public MainJFrame() {
        initComponents();
      //system = ConfigureASystem.configure();

        system = db.retrieveSystem();
        System.out.println(system);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        loginJButton = new javax.swing.JButton();
        userNameJTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginJLabel = new javax.swing.JLabel();
        logoutJButton = new javax.swing.JButton();
        RegisterCustomerJButton = new javax.swing.JButton();
        container = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginJButton.setText("Login");
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("User Name");

        jLabel2.setText("Password");

        logoutJButton.setText("Logout");
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });

        RegisterCustomerJButton.setText("Register");
        RegisterCustomerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterCustomerJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(loginJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(userNameJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(logoutJButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(passwordField)))
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(loginJLabel)))
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(RegisterCustomerJButton)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RegisterCustomerJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(loginJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logoutJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginJLabel)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        container.setLayout(new java.awt.CardLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon("/Users/vaibhavagarwal/Pictures/advertising-online.jpg")); // NOI18N
        container.add(jLabel3, "card2");

        jSplitPane1.setRightComponent(container);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed

        String userName = userNameJTextField.getText();

        char[] passwordCharArray = passwordField.getPassword();
        String password = String.valueOf(passwordCharArray);

        UserAccount userAccount = system.authenticateUser(userName, password);

        Enterprise inEnterprise = null;
        Organization inOrganization = null;
        if (userAccount == null) {
            for (Network network : system.getNetworkList()) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    userAccount = enterprise.authenticateUser(userName, password);

                    if (userAccount != null) {
                        inEnterprise = enterprise;
                     //System.out.println(inEnterprise);

                        // System.out.println(userAccount.getCustomer());
                    } else {
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            userAccount = organization.authenticateUser(userName, password);
                            if (userAccount != null) {
                                inEnterprise = enterprise;
                                inOrganization = organization;
                                break;
                            }
                        }
                    }
                    if (inOrganization != null) {
                        break;
                    } else if (inEnterprise != null) {
                        break;
                    }

                }

            }

        }
        System.out.println(inEnterprise + "Organization" + inOrganization + "useraccount" + userAccount);
        //newly added chacking condition for customers of Publishers 
        Customer cust = null;
        if (userAccount != null && inEnterprise instanceof Publisher && inOrganization == null && userAccount.getRole().getRolename().equals("User")) {
            cust = userAccount.getCustomer();

            Cookie c = new Cookie();
            //c.setNoofvisits(i);
            cust.setCookie(c);

            //System.out.println(cust.getCookie().getNoofvisits());

            for (Network network : system.getNetworkList()) {
                for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (e instanceof AdExchangeEnterprise) {   //checks for adexchange enterprise in the enterprise dir

                        AdExchangeEnterprise ae = (AdExchangeEnterprise) e;
                        for (Publisher p : ae.getPublishers()) { //once adexchange is found its list of publishers are matched with the current publisher
                            if (p.equals(inEnterprise)) {

                                p.getWinners().removeAll(p.getWinners());
                                for (AdImpression ai : p.getAdinventory().getImpressions()) {
                                    //System.out.println("Publisher's detaisl"+p.getName());
                                   
                                    p.setminimumBidamount(cust, ai);   //adimpressions of the publisher are iterated  
                                    System.out.println("Publisher's detaisl"+p.getminimumbidamount());
                                    ae.takebiddecision(cust, p.getminimumbidamount());
                                    ae.takebidfromAdvertiser(cust,p.getminimumbidamount());
                                    
                                    //ae.sendrequest(cust, p.getminimumbidamount());//sending the customer profile and the mimimum bid set by the publisher to the adexchange

                                    ae.highestbidtoPublisher(inEnterprise);
                                    ae.getBidderslist().removeAll(ae.getBidderslist());
                                    ae.getBidlist().removeAll(ae.getBidlist());
                                    
                                    

                                    /* if(ae.getBidderslist().size()==1)
                                     {
                                     Publisher pub = (Publisher)inEnterprise;
                                     pub.setHighestBidder(ae.getBidderslist().get(0));
                                     } */
//                                    if (ae.getBidderslist().isEmpty()) {
//
//                                        JOptionPane.showConfirmDialog(null, "Advertisers have too low budgets.Log in Again", "Warning", JOptionPane.YES_NO_OPTION);
//                                    }

                                }// inner for loop

                               
                                //breaks outer for loop
                            }//end of if

                        }

                    }

                }

            }
        }
    //         

        if (userAccount == null) {
            JOptionPane.showMessageDialog(null, "Invalid Credentials!");

        } else {
            CardLayout layout = (CardLayout) container.getLayout();
            container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, system));
            layout.next(container);
        }


    }//GEN-LAST:event_loginJButtonActionPerformed

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        // TODO add your handling code here:
        container.removeAll();
        userNameJTextField.setText("");
        passwordField.setText("");
        db.storeSystem(system);
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void RegisterCustomerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterCustomerJButtonActionPerformed
        // TODO add your handling code here:
        RegisterJPanel rjp = new RegisterJPanel(container, system);
        CardLayout layout = (CardLayout) container.getLayout();
        container.add("workArea", rjp);
        layout.next(container);
    }//GEN-LAST:event_RegisterCustomerJButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RegisterCustomerJButton;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton loginJButton;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables
}
