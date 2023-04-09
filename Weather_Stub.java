import java.util.InputMismatchException;
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
       boolean check = true;
       while(check){
        try{
            return scanner.nextInt();
        }
        catch(InputMismatchException e){
            scanner.next();
            System.err.print("INVALID INPUT!");
        }
       }
       return scanner.nextInt();
    }

    private static void checkForOutOfBoundsChoice(){
      if(choice < 0 || choice > 3){
        System.out.println("INVALID CHOICE! PLEASE ONLY CHOSE OPTION 1,2 OR 3! OR 0 TO EXIT APPLICATION!");
      }  
    }

    private static int getInfo(int values[]){
        for(int i = 0; i < DAYS_OF_THE_WEEK.length; i++){
            System.out.println("Please enter the " + weather + " for " + DAYS_OF_THE_WEEK[i]);
            values[i] = checkInput();
            total += values[i];
            if(values[i] < min)min = values[i];
            if(values[i] > max)max = values[i];
        }
        checkWhichToPrintOut();
        return total;
    }

    private static void checkWhichToPrintOut(){
        if(choice == 1){
            printOutInfo(temps);
        }else if(choice == 2){
            printOutInfo(rainFall);
        }else if(choice == 3){
            printOutInfo(humidity);
        }
    }
    
    
    private static void printOutInfo(int val[]){
      System.out.printf("Monday  Tuesday    Wednesday   Thursday   Friday   Saturday    Sunday\n");
      System.out.printf("---------------------------------------------------------------------------\n");
      System.out.printf("%4d     %4d         %4d    %4d       %4d      %4d        %4d\n",val[0],val[1],val[2],val[3],val[4],val[5],val[6],val[7]);
    
      System.out.println("Avg: "  +  weather + " is " + total / NUM_NUMS);
      System.out.println("Highest  " + weather + " of the week was: "  + max );
      System.out.println("Lowest " + weather +   "of the week was : " + min );  
    }

    private static void exitMessage(){
      System.out.println("Exiting......");  
    }


}