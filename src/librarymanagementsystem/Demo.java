package librarymanagementsystem;

import librarymanagementsystem.DatabaseAndLogger.Database;

public class Demo {
    public static void main(String[] args) {
                
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);

//        Database.getInstance().closeConnection();
    }
}
