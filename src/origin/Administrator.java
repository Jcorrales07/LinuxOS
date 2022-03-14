package origin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Administrator {
    public static ArrayList<User> users = new ArrayList<>();
    static File root; // <- Z
    static RandomAccessFile unitRoot; // <- usuarios
    
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
            return; // <- It ends the process
        }
        
        if(searchUser(username) == null) {
            unitRoot.seek(unitRoot.length()); // <- It gets the position of the last register
            unitRoot.writeUTF(username); // <- Writes the username
            unitRoot.writeUTF(password); // <- Writes the password

            this.createDIRsFor(username); // <- Create Directories for the 'Username'
        } else JOptionPane.showMessageDialog(null, "Existing account!");
    }
    
    private void createDIRsFor(String username) {
        //             user = 'Z/Admin'
        File user = new File(root+"/"+username); //Creates the 'Username' subfolder in 'Z' <- Root Directory
        user.mkdir();
        
        //                  Z/Admin/Documents/
        File doc = new File(user+"/Documents"); //Creates 'Documents' subfolder in 'Username'
        doc.mkdir();
        
        //                    Z/Admin/Music
        File music = new File(user+"/Music"); //Creates the 'Music' subfolder in 'Username'
        music.mkdir();
        
        //                   Z/Admin/Images
        File imgs = new File(user+"/Images"); //Creates the 'Images' subfolder in 'Username'
        imgs.mkdir();
    }
    
    public static void fillArray() throws IOException {
        unitRoot = new RandomAccessFile("Z/Users.jco", "rw");
        String username;
        String password;
        
        //Mientras el puntero tenga para recorrer dentro el archivo...
        while(unitRoot.getFilePointer() < unitRoot.length()) { // 10
            username = unitRoot.readUTF(); //<- leemos datos
            password = unitRoot.readUTF();
            
            User user = new User(username, password); //<- creamos objetos tipo User
            users.add(user); //<- se agregan a la lista
        }
        
        for(User user : Administrator.users) {
            System.out.println(user);
        }
    }
    
    private static void cleanList() {
        users = new ArrayList<>();
    }
    
    
    //Funcion que retorna un USUARIO 
    private static User searchUser(String username) throws IOException {
        fillArray(); //<- Tener la lista llena de lo usuarios registrados
        for(User user : Administrator.users) { // <- Recorremos la lista
            if(user.getUsername().equalsIgnoreCase(username)) {
                cleanList(); //<- limpiamos la lista
                return user; //<- retornamos un usuario si se encuentra
            }
        }
        cleanList();
        return null;
    }
    
    public static boolean loggin(String username, String password) throws IOException {
        User user = searchUser(username);
        return user != null && user.getPassword().equals(password);
    }
}
