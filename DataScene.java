// Importing necessary libraries for the theater functionality
import org.code.theater.*;

public class DataScene extends Scene {

  /* 
   * Declaring an array to store Cat objects
   */
  private Cat[] feline;    

  /* 
   * Constructor to initialize the scene and populate the feline array 
   */
  public DataScene() {
    feline = createFeline();  // Calls createFeline method to populate the feline array with Cat objects
  }

  /* 
   * Method to create an array of Cat objects by reading data from text files
   */
  public Cat[] createFeline() {
    /* 
     * Reading data from text files: cat names, minimum and maximum life spans
     */
    String[] catNamesArray = FileReader.toStringArray("catNames.txt");  // Names of the cats
    int[] minLifeArray = FileReader.toIntArray("minLife.txt");         // Minimum life span of cats
    int[] maxLifeArray = FileReader.toIntArray("maxLife.txt");         // Maximum life span of cats
    
    /* 
     * Creating an array of Cat objects based on the length of the catNamesArray
     */
    Cat[] felineArray = new Cat[catNamesArray.length];
    
    /* 
     * Looping through each name and creating a Cat object using the corresponding minLife and maxLife
     */
    for (int i = 0; i < felineArray.length; i++) {
      /* 
       * Creating each Cat object with name, minLife, and maxLife from the respective arrays
       */
      felineArray[i] = new Cat(catNamesArray[i], minLifeArray[i], maxLifeArray[i]);
    }

    return felineArray;  // Returning the array of Cat objects
  }

  /* 
   * Method to get a random Cat from the feline array
   */
  public Cat getRandomCat() {
    /* 
     * Generate a random index between 0 and the length of the feline array
     */
    int randomIndex = (int) (Math.random() * feline.length);
    return feline[randomIndex];  // Returning the random Cat object at that index
  }

  /* 
   * Method to draw the scene on the screen
   */
  public void drawScene() {
    /* 
     * Clear the screen and set the background color to gray
     */
    clear("gray");
    
    /* 
     * Set the text height for the text to be drawn
     */
    setTextHeight(20);
    
    /* 
     * Set the text color to black
     */
    setTextColor("black");
    
    /* 
     * Get a random cat from the feline array
     */
    Cat randomCat = getRandomCat();
    
    /* 
     * Display the cat's name and life span (using the toString method of the Cat class)
     */
    drawText(randomCat.toString(), 25, 50);
    
    /* 
     * Display an image of a cat at the specified position (100, 150) with width 200
     */
    drawImage("cats.jpg", 100, 150, 200);
    
    /* 
     * Draw the longevity message based on the cat's life span
     */
    drawLongevity(randomCat);
    
    /* 
     * Play a sound of a cat meowing
     */
    playSound("cat-meow-85175.wav");
  }

  /* 
   * Method to display a longevity message based on the cat's life span
   */
  public void drawLongevity(Cat cat) {
    /* 
     * Get the minimum and maximum life spans of the cat
     */
    int minLife = cat.getMinLife();
    int maxLife = cat.getMaxLife();
    
    /* 
     * Calculate the difference in life span (longevity) between minLife and maxLife
     */
    int longevity = Math.abs(minLife - maxLife);
    
    /* 
     * Display a message based on the longevity value
     */
    if (longevity == 6 || longevity == 7) {
      drawText("A long time :)", 25, 100);  // Long life span
    }
    else if (longevity == 4 || longevity == 5) {
      drawText("Decent amount of time :|", 25, 100);  // Decent life span
    }
    else {
      drawText("Not very long :(", 25, 100);  // Short life span
    }
  }
}