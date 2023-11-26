
import jflex.exceptions.SilentExit;

/**
 *
 * @author Maximiliano Gamez Alonso - 180752
 */
public class ExecuteJFlex {

    public static void main(String omega[]) {
        String lexerFile = System.getProperty("user.dir") + "/src/Lexer.flex",
                lexerColor = System.getProperty("user.dir") + "/src/LexerColor.flex";
        try {
            jflex.Main.generate(new String[]{lexerFile, lexerColor});
        } catch (SilentExit ex) {
            System.out.println("Error al compilar/generar el archivo flex: " + ex);
        }
    }
}
