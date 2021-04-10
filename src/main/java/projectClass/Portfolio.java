package projectClass;

import java.util.ArrayList;

public class  Portfolio {
     public ArrayList<ProjectClass> projects;


     public Portfolio(){
          this.projects = new ArrayList<ProjectClass>();

     }

     public ArrayList<ProjectClass> getProjects() {
          return projects;
     }

     public void setProjects(ArrayList<ProjectClass> projects) {
          this.projects = projects;
     }

     public void getPortfolioCost(){
          double total = 0;
          for(ProjectClass p : projects){
               total += p.getInitialCost();

          }
          System.out.println(total);

     }
     public void addToPortfolio(ProjectClass p){
          projects.add(p);

     }
     public void showPortfolio(){
          for(ProjectClass e : projects){
               System.out.println(e.elevatorPitch());
          }
          this.getPortfolioCost();

     }



}
