package uk.ac.kingston.programming2.football2_C;
import java.util.*;
import java.io.*;


public class Queryleague {
    public ArrayList<Team> League;

    
    public Queryleague(ArrayList<Team> League) {
        this.League = League;
    }

public void getLeague(String searchbyleague){


for(Team teamList: League) {
    if(teamList.getLeague().equalsIgnoreCase(searchbyleague)){
        System.out.println(teamList.getName() + " || Coaches: " + teamList.getCoaches() + " || Leage: " + teamList.getLeague() + " || Division: " + teamList.getDivision() + " || Fulltime: " + teamList.getFulltime());
            }
        }
    }
}
