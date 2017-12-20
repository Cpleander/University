package uk.ac.kingston.programming2.football2_C;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Control {

    private static ArrayList<Team> TeamList = new ArrayList<>();
    /**
     * adds the object c to the ArrayList.
     *
     * @param c
     */
    public static void addTeam(Team c) {
        TeamList.add(c);
    }
   
    /**
     *
     * @return TeamList
     */
    public static ArrayList<Team> getTeamList() {
        return TeamList;
    }
   

    /**
     *
     * @param TeamList
     */
    public void setTeamList(ArrayList<Team> TeamList) {
        Control.TeamList = TeamList;
    }

    /**
     * This LoadFile Method read the txt file line by line and add them to a ArrayList called TeamList using the addTeam() method.
     *
     */
    public static void loadFileTeam() {
        BufferedReader buffReader = null;
        int i = 0;
        try {
            String line;
            buffReader = new BufferedReader(new FileReader("football_teams.txt"));
            buffReader.readLine();
            while ((line = buffReader.readLine()) != null) {
                String[] team = line.split(",");
                i++;
                String[] coaches = team[1].split(":");

                Control.addTeam(new Team(team[0], coaches, team[2], team[3], team[4]));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (buffReader != null) {
                    buffReader.close();
                }
            } catch (IOException cException) {
                cException.printStackTrace();
            }
        }
        System.out.println("File Loaded");

    }

    /**
     *This printAllTeams method prints all the teams in the arraylist.
     */
    public static void printAllTeams() {
        int h;
        int i = 0;
        for (h = 0; h < TeamList.size(); h++) {
            i++;
            System.out.println("Football Team " + i + " [Club Name: " + TeamList.get(h).getName() + " || Coaches: " + TeamList.get(h).getCoaches() + " || Leage: " + TeamList.get(h).getLeague() + " || Division: " + TeamList.get(h).getDivision() + " || Fulltime: " + TeamList.get(h).getFulltime());
        }

    }

    /**
     * This printTeam method prints the information about a certain team using the integer provided in the parameter.
     *
     * @param i
     */
    public static void printTeam(int i) {
        
        System.out.println("Football Team " + i + " [Club Name: " + TeamList.get(i).getName() + " || Coaches: " + TeamList.get(i).getCoaches() + " || Leage: " + TeamList.get(i).getLeague() + " || Division: " + TeamList.get(i).getDivision() + " || Fulltime: " + TeamList.get(i).getFulltime());
    }
    
        private static ArrayList<Matches> MatchList = new ArrayList<>();
    /**
     * adds the object m to the ArrayList.
     *
     * @param m
     */
    public static void addMatch(Matches m) {
        MatchList.add(m);
    }
   
    /**
     *
     * @return MatchList
     */
    public static ArrayList<Matches> getMatchList() {
        return MatchList;
    }
   

    /**
     *
     * @param MatchList
     */
    public void setMatchList(ArrayList<Matches> MatchList) {
        Control.MatchList = MatchList;
    }
    
        public static void loadFileMatch() {
        BufferedReader buffReader = null;
        int i = 0;
        try {
            String line;
            buffReader = new BufferedReader(new FileReader("football_matches.txt"));
            buffReader.readLine();
            while ((line = buffReader.readLine()) != null) {
                String[] match = line.split(",");
                i++;

                Control.addMatch(new Matches(match[0], match[1], match[2], match[3], match[4]));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (buffReader != null) {
                    buffReader.close();
                }
            } catch (IOException cException) {
                cException.printStackTrace();
            }
        }
        System.out.println("File Loaded");

    }
        
        /**
     *This printAllMatches method prints all the matches in the arraylist.
     */
    public static void printAllMatches() {
        int h;
        int i = 0;
        for (h = 0; h < MatchList.size(); h++) {
            i++;
            System.out.println("Match " + i + ": " + MatchList.get(h).getTeamname() + " " + MatchList.get(h).getResult() + " " + MatchList.get(h).getOpponent() + " " + MatchList.get(h).getDate() + " " + MatchList.get(h).getAttendence());
        }

    }

    /**
     * This printTeam method prints the information about a certain match using the integer provided in the parameter.
     *
     * @param i
     */
    public static void printMatch(int i) {
        
        System.out.println("Match " + i + ": " + MatchList.get(i).getTeamname() + " " + MatchList.get(i).getResult() + " " + MatchList.get(i).getOpponent() + " " + MatchList.get(i).getDate() + " " + MatchList.get(i).getAttendence());
    }
}
