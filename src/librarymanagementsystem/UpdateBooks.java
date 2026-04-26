package librarymanagementsystem;

import javax.swing.JOptionPane;
import librarymanagementsystem.Book.Book;
import librarymanagementsystem.Book.BookBuilder;
import librarymanagementsystem.Book.BookType;
import librarymanagementsystem.DatabaseAndLogger.Database;


public class UpdateBooks extends javax.swing.JFrame {

    private String isbn;
    public UpdateBooks(Book book) {
        initComponents();
        titleTextField.setText(book.getTitle());
        authorTextField.setText(book.getAuthor());
        genreComboBox.setSelectedIndex(book.getGenre().getValue());
        publicationYearTextField.setText(String.valueOf(book.getPublicationYear()));
        isbnTextField.setText(book.getISBN());
        isbn=book.getISBN();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RightPanel = new javax.swing.JPanel();
        iconLabel = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();
        LeftPanel = new javax.swing.JPanel();
        updateinformationsLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        titleTextField = new javax.swing.JTextField();
        authorLabel = new javax.swing.JLabel();
        authorTextField = new javax.swing.JTextField();
        genreLabel = new javax.swing.JLabel();
        publicationYearLabel = new javax.swing.JLabel();
        publicationYearTextField = new javax.swing.JTextField();
        isbnLabel = new javax.swing.JLabel();
        isbnTextField = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        genreComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Books");

        RightPanel.setBackground(new java.awt.Color(74, 53, 40));
        RightPanel.setPreferredSize(new java.awt.Dimension(400, 550));

        iconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/insertbook.png"))); // NOI18N

        descriptionLabel.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        descriptionLabel.setForeground(new java.awt.Color(255, 255, 255));
        descriptionLabel.setText("Update Now");

        javax.swing.GroupLayout RightPanelLayout = new javax.swing.GroupLayout(RightPanel);
        RightPanel.setLayout(RightPanelLayout);
        RightPanelLayout.setHorizontalGroup(
            RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightPanelLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(iconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(descriptionLabel)
                .addGap(144, 144, 144))
        );
        RightPanelLayout.setVerticalGroup(
            RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightPanelLayout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(iconLabel)
                .addGap(32, 32, 32)
                .addComponent(descriptionLabel)
                .addContainerGap(250, Short.MAX_VALUE))
        );

        LeftPanel.setBackground(new java.awt.Color(255, 255, 255));
        LeftPanel.setPreferredSize(new java.awt.Dimension(400, 550));

        updateinformationsLabel.setBackground(new java.awt.Color(74, 53, 40));
        updateinformationsLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        updateinformationsLabel.setText("Update Informations");

        titleLabel.setText("Tittle");

        authorLabel.setText("Author");

        genreLabel.setText("Genre");

        publicationYearLabel.setText("Publication Year");

        isbnLabel.setText("ISBN");

        isbnTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isbnTextFieldActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(74, 53, 40));
        updateButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(74, 53, 40));
        backButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        genreComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Software_Engineering", "Management", "Artificial_Intelligence", "Newspaper" }));

        javax.swing.GroupLayout LeftPanelLayout = new javax.swing.GroupLayout(LeftPanel);
        LeftPanel.setLayout(LeftPanelLayout);
        LeftPanelLayout.setHorizontalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftPanelLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(updateinformationsLabel)
                .addGap(84, 84, 84))
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftPanelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(isbnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titleTextField)
                            .addComponent(authorTextField)
                            .addComponent(publicationYearLabel)
                            .addComponent(publicationYearTextField)
                            .addComponent(isbnTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                            .addComponent(genreComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(authorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(LeftPanelLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LeftPanelLayout.setVerticalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(updateinformationsLabel)
                .addGap(37, 37, 37)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(authorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(authorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(genreLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(genreComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(publicationYearLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(publicationYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(isbnLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(isbnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(RightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(LeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void isbnTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isbnTextFieldActionPerformed
    }//GEN-LAST:event_isbnTextFieldActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        Update UpdateFrame = new Update();
        UpdateFrame.setVisible(true);
        UpdateFrame.pack();
        UpdateFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        Database update = Database.getInstance();
        
        BookBuilder builder = new BookBuilder();
        Book book = builder.setISBN(isbnTextField.getText())
                .setTitle(titleTextField.getText())
                .setAuthor(authorTextField.getText())
                .setPublicationYear(Integer.parseInt(publicationYearTextField.getText()))
                .build(BookType.valueOf(String.valueOf(genreComboBox.getSelectedItem()).toUpperCase()));
        
        int result = update.updateBook(isbn,book);
        
        switch(result){
            case 1 -> JOptionPane.showInternalMessageDialog(null, "The Book Updated Successfully");
            case 0 -> JOptionPane.showMessageDialog(null, "The Book Is Not Existed","Falid", JOptionPane.ERROR_MESSAGE);
            case -1 -> JOptionPane.showInternalMessageDialog(null, "Error During Updating Book","Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LeftPanel;
    private javax.swing.JPanel RightPanel;
    private javax.swing.JLabel authorLabel;
    private javax.swing.JTextField authorTextField;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JComboBox<String> genreComboBox;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JLabel isbnLabel;
    private javax.swing.JTextField isbnTextField;
    private javax.swing.JLabel publicationYearLabel;
    private javax.swing.JTextField publicationYearTextField;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField titleTextField;
    private javax.swing.JButton updateButton;
    private javax.swing.JLabel updateinformationsLabel;
    // End of variables declaration//GEN-END:variables
}
