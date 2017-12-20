package uk.ac.kingston.programming2.football2_C;
import java.util.*;
import java.io.*;

public class Querydiv {
public ArrayList<Team> Division;

    
    public Querydiv(ArrayList<Team> Division) {
        this.Division = Division;
    }

public void getDivision(String searchbydivision){


for(Team teamList: Division) {
    if(teamList.getDivision().equals(searchbydivision)){
        System.out.println(teamList.getName() + " || Coaches: " + teamList.getCoaches() + " || Leage: " + teamList.getLeague() + " || Division: " + teamList.getDivision() + " || Fulltime: " + teamList.getFulltime());
            }
        }
    }
}
