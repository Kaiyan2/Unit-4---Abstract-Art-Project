// Importing necessary libraries
import org.code.theater.*;
import org.code.media.*;

/*
 * Class definition for Cat
 * This class represents a Cat with properties such as name and its life span.
 */
public class Cat {

  // Declaring private variables to store the cat's name, maximum life, and minimum life
  private String catNames;  // Name of the cat
  private int maxLife;      // Maximum life span of the cat
  private int minLife;      // Minimum life span of the cat

  /*
   * Constructor to initialize the cat's name, maximum life, and minimum life
   * param catNames Name of the cat
   * param maxLife Maximum life span of the cat
   * param minLife Minimum life span of the cat
   */
  public Cat(String catNames, int maxLife, int minLife) {
    this.catNames = catNames;  // Assigning the passed name to the catNames field
    this.maxLife = maxLife;    // Assigning the passed maxLife to the maxLife field
    this.minLife = minLife;    // Assigning the passed minLife to the minLife field
  }

  /*
   * Getter method to return the cat's name
   * return Name of the cat
   */
  public String getcatNames() {
    return catNames;  // Returns the name of the cat
  }

  /*
   * Getter method to return the minimum life span of the cat
   * return Minimum life span of the cat
   */
  public int getMinLife() {
    return minLife;  // Returns the minimum life span of the cat
  }

  /*
   * Getter method to return the maximum life span of the cat
   * return Maximum life span of the cat
   */
  public int getMaxLife() {
    return maxLife;  // Returns the maximum life span of the cat
  }

  /*
   * Override the toString method to provide a custom string representation of the Cat object
   * return A formatted string with cat's name and life span range
   */
  public String toString() {
    return catNames + " (" + minLife + " - " + maxLife + " years)";  // Returns a formatted string with cat's name and life span range
  }
}