package dev;

import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;
import java.util.ResourceBundle;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {

//        String asciiArt = FigletFont.convertOneLine("hello");
//        System.out.println(asciiArt);

        String titre = ResourceBundle.getBundle("application").getString("titre");
        String asciiArt = FigletFont.convertOneLine(titre);
        System.out.println(asciiArt);

        // affichage de l'environnement

        String environnement = ResourceBundle.getBundle("application").getString("environnement");
        System.out.println("Environnement : " + environnement);

    }
}
