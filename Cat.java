import org.code.theater.*;
import org.code.media.*;

public class Dog{

  private String dogName;
  private String longevity;

  public Dog(String dogName, String longevity){
    this.dogName = dogName;
      this.longevity = longevity;
  }

  public String getDogName() {
    return dogName;
  }

  public String getlongevity () {
    return longevity;
  }

  public String toString() {
    return dogName + " (" + longevity + " years)";
  }

  }