
import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();


        String team1=getTeamName(input,1);
        String team2=getTeamName(input,2 );

       boolean winToss = conductingToss(team1,team2,random);

       String [] team1Players=getPlayerNames(input , team1);
        String [] team2Players=getPlayerNames(input , team2);

        int [][]team1Score = simmulatingInnings(random,team1Players,team1,20);
        int [][]team2Score = simmulatingInnings(random,team2Players,team2,20);

        displayScorecard(team1,team1Players,team1Score);
        displayScorecard(team2,team2Players,team2Score);


        winner(team1,team1Score,team2,team2Score);

        String manOfTheMatch=determineManOfTheMatch(team1Players,team1Score,team2Players,team2Score);
        System.out.println("MAN OF THE MATCH "+manOfTheMatch);

      input.close();
    }

public static String getTeamName(Scanner input, int teamNumber){
            System.out.println("ENTER NAME FOR TEAM"+teamNumber);
            return input.nextLine();

        }
public static boolean conductingToss(String team1 ,String team2, Random random){
    System.out.println("COIN IS TOSSING AND THE WINNER IS..... ");
    boolean winToss=random.nextBoolean();
    if(winToss){
        System.out.println(team1+"  WON THE TOSS AND DECIDED TO BAT FIRST");
    }
    else{
        System.out.println(team2+"  WON THE TOSS AND DECIDED TO BAT FIRST");
    }
   return winToss;
}
public static String[] getPlayerNames(Scanner input, String teamName){
    String[] players = new String[11];
    System.out.println("ENTER PLAYER NAMES FOR  "+teamName+ " :");
    for (int i=0;i<11;i++){
        System.out.println("Player "+(i+1)+" :");
        players[i]=input.nextLine();
    }
    return players;

}
public static int[][] simmulatingInnings(Random random, String [] players , String teamName,int overs){
       int[][] playerStats = new int [11][5];

       int wickets=0;

       int currentPlayer=0;

       for (int over=0; over<overs;over++){
           for (int ball =0;ball<6;ball++){
               if(wickets==10){
                   break;
               }
               int outcome = random.nextInt(8);
               playerStats[currentPlayer][1]++;
               if(outcome==7){
                   playerStats[currentPlayer][4]=1;
                   currentPlayer++;
                   wickets++;
               }
               else{
                   playerStats[currentPlayer][0]+=outcome;

               }
               if(outcome==4){
                  playerStats[currentPlayer][2]++;
               } else if (outcome==6) {
                   playerStats[currentPlayer][3]++;
               }

           }
           if (wickets==10){
               break;
           }

       }

    return playerStats;

}
public static void displayScorecard(String teamName,String[] players,int[][] teamScore){
    System.out.println("\nSCORECARD FOR "+ teamName+" :");
    int totalRuns=0;
    int totalBalls=0;
    int totalWickets=0;
    int totalFours=0;
    int totalSixes=0;
    DecimalFormat df=new DecimalFormat("#.00");
    for (int i=0;i< players.length;i++){
        int runs = teamScore[i][0];
        int balls =teamScore[i][1];
        int fours =teamScore[i][2];
        int sixes =teamScore[i][3];
        boolean out =teamScore[i][4]==1;
        totalRuns+=runs;
        totalBalls+=balls;
        totalFours+=fours;
        totalSixes+=sixes;
        if(out){
            totalWickets++;
        }
        double strikeRate=balls>0 ? (runs/(double)balls)*100:0.0;
        String formattedStrikeRate = df.format(strikeRate);

        System.out.println(players[i] + " :");
        System.out.println("  Runs = " + runs);
        System.out.println("  Balls = " + balls);
        System.out.println("  Sixes = " + sixes);
        System.out.println("  Fours = " + fours);
        System.out.println("  Strike Rate = " + formattedStrikeRate);
        System.out.println("  Out = " + (out ? "YES" : "NO"));
        System.out.println();
    }

    System.out.println("TOTALS :");
    System.out.println(" TOTAL Runs = " + totalRuns);
    System.out.println(" TOTAL Balls = " + totalBalls);
    System.out.println(" TOTAL  Wickets = " + totalWickets);
    System.out.println(" TOTAL Fours = " + totalFours);
    System.out.println(" TOTAL Sixes = " + totalSixes);
}
public static void winner(String team1 , int [][] team1Score, String team2,int[][] team2Score){
        int team1Total=0;
        int team2Total=0;
        for (int i=0;i<11;i++){
            team1Total+=team1Score[i][0];
            team2Total+=team2Score[i][0];

        }
        if (team1Total>team2Total){
        System.out.println(team1+" CONGRAGTS....YOU WINS ");
    }
        else if (team1Total<team2Total){
        System.out.println(team2+" CONGRAGTS....YOU WINS ");

    }
        else{
        System.out.println("DRAW GAME .... ");
    }


}

    public static String determineManOfTheMatch(String[] team1Players, int[][] team1Score, String[] team2Players, int[][] team2Score) {
        int maxRuns = 0;
        String manOfTheMatch = "";


        for (int i = 0; i < 11; i++) {
            int runs = team1Score[i][0];
            if (runs > maxRuns) {
                maxRuns = runs;
                manOfTheMatch = team1Players[i];
            }
        }


        for (int i = 0; i < 11; i++) {
            int runs = team2Score[i][0];
            if (runs > maxRuns) {
                maxRuns = runs;
                manOfTheMatch = team2Players[i];
            }
        }

        return manOfTheMatch;
    }










}