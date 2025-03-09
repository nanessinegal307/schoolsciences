  public class SchoolSciences {
      private static final int FLOOR = 10;
      private static final int CEILING = 100;
  
      public static void main(String[] args) {
          double randomNumber = getRandomNumber();
          System.out.println("The random number is: " + randomNumber);
      }
  
      private static double getRandomNumber() {
          Random random = new Random();
          return random.nextInt((CEILING - FLOOR) + 1) + FLOOR;
      }
  }