package origin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Administrator {
    File root;
    RandomAccessFile unitRoot;
    public Administrator() {
        try {
            root = new File("Z"); //It creates the root directory Z 
            root.mkdir();
            
            unitRoot = new RandomAccessFile(root+"/Users.jco", "rw"); //Creates the RAF to have a default Admin
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
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
            createDIRsFor("Admin"); // <- Create Directories for the Admin
            return;
        }
        unitRoot.seek(unitRoot.length()); // <- It gets the position of the last register
        unitRoot.writeUTF(username); // <- Writes the username
        unitRoot.writeUTF(password); // <- Writes the password
        
        createDIRsFor(username); // <- Create Directories for the 'Username'
    }
}
