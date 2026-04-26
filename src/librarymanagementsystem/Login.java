
package librarymanagementsystem;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import librarymanagementsystem.DatabaseAndLogger.Database;
import librarymanagementsystem.Users.UserType;


public class Login extends javax.swing.JFrame {


    public Login() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usertype = new javax.swing.ButtonGroup();
        LoginPanel = new javax.swing.JPanel();
        RightPanel = new javax.swing.JPanel();
        iconLabel = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();
        LeftPanel = new javax.swing.JPanel();
        loginLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        accountLabel = new javax.swing.JLabel();
        signupButton = new javax.swing.JButton();
        usertypeLabel = new javax.swing.JLabel();
        adminRadioButton = new javax.swing.JRadioButton();
        regularRadioButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        LoginPanel.setBackground(new java.awt.Color(228, 224, 225));
        LoginPanel.setPreferredSize(new java.awt.Dimension(800, 500));
        LoginPanel.setLayout(null);

        RightPanel.setBackground(new java.awt.Color(74, 53, 40));
        RightPanel.setPreferredSize(new java.awt.Dimension(400, 600));

        iconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/library.png"))); // NOI18N

        descriptionLabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        descriptionLabel.setForeground(new java.awt.Color(255, 255, 255));
        descriptionLabel.setText("The Infinite Shelf");

        javax.swing.GroupLayout RightPanelLayout = new javax.swing.GroupLayout(RightPanel);
        RightPanel.setLayout(RightPanelLayout);
        RightPanelLayout.setHorizontalGroup(
            RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightPanelLayout.createSequentialGroup()
                .addGroup(RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightPanelLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(iconLabel))
                    .addGroup(RightPanelLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(descriptionLabel)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        RightPanelLayout.setVerticalGroup(
            RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );

        LoginPanel.add(RightPanel);
        RightPanel.setBounds(0, 0, 400, 500);

        LeftPanel.setBackground(new java.awt.Color(255, 255, 255));
        LeftPanel.setFocusable(false);
        LeftPanel.setPreferredSize(new java.awt.Dimension(400, 600));

        loginLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(74, 53, 40));
        loginLabel.setText("Login");

        emailLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        emailLabel.setText("Email");

        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        passwordLabel.setText("Password");

        loginButton.setBackground(new java.awt.Color(74, 53, 40));
        loginButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        accountLabel.setText("I don't have an account");

        signupButton.setBackground(new java.awt.Color(74, 53, 40));
        signupButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        signupButton.setForeground(new java.awt.Color(255, 255, 255));
        signupButton.setText("Sign Up");
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonActionPerformed(evt);
            }
        });

        usertypeLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        usertypeLabel.setText("User Type");

        adminRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        usertype.add(adminRadioButton);
        adminRadioButton.setText("Admin");
        adminRadioButton.setFocusable(false);

        regularRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        usertype.add(regularRadioButton);
        regularRadioButton.setText("Regular");
        regularRadioButton.setFocusable(false);

        javax.swing.GroupLayout LeftPanelLayout = new javax.swing.GroupLayout(LeftPanel);
        LeftPanel.setLayout(LeftPanelLayout);
        LeftPanelLayout.setHorizontalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftPanelLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(loginLabel))
                    .addGroup(LeftPanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(accountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signupButton))
                    .addGroup(LeftPanelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LeftPanelLayout.createSequentialGroup()
                                .addComponent(adminRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(regularRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(emailTextField)
                                .addComponent(passwordLabel)
                                .addComponent(PasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(usertypeLabel)))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        LeftPanelLayout.setVerticalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(loginLabel)
                .addGap(57, 57, 57)
                .addComponent(emailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usertypeLabel)
                .addGap(14, 14, 14)
                .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminRadioButton)
                    .addComponent(regularRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountLabel)
                    .addComponent(signupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        LoginPanel.add(LeftPanel);
        LeftPanel.setBounds(400, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        LoginPanel.getAccessibleContext().setAccessibleName("Login");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButtonActionPerformed
        // TODO add your handling code here:
        SignUp SignUpFrame = new SignUp();
        SignUpFrame.setVisible(true);
        SignUpFrame.pack();
        SignUpFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_signupButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
  
        Database read = Database.getInstance();
        String email = emailTextField.getText().trim();
        String password = new String(PasswordField.getPassword()).trim();   
    if (email.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Email and Password cannot be empty!", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
        if (adminRadioButton.isSelected()) {
            boolean exist = read.loginUser(email, password, UserType.ADMIN);
            if (exist) { 
                HomeAdmin HomeAdminFrame = new HomeAdmin();
                HomeAdminFrame.setLocationRelativeTo(null);
                HomeAdminFrame.setLayout(null);
                JLabel welcomeLabel = new JLabel("Welcome to Admin Home Page!");
                HomeAdminFrame.add(welcomeLabel);
                HomeAdminFrame.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Email Or Password Incorrect");
            }
        } 

        else if (regularRadioButton.isSelected()) {
            boolean exist = read.loginUser(email, password, UserType.REGULAR_USER);
            
            if(exist){
                HomeUser HomeUserFrame = new HomeUser();
                HomeUserFrame.setLocationRelativeTo(null);
                HomeUserFrame.setLayout(null);
                JLabel welcomeLabel = new JLabel("Welcome to User Home Page!");
                HomeUserFrame.add(welcomeLabel);
                HomeUserFrame.setVisible(true);
                dispose();
            } else{
                JOptionPane.showMessageDialog(null, "Email Or Password Incorrect");
            }
        } 
        else {
            JOptionPane.showMessageDialog(null, "Please select a user type (Admin or Regular).");
        }
  
     
    }//GEN-LAST:event_loginButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LeftPanel;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JPanel RightPanel;
    private javax.swing.JLabel accountLabel;
    private javax.swing.JRadioButton adminRadioButton;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JRadioButton regularRadioButton;
    private javax.swing.JButton signupButton;
    private javax.swing.ButtonGroup usertype;
    private javax.swing.JLabel usertypeLabel;
    // End of variables declaration//GEN-END:variables
}
