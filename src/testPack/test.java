package testPack;

import java.io.IOException;
import origin.Administrator;

public class test {
    public static void main(String[] args) throws IOException {
        Administrator admin = new Administrator();
        admin.addUsers("Jcorrales", "contraseña");
    }
}
