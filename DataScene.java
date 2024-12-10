import org.code.theater.*;

public class DataScene extends Scene {

 private Dog[] canine;    
 
  public DataScene() {
    canine = createCanine();
  }
 
  public Dog[] createCanine() {
    String[] dogNamesArray = FileReader.toStringArray("dogNames.txt");
    String[] longevityArray = FileReader.toStringArray("longevity.txt");
   
    Dog[] canineArray = new Dog[dogNamesArray.length];
    for (int i = 0; i < canineArray.length; i++) {
      canineArray[i] = new Dog(dogNamesArray[i], longevityArray[i]);
    }

    return canineArray;
  }

  public Dog getRandomDog() {
  int randomIndex = (int) (Math.random() * canine.length);
  return canine[randomIndex];
}
  public void drawScene() {
  Dog randomDog = getRandomDog();
    System.out.println("Dog: " + randomDog.getDogName());
    System.out.println("Longevity " + randomDog.getlongevity() + " years");

      String longevity = randomDog.getlongevity();
    String face;
    if (longevity.equals("15") || longevity.equals("14")){
      face = ":)";
    }
    else if (longevity.equals("13") || longevity.equals ("12")) {
      face = ":/";
    }
    else {
      face = ":'( ";
    }
   
  }

}