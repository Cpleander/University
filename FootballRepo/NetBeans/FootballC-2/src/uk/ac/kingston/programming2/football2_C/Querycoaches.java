package uk.ac.kingston.programming2.football2_C;
import java.util.*;
import java.io.*;

public class Querycoaches {
public ArrayList<Team> Coaches;

    
    public Querycoaches(ArrayList<Team> getArrayAsString) {
        this.Coaches = Coaches;
    }

public void getCoaches(String searchbycoach){


for(Team teamList: Coaches) {
    if(teamList.getCoaches().equals(searchbycoach)){
        System.out.println(teamList.getName() + " || Coaches: " + teamList.getCoaches() + " || Leage: " + teamList.getLeague() + " || Division: " + teamList.getDivision() + " || Fulltime: " + teamList.getFulltime());
            }
        }
    }
}

