
package librarymanagementsystem;

import javax.swing.JOptionPane;
import librarymanagementsystem.DatabaseAndLogger.Database;
import librarymanagementsystem.Users.User;
import librarymanagementsystem.Users.UserFactory;
import librarymanagementsystem.Users.UserType;

public class SignUp extends javax.swing.JFrame {

   
    public SignUp() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userType = new javax.swing.ButtonGroup();
        Rightpanel = new javax.swing.JPanel();
        iconLabel = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();
        LeftPanel = new javax.swing.JPanel();
        signupLabel = new javax.swing.JLabel();
        fullnameLabel = new javax.swing.JLabel();
        fullnameTextField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        usertypeLabel = new javax.swing.JLabel();
        adminRadioButton = new javax.swing.JRadioButton();
        regularRadioButton = new javax.swing.JRadioButton();
        signupButton = new javax.swing.JButton();
        accountLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SignUP");

        Rightpanel.setBackground(new java.awt.Color(74, 53, 40));
        Rightpanel.setPreferredSize(new java.awt.Dimension(400, 600));

        iconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/library.png"))); // NOI18N

        descriptionLabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        descriptionLabel.setForeground(new java.awt.Color(255, 255, 255));
        descriptionLabel.setText("Welcome To The Infinite Shelf");

        javax.swing.GroupLayout RightpanelLayout = new javax.swing.GroupLayout(Rightpanel);
        Rightpanel.setLayout(RightpanelLayout);
        RightpanelLayout.setHorizontalGroup(
            RightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightpanelLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(iconLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightpanelLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(descriptionLabel)
                .addGap(43, 43, 43))
        );
        RightpanelLayout.setVerticalGroup(
            RightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descriptionLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LeftPanel.setBackground(new java.awt.Color(255, 255, 255));
        LeftPanel.setForeground(new java.awt.Color(74, 53, 40));
        LeftPanel.setPreferredSize(new java.awt.Dimension(400, 600));

        signupLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        signupLabel.setText("SignUp");

        fullnameLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fullnameLabel.setText("Full Name");

        emailLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        emailLabel.setText("Email");

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        passwordLabel.setText("Password");

        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });

        usertypeLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        usertypeLabel.setText("User Type");

        adminRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        userType.add(adminRadioButton);
        adminRadioButton.setText("Admin");
        adminRadioButton.setActionCommand("admin");
        adminRadioButton.setFocusable(false);

        regularRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        userType.add(regularRadioButton);
        regularRadioButton.setText("Regular");
        regularRadioButton.setActionCommand("regular");
        regularRadioButton.setFocusable(false);

        signupButton.setBackground(new java.awt.Color(74, 53, 40));
        signupButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        signupButton.setForeground(new java.awt.Color(255, 255, 255));
        signupButton.setText("SignUp");
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonActionPerformed(evt);
            }
        });

        accountLabel.setText("I have an account");

        loginButton.setBackground(new java.awt.Color(74, 53, 40));
        loginButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftPanelLayout = new javax.swing.GroupLayout(LeftPanel);
        LeftPanel.setLayout(LeftPanelLayout);
        LeftPanelLayout.setHorizontalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(fullnameTextField)
                                .addComponent(fullnameLabel)
                                .addComponent(emailLabel)
                                .addComponent(emailTextField)
                                .addComponent(PasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                                .addComponent(passwordLabel)
                                .addComponent(usertypeLabel))
                            .addGroup(LeftPanelLayout.createSequentialGroup()
                                .addComponent(adminRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(regularRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftPanelLayout.createSequentialGroup()
                                .addComponent(accountLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84))
                            .addComponent(signupButton)))
                    .addGroup(LeftPanelLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(signupLabel)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        LeftPanelLayout.setVerticalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(signupLabel)
                .addGap(42, 42, 42)
                .addComponent(fullnameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fullnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(emailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usertypeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminRadioButton)
                    .addComponent(regularRadioButton))
                .addGap(27, 27, 27)
                .addComponent(signupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountLabel)
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Rightpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LeftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Rightpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
            .addComponent(LeftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_loginButtonActionPerformed

    private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButtonActionPerformed
        
        Database create = Database.getInstance();
        String fullName = fullnameTextField.getText().trim();
        String email = emailTextField.getText().trim();
        String password = new String(PasswordField.getPassword()).trim();
        User user;
        
        if (fullName.isEmpty() || email.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Full Name, Email, and Password cannot be empty!", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if("Admin".equalsIgnoreCase(userType.getSelection().getActionCommand()))
            user = UserFactory.createUser(UserType.ADMIN, fullName, email, password);
        else if("Regular".equalsIgnoreCase(userType.getSelection().getActionCommand()))
            user = UserFactory.createUser(UserType.REGULAR_USER, fullnameTextField.getText(), emailTextField.getText(), new String(PasswordField.getPassword()));
        else{
            JOptionPane.showMessageDialog(null, "Please select a user type (Admin or Regular).");
            return;
        }
        
        create.addUser(user);
        
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_signupButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LeftPanel;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JPanel Rightpanel;
    private javax.swing.JLabel accountLabel;
    private javax.swing.JRadioButton adminRadioButton;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel fullnameLabel;
    private javax.swing.JTextField fullnameTextField;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JRadioButton regularRadioButton;
    private javax.swing.JButton signupButton;
    private javax.swing.JLabel signupLabel;
    private javax.swing.ButtonGroup userType;
    private javax.swing.JLabel usertypeLabel;
    // End of variables declaration//GEN-END:variables
}
