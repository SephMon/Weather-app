import java.util.Scanner;

public class Weather_Stub{

    private static Scanner scanner = new Scanner(System.in);
    private static final String NAME[] = {"gerry"};
    private static final String PASS[] = {"cat"};
    private static final String DAYS_OF_THE_WEEK[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    private static final boolean keepGoing = true;
    private static final int MAX_LOGIN_ATTEMPTS = 3;
    private static final int NUM_NUMS = 7;
    private static int[] temps = new int[8];
    private static int[] rainFall = new int[8];
    private static int[] humidity = new int[8];
    private static int total;
    private static int max = Integer.MIN_VALUE;
    private static int min = Integer.MAX_VALUE;
    private static int choice;
    public static void main(String[] args){
        startingPoint();
    }

    private static void startingPoint(){

    }

    private static void headerMessage(){

    }

    private static void welcomeMessage(){

    }

    private static int getIntput(){
        return 0;
    }

    private static int getChoice(){
        return 0;
    }

    private static int checkInput(){
        return 0;
    }

    private static void checkForOutOfBoundsChoice(){

    }

    private static int getInfo(int values[]){
        return values[0];
    }

    private static void printOutInfo(){
        
    }

    private static void exitMessage(){

    }


}