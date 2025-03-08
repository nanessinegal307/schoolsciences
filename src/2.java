import java.util.Random;

public class RandomJavaCode {
  public static void main(String[] args) {
    int min = 10;
    int max = 20;
    Random random = new Random();
    int randNum = random.nextInt(max - min + 1) + min;
    System.out.println("Random number between " + min + " and " + max + ": " + randNum);
  }
}
