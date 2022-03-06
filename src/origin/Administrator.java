package origin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Administrator {
    public static ArrayList<User> users = new ArrayList<>();
    static File root;
    static RandomAccessFile unitRoot;
    
    public Administrator() {
        try {
            root = new File("Z"); //It creates the root directory Z 
            root.mkdir();
            unitRoot = new RandomAccessFile(root+"/Users.jco", "rw"); //Creates the RAF to have a default Admin
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    /**
    * @param username The username it needed in order to register
    * @param password the same for the password
    * @throws java.io.IOException
    * [=== FILE FORMAT ===] 
    *    String username
    *    String password
    *    bytes undefined ((nChars * 2) + (nChars * 2)) bytes
    */
    public void addUsers(String username, String password) throws IOException {
        if(unitRoot.length() == 0) { // <- If the R.A.File is empty
            unitRoot.seek(0); // <- Get Pointer at position 0
            unitRoot.writeUTF("Admin"); // <- Write the Admin Username
            unitRoot.writeUTF("supersecreto");  // <- Write the Password
            this.createDIRsFor("Admin"); // <- Create Directories for the Admin
            unitRoot.close();
            return;
        }
        unitRoot.seek(unitRoot.length()); // <- It gets the position of the last register
        unitRoot.writeUTF(username); // <- Writes the username
        unitRoot.writeUTF(password); // <- Writes the password
        
        this.createDIRsFor(username); // <- Create Directories for the 'Username'
        unitRoot.close();
    }
    
    private void createDIRsFor(String username) {
        File user = new File(root+"/"+username); //Creates the 'Username' subfolder in 'Z' <- Root Directory
        user.mkdir();
        File doc = new File(user+"/Documents"); //Creates 'Documents' subfolder in 'Username'
        doc.mkdir();
        File music = new File(user+"/Music"); //Creates the 'Music' subfolder in 'Username'
        music.mkdir();
        File imgs = new File(user+"/Images"); //Creates the 'Images' subfolder in 'Username'
        imgs.mkdir();
    }
    
    public static void fillArray() throws IOException {
        unitRoot = new RandomAccessFile("Z/Users.jco", "rw");
        String username;
        String password;
        
        while(unitRoot.getFilePointer() < unitRoot.length()) {
            username = unitRoot.readUTF();
            password = unitRoot.readUTF();
            
            User user = new User(username, password);
            users.add(user);
        }
        unitRoot.close();
        
        for(User user : Administrator.users) {
            System.out.println(user);
        }
    }
    
    private static User searchUser(String username) throws IOException {
        fillArray();
        for(User user : Administrator.users) {
            if(user.getUsername().equalsIgnoreCase(username)) {
                return user;
            }
        }
        return null;
    }
    
    public static boolean loggin(String username, String password) throws IOException {
        User user = searchUser(username);
        return user != null && user.getPassword().equals(password);
    }
}
