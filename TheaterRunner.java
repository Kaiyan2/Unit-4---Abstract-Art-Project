/* 
 * Importing necessary libraries for theater functionality
 */
import org.code.theater.*;

public class TheaterRunner {

  /* 
   * Main method that serves as the entry point for the program.
   * This is where the application starts executing.
   */
  public static void main(String[] args) {

    /* 
     * Creating an instance of the DataScene class.
     * The constructor of DataScene is called here, which sets up the data for the scene 
     * (such as creating an array of Cat objects from the text files).
     */
    DataScene scene = new DataScene();
    
    /* 
     * Drawing the scene on the screen.
     * This calls the drawScene() method from the DataScene class, which:
     *   - Clears the screen
     *   - Sets text properties like height and color
     *   - Displays a random cat's name and lifespan
     *   - Shows an image of a cat
     *   - Plays a sound of a cat meowing
     */
    scene.drawScene();
    
    /* 
     * Playing the scene using the Theater class.
     * This method handles the display and running of the scene, 
     * allowing it to be viewed on the screen.
     */
    Theater.playScenes(scene);
  }
}