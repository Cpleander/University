package uk.ac.kingston.programming2.football2_C;
import java.util.*;
import java.io.*;

public class MainTest {
    public static void main(String[] args) {

Control.loadFileMatch();
Control.loadFileTeam();



querydiv = new Querydiv(Control.getTeamList());
queryname = new Queryname(Control.getTeamList());
querycoaches = new Querycoaches(Control.getTeamList());
queryleague = new Queryleague(Control.getTeamList());
queryfulltime = new Queryfulltime(Control.getTeamList());

    }
    static Querydiv querydiv;
    static Queryname queryname;
    static Querycoaches querycoaches;
    static Queryleague queryleague;
    static Queryfulltime queryfulltime;
    
    public static void Menu() {
        Scanner search = new Scanner(System.in);
        
        
        {
            System.out.println("Please choose an option: \n 1)Search Teams \n 1)Search Matches");
            int searchtype = search.nextInt();
            search.nextLine();
            
            switch(searchtype) {
                case 1: SearchTeams();
                    break;
                case 2: System.out.println("You will be able to search by matches soon");
            }
        }
    }
    
    public static void SearchTeams()
        {
            Scanner search = new Scanner(System.in);
            
            
            {
                System.out.println("Please choose an option: \n 1)Search by Name \n 2)Search by Coach \n 3)Search by League \n 4)Search by Division \n 5)Search by Full Time\n 6)Search all\n");
                int searchtype = search.nextInt();
                search.nextLine();
                
                
                switch(searchtype){
                    case 1: System.out.println("Please enter the team name");
                        String searchbyname = search.nextLine();
                        queryname.getName(searchbyname);
                    break;
                    case 2: System.out.println("Please enter the coach name");
                        String searchbycoach= search.nextLine();
                        querycoaches.getCoaches(searchbycoach);
                    break;
                    case 3: System.out.println("Please enter the league");
                        String searchbyleague = search.next();
                        queryleague.getLeague(searchbyleague);
                    break;
                    case 4: System.out.println("Please enter the division number");
                        String searchbydivision = search.next();
                        querydiv.getDivision(searchbydivision);
                    break;
                    case 5: System.out.println("Please enter if full time");
                        String searchbyfulltime = search.next();
                        queryfulltime.getFullTime(searchbyfulltime);
                    break;
                    case 6: System.out.println("Search by all");
                        Control.printAllTeams();
                    break;
                    default: System.out.println("Please pick an option between 1 and 6");
                }
        }
    }
}
