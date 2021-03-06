/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UsainSprintPages.Manager;

import Controller.Manager.CreateCouponCodeController;
import Controller.Manager.DeleteCouponController;
import Controller.Manager.ModifyCouponCodeController;
import Controller.Manager.ViewCouponCodeController;
import UsainSprintPages.UserAdmin.LoginPage;
import java.awt.Dimension;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.Coupon;

/**
 *
 * @author Eechang
 */
public class ManagerManageCouponPage extends javax.swing.JFrame {
    
    private static final int JF_W=1353;
    private  static final int JF_H =710;
    public Dimension getPreferredSize()
    {
        return new Dimension(JF_W, JF_H);
    }
    public String datePattern = "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{2}$";
    
    /**
     * Creates new form ManagerManageCouponPage
     */
    public ManagerManageCouponPage() {
        initComponents();  
       btnCreate.setEnabled(false);
        btnModify.setEnabled(false);
        btnClear.setEnabled(true);
        btnDelete.setEnabled(false);
        btnCoupon.setEnabled(false);
        lblName.setVisible(false);
        StartDate.setMinSelectableDate(new Date());
        EndDate.setMinSelectableDate(new Date()); 
    }
    
    public ManagerManageCouponPage(String name) {
        initComponents();
        TNames.setText(name);
        btnCreate.setEnabled(false);
        btnModify.setEnabled(false);
        btnClear.setEnabled(true);
        btnDelete.setEnabled(false);
        
    }

    public void validateFields() {
        String couponName = txtCouponName.getText();
        String couponDiscount = txtCouponDiscount.getText();
        String startDate = StartDate.getDateFormatString();
        String endDate = EndDate.getDateFormatString();
       
        if (!couponName.equals("") && !couponDiscount.equals("") && !startDate.equals("") && !endDate.equals("")) {
            //checkDate();
            btnCreate.setEnabled(true);
        } else {
            btnCreate.setEnabled(false);
        }
//        if (!couponName.equals("") && !couponDiscount.equals("") && !startDate.equals("") && !endDate.equals("")) {
//            //checkDate();
//            btnModify.setEnabled(true);
//        } else {
//            btnModify.setEnabled(false);
//        }
        if (!couponName.equals("") && !couponDiscount.equals("") && !startDate.equals("") && !endDate.equals("")) {
            btnDelete.setEnabled(true);
        } else {
            btnDelete.setEnabled(false);
        }
        
    }

    public void clear() {
        txtCouponName.setText("");
        txtCouponDiscount.setText("");
        lblCouponId.setText("");
        StartDate.setDate(new Date());
        EndDate.setDate(new Date());
        btnModify.setEnabled(false);
        btnCreate.setEnabled(false);
        btnDelete.setEnabled(false);
    }
    
    public void checkDate()
    {
        
        Date s =StartDate.getDate();
        Date e = EndDate.getDate();
        long l= e.getTime() - s.getTime();
        int days = (int)l/(1000*60*60*24);
        if(days<0)
        {
         btnModify.setEnabled(false);
         btnCreate.setEnabled(false);
         btnDelete.setEnabled(false);
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
        btnCoupon = new javax.swing.JButton();
        btnFoodItem = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        TNames = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtSearchCouponName = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblCouponId = new javax.swing.JLabel();
        txtCouponName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCouponDiscount = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        StartDate = new com.toedter.calendar.JDateChooser();
        EndDate = new com.toedter.calendar.JDateChooser();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1353, 710));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 31, 125));
        jPanel1.setPreferredSize(new java.awt.Dimension(260, 710));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCoupon.setBackground(new java.awt.Color(44, 115, 210));
        btnCoupon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCoupon.setForeground(new java.awt.Color(255, 255, 255));
        btnCoupon.setText("Coupon");
        btnCoupon.setBorder(null);
        btnCoupon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(btnCoupon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 200, 45));

        btnFoodItem.setBackground(new java.awt.Color(0, 31, 125));
        btnFoodItem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFoodItem.setForeground(new java.awt.Color(255, 255, 255));
        btnFoodItem.setText("Food Item");
        btnFoodItem.setBorder(null);
        btnFoodItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoodItemActionPerformed(evt);
            }
        });
        jPanel1.add(btnFoodItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 200, 45));

        btnLogout.setBackground(new java.awt.Color(0, 31, 125));
        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Log out");
        btnLogout.setBorder(null);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 200, 45));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 180, 10));

        jLabel9.setFont(new java.awt.Font("YuMincho +36p Kana", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Hello");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 60, 40));

        TNames.setFont(new java.awt.Font("YuMincho +36p Kana", 1, 18)); // NOI18N
        TNames.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(TNames, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 90, 40));

        jLabel19.setFont(new java.awt.Font("Academy Engraved LET", 1, 30)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 153, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Usain Sprint");
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 200, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 710));

        jPanel2.setBackground(new java.awt.Color(0, 137, 186));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/search.png"))); // NOI18N
        jLabel7.setText("Search :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, 30));

        txtSearchCouponName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchCouponNameActionPerformed(evt);
            }
        });
        txtSearchCouponName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchCouponNameKeyReleased(evt);
            }
        });
        jPanel2.add(txtSearchCouponName, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 230, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1160, 100));

        jPanel3.setBackground(new java.awt.Color(0, 142, 155));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Coupon ID :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, 30));

        lblCouponId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCouponId.setForeground(new java.awt.Color(255, 255, 255));
        lblCouponId.setText("00");
        jPanel3.add(lblCouponId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 30, 30));

        txtCouponName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCouponName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCouponNameActionPerformed(evt);
            }
        });
        txtCouponName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCouponNameKeyReleased(evt);
            }
        });
        jPanel3.add(txtCouponName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 150, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Coupon Name :");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Coupon Discount :");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, 40));

        txtCouponDiscount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCouponDiscount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCouponDiscountKeyReleased(evt);
            }
        });
        jPanel3.add(txtCouponDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 150, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Start Date ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("End Date ");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, -1, 30));

        StartDate.setDateFormatString("yyyy-MM-dd");
        StartDate.setMaxSelectableDate(new java.util.Date(253370739686000L));
        StartDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                StartDatePropertyChange(evt);
            }
        });
        jPanel3.add(StartDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 130, 30));

        EndDate.setDateFormatString("yyyy-MM-dd");
        EndDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                EndDatePropertyChange(evt);
            }
        });
        jPanel3.add(EndDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 130, 30));

        btnModify.setBackground(new java.awt.Color(0, 143, 122));
        btnModify.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnModify.setForeground(new java.awt.Color(255, 255, 255));
        btnModify.setText("Modify");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        jPanel3.add(btnModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 110, 40));

        btnDelete.setBackground(new java.awt.Color(0, 143, 122));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 110, 40));

        btnCreate.setBackground(new java.awt.Color(0, 143, 122));
        btnCreate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        jPanel3.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 110, 40));

        btnClear.setBackground(new java.awt.Color(0, 143, 122));
        btnClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel3.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 110, 40));

        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("*Click on row to select");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 30, 140, -1));

        lblName.setForeground(new java.awt.Color(255, 0, 0));
        lblName.setText("Coupon Name has been used");
        jPanel3.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, 20));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Coupon ID", "Coupon Name", "Coupon Discount", "Start Date", "End Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 570, 450));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 1160, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCouponNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCouponNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCouponNameActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you want to log out?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            new LoginPage().setVisible(true);
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnFoodItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoodItemActionPerformed
        setVisible(false);
        new ManagerManageFoodItemPage().setVisible(true);
    }//GEN-LAST:event_btnFoodItemActionPerformed

    private void txtSearchCouponNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchCouponNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchCouponNameActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        
        CreateCouponCodeController C4 = new CreateCouponCodeController();
        DateFormat Df = new SimpleDateFormat("yyyy-MM-dd");
        C4.CouponName =txtCouponName.getText();
        C4.CouponDiscount =Float.valueOf(txtCouponDiscount.getText());
        C4.StartDate = Df.format(StartDate.getDate());
        C4.EndDate = Df.format(EndDate.getDate());
        C4.createCouponController();
        setVisible(false);
        new ManagerManageCouponPage().setVisible(true);
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtCouponNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCouponNameKeyReleased
        validateFields();
        lblName.setVisible(false);
        validateFields();
        CreateCouponCodeController Cnc = new CreateCouponCodeController();
        Cnc.CounpoName=txtCouponName.getText();
        if(Cnc.CheckCouponName())
        {
            btnCreate.setEnabled(false);
            btnDelete.setEnabled(false);
            btnModify.setEnabled(false);
            lblName.setVisible(true);
        }
    }//GEN-LAST:event_txtCouponNameKeyReleased

    private void txtCouponDiscountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCouponDiscountKeyReleased
        validateFields();
    }//GEN-LAST:event_txtCouponDiscountKeyReleased

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        Iterator<Coupon> itr = ViewCouponCodeController.getData();
        while (itr.hasNext()) {
            Coupon couponObj = itr.next();
            dtm.addRow(new Object[]{couponObj.getCouponId(), couponObj.getCouponName(), couponObj.getCouponDiscount(), couponObj.getStartDate(), couponObj.getEndDate()});
        }
    }//GEN-LAST:event_formComponentShown

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
       
       ModifyCouponCodeController Mcc = new ModifyCouponCodeController();
       DateFormat Df = new SimpleDateFormat("yyyy-MM-dd");
       Mcc.Id= Integer.parseInt(lblCouponId.getText());
       Mcc.CouponName=txtCouponName.getText();
       Mcc.Discount=(Float.valueOf(txtCouponDiscount.getText()));
       Mcc.StarDate=Df.format(StartDate.getDate());
       Mcc.EndDate=Df.format(EndDate.getDate());
       Mcc.modifyCouponController();
       setVisible(false);
       new ManagerManageCouponPage().setVisible(true);
    }//GEN-LAST:event_btnModifyActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        btnCreate.setEnabled(false);
        int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        
        String CouponId = model.getValueAt(index, 0).toString();
        lblCouponId.setText(CouponId);
        String couponName = model.getValueAt(index, 1).toString();
        txtCouponName.setText(couponName);
        String couponDiscount = model.getValueAt(index, 2).toString();
        txtCouponDiscount.setText(couponDiscount);
//        String startDate = model.getValueAt(index, 3).toString();
//        StartDate.setDateFormatString(startDate);
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(index, 3));
            StartDate.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(ManagerManageCouponPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(index, 4));
            EndDate.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(ManagerManageCouponPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnModify.setEnabled(true);
        btnDelete.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
                int a = JOptionPane.showConfirmDialog(null, "Do you want to delete account?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0){
        DeleteCouponController Dcc = new DeleteCouponController();
        Dcc.CouponName = txtCouponName.getText();
        Dcc.deleteCouponController();
        setVisible(false);
        new ManagerManageCouponPage().setVisible(true);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clear();
       
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtSearchCouponNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchCouponNameKeyReleased
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter("(?i)"+ txtSearchCouponName.getText().trim(),1));
    }//GEN-LAST:event_txtSearchCouponNameKeyReleased

    private void EndDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_EndDatePropertyChange
        // TODO add your handling code here:
        StartDate.setMaxSelectableDate(EndDate.getDate()); 
        btnCreate.setEnabled(true);
    }//GEN-LAST:event_EndDatePropertyChange

    private void StartDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_StartDatePropertyChange
        // TODO add your handling code here:
        EndDate.setMinSelectableDate(StartDate.getDate()); 
        btnCreate.setEnabled(true);
    }//GEN-LAST:event_StartDatePropertyChange
    
    
   
    
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
            java.util.logging.Logger.getLogger(ManagerManageCouponPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerManageCouponPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerManageCouponPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerManageCouponPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new ManagerManageCouponPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser EndDate;
    private com.toedter.calendar.JDateChooser StartDate;
    private javax.swing.JLabel TNames;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCoupon;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFoodItem;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnModify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCouponId;
    private javax.swing.JLabel lblName;
    private javax.swing.JTextField txtCouponDiscount;
    private javax.swing.JTextField txtCouponName;
    private javax.swing.JTextField txtSearchCouponName;
    // End of variables declaration//GEN-END:variables
}
