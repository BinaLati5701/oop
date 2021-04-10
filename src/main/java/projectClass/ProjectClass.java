package projectClass;

 class ProjectClass {
     private String name;
     private String description;
     private double initialCost;

     public ProjectClass(){

     }
     public ProjectClass(String name){
         this.name = name;
     }


     public ProjectClass(String name, String description){
         this.name = name;
         this.description= description;
     }
     public ProjectClass(String name, String description, double initialCost){
         this.name = name;
         this.description = description;
         this.initialCost = initialCost;
     }


     public double getInitialCost() {

         return initialCost;
     }

     public void setInitialCost(double initialCost) {

         this.initialCost = initialCost;
     }

     public String getName() {

         return name;
     }

     public void setName(String name) {

         this.name = name;
     }

     public String getDescription() {

         return description;
     }

     public void setDescription(String description) {

         this.description = description;
     }



     public String elevatorPitch(){

         return this.name + " " + (this.initialCost) + " : " + this.description;
     }


 }
