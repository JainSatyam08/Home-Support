
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Plumframe extends javax.swing.JFrame {

    /**
     * Creates new form Plumframe
     */
    public Plumframe() {
        initComponents();
        buttonGroup1.add(rdbmorn);
        buttonGroup1.add(rdbafter);
        buttonGroup1.add(rdbeven);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lbcname = new javax.swing.JLabel();
        textcname = new javax.swing.JTextField();
        lbcno = new javax.swing.JLabel();
        lbemail = new javax.swing.JLabel();
        textcno = new javax.swing.JTextField();
        textemail = new javax.swing.JTextField();
        lbaddress = new javax.swing.JLabel();
        textadd = new javax.swing.JTextField();
        lbland = new javax.swing.JLabel();
        textland = new javax.swing.JTextField();
        lbdate = new javax.swing.JLabel();
        textdate = new javax.swing.JTextField();
        lbtime = new javax.swing.JLabel();
        rdbmorn = new javax.swing.JRadioButton();
        rdbafter = new javax.swing.JRadioButton();
        rdbeven = new javax.swing.JRadioButton();
        lbdesc = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textdesc = new javax.swing.JTextArea();
        lbnote = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textnote = new javax.swing.JTextArea();
        btclear = new javax.swing.JButton();
        btback = new javax.swing.JButton();
        btadd = new javax.swing.JButton();
        lblmess = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(248, 228, 184));

        lbcname.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbcname.setText("CUSTOMER NAME");
        lbcname.setMaximumSize(new java.awt.Dimension(248, 32));
        lbcname.setMinimumSize(new java.awt.Dimension(248, 32));
        lbcname.setPreferredSize(new java.awt.Dimension(248, 32));

        textcname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lbcno.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbcno.setText("MOBILE NUMBER");

        lbemail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbemail.setText("E-MAIL ID");

        textcno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        textemail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lbaddress.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbaddress.setText("ADDRESS");

        textadd.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textaddActionPerformed(evt);
            }
        });

        lbland.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbland.setText("LANDMARK(CITY)");

        textland.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lbdate.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbdate.setText("PREFFERD DATE (YYYY-MM-DD)");

        textdate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lbtime.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbtime.setText("PREFFERED TIME");

        rdbmorn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rdbmorn.setText("MORNING");
        rdbmorn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbmornActionPerformed(evt);
            }
        });

        rdbafter.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rdbafter.setText("AFTERNOON");

        rdbeven.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rdbeven.setText("EVENING");

        lbdesc.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbdesc.setText("PROBLEM DESCRIPTION");

        textdesc.setColumns(20);
        textdesc.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textdesc.setRows(5);
        jScrollPane1.setViewportView(textdesc);

        lbnote.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbnote.setText("NOTE");

        textnote.setColumns(20);
        textnote.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textnote.setRows(5);
        jScrollPane2.setViewportView(textnote);

        btclear.setBackground(new java.awt.Color(102, 0, 153));
        btclear.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btclear.setText("CLEAR");
        btclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btclearActionPerformed(evt);
            }
        });

        btback.setBackground(new java.awt.Color(153, 0, 0));
        btback.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btback.setText("BACK");
        btback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbackActionPerformed(evt);
            }
        });

        btadd.setBackground(new java.awt.Color(0, 153, 51));
        btadd.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btadd.setText("SUBMIT");
        btadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaddActionPerformed(evt);
            }
        });

        lblmess.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbnote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbdesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbtime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbland, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbaddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbemail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbcno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbcname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textcname)
                                    .addComponent(textcno)
                                    .addComponent(textemail)
                                    .addComponent(textadd)
                                    .addComponent(textland)
                                    .addComponent(textdate, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(rdbmorn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(rdbafter))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(rdbeven, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblmess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btclear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btback, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(138, 138, 138)
                                .addComponent(btadd)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textcname)
                    .addComponent(lbcname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textcno, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(lbcno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbemail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textemail, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbaddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textadd, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbland, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textland, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textdate, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbtime, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdbafter)
                            .addComponent(rdbmorn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbeven)))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbdesc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbnote, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblmess, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btclear, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btback, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btadd, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdbmornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbmornActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbmornActionPerformed

    private void btaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaddActionPerformed
        if (textdate.getText().trim().isEmpty()) {
              lblmess.setText("Please enter a preferred date.");
              return;
        }
        if (!rdbmorn.isSelected() && !rdbafter.isSelected() && !rdbeven.isSelected()) {
            lblmess.setText("Please select a preferred time.");
            return;
        }
        try{
            Random r1=new Random();
	    int a=r1.nextInt(1,9);
            int b=r1.nextInt(1,9);
            int c=r1.nextInt(1,9);
            int d=r1.nextInt(1,9);
	    String r_id= "ISCSR"+a+""+b+""+c+""+d;
            String c_name= textcname.getText().trim();
            String cno=textcno.getText().trim();
            String email = textemail.getText().trim();
            String address = textadd.getText().trim();
            String landmark = textland.getText().trim();
            String p_date = textdate.getText().trim(); // format: yyyy-MM-dd
            if (c_name.isEmpty() || cno.isEmpty() || address.isEmpty() || landmark.isEmpty()) {

                lblmess.setText("❌ Please fill all the mandatory fields.");
                return;
            }
            if (!p_date.matches("\\d{4}-\\d{2}-\\d{2}")) {
                lblmess.setText("❌ Please enter date in YYYY-MM-DD format.");
                return;
            }
            if(!cno.matches("\\d{10}")){
                lblmess.setText("Enter valid 10 digit mobile no.");
                return;
            }

            String p_time = ""; // From radio buttons
            if (rdbmorn.isSelected()) {
                p_time = "Morning";
            } else if (rdbafter.isSelected()) {
                p_time = "Afternoon";
            } else if (rdbeven.isSelected()) {
                p_time = "Evening";
            }
            String p_desc = textdesc.getText().trim();
            String res_note = textnote.getText().trim();
            Class.forName("com.mysql.jdbc.Driver");
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/homesupport?user=root&password=satyam");
            String qry1="insert into request(r_id,c_name,cno,email,address,l_mark,s_type,p_desc,p_date,p_time,res_note) values(?,?,?,?,?,?,?,?,?,?,?)";
	    PreparedStatement ps1= con.prepareStatement(qry1);
	    ps1.setString(1,r_id);
	    ps1.setString(2,c_name);
	    ps1.setString(3,cno);
	    ps1.setString(4,email);
	    ps1.setString(5,address);
	    ps1.setString(6,landmark);
	    ps1.setString(7,"PLUMBER");
	    ps1.setString(8,p_desc);
            ps1.setString(9,p_date);
            ps1.setString(10,p_time);
            ps1.setString(11,res_note);
	    int a1=ps1.executeUpdate();
	    String qry2 = "INSERT INTO status (r_id, c_name, cno,s_type,status) VALUES (?, ?, ?, ?, ?)";
	    PreparedStatement ps2 = con.prepareStatement(qry2);
	    ps2.setString(1, r_id);
	    ps2.setString(2, c_name);
	    ps2.setString(3, cno);
	    ps2.setString(4, "PLUMBER");
	    ps2.setString(5, "Requested");
	    int a2=ps2.executeUpdate();
            if (a1==1 && a2==1){
                dispose();
                new Requestsubmitframe1(r_id).setVisible(true);
	    		
	    }    
            else{
                 dispose();
                 new Oopsframe().setVisible(true);
            }            
        }
        catch(Exception e){
            System.out.println(e);
        }  // TODO add your handli// TODO add your handling code here:
    }//GEN-LAST:event_btaddActionPerformed

    private void btbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbackActionPerformed
        dispose();
        new Newrequestframe().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btbackActionPerformed

    private void btclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btclearActionPerformed
        textcname.setText("");
        textcno.setText("");
        textemail.setText(""); 
        textadd.setText(""); 
        textland.setText(""); 
        textdesc.setText(""); 
        textdate.setText(""); 
        textnote.setText("");
        lblmess.setText("");
    }//GEN-LAST:event_btclearActionPerformed

    private void textaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textaddActionPerformed

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
            java.util.logging.Logger.getLogger(Plumframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Plumframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Plumframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Plumframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Plumframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btadd;
    private javax.swing.JButton btback;
    private javax.swing.JButton btclear;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbaddress;
    private javax.swing.JLabel lbcname;
    private javax.swing.JLabel lbcno;
    private javax.swing.JLabel lbdate;
    private javax.swing.JLabel lbdesc;
    private javax.swing.JLabel lbemail;
    private javax.swing.JLabel lbland;
    private javax.swing.JLabel lblmess;
    private javax.swing.JLabel lbnote;
    private javax.swing.JLabel lbtime;
    private javax.swing.JRadioButton rdbafter;
    private javax.swing.JRadioButton rdbeven;
    private javax.swing.JRadioButton rdbmorn;
    private javax.swing.JTextField textadd;
    private javax.swing.JTextField textcname;
    private javax.swing.JTextField textcno;
    private javax.swing.JTextField textdate;
    private javax.swing.JTextArea textdesc;
    private javax.swing.JTextField textemail;
    private javax.swing.JTextField textland;
    private javax.swing.JTextArea textnote;
    // End of variables declaration//GEN-END:variables
}
