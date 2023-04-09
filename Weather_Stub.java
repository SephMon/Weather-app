import java.util.Scanner;

public class Weather_Stub{

    private static Scanner scanner = new Scanner(System.in);
    private static final String NAME[] = {"gerry"};
    private static final String PASS[] = {"cat"};
    private static final String DAYS_OF_THE_WEEK[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    private static boolean keepGoing = true;
    private static final int MAX_LOGIN_ATTEMPTS = 3;
    private static final int NUM_NUMS = 7;
    private static int[] temps = new int[8];
    private static int[] rainFall = new int[8];
    private static int[] humidity = new int[8];
    private static int total;
    private static int max = Integer.MIN_VALUE;
    private static int min = Integer.MAX_VALUE;
    private static int choice;
    private static String weather;
    public static void main(String[] args){
        startingPoint();
    }

    private static void startingPoint(){
      welcomeMessage();
      while(keepGoing){
        choice = getInput();
      }
    }

    private static void headerMessage(){
      System.out.println("**********************");
      System.out.println("*      Login         *");
      System.out.println("*    Successful      *");
      System.out.println("**********************");
    }

    private static void welcomeMessage(){
      System.out.println("**********************");
      System.out.println("* WELCOME TO THE MET *");
      System.out.println("* OFFICE LOGIN PAGE  *");
      System.out.println("**********************");  
    }

    private static int getInput(){
      System.out.println("Enter choice: ");
      choice = scanner.nextInt();
      getChoice();
      return choice;
    }

    private static int getChoice(){
      switch(choice){
        case 1: weather= "Temps";
        getInfo(temps);
        break;

        case 2: weather = "Rains";
        getInfo(rainFall);
        break;

        case 3: weather = "Humidity";
        getInfo(humidity);
        break;

        case 0: keepGoing = false;
        exitMessage();

        default:
        checkForOutOfBoundsChoice();
      }
      return choice;
    }

    private static int checkInput(){
        return 0;
    }

    private static void checkForOutOfBoundsChoice(){
      if(choice < 0 || choice > 3){
        System.out.println("INVALID CHOICE! PLEASE ONLY CHOSE OPTION 1,2 OR 3! OR 0 TO EXIT APPLICATION!");
      }  
    }

    private static int getInfo(int values[]){
        return values[0];
    }

    private static void printOutInfo(){

    }

    private static void exitMessage(){

    }


}