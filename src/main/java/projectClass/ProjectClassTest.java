package projectClass;

public class ProjectClassTest {
    public static void main(String[] args){
        ProjectClass pc = new ProjectClass();
        pc.setName("title");
        pc.setDescription("Some description");
        System.out.println(pc.getName());
        System.out.println(pc.getDescription());
        pc.elevatorPitch();
        ProjectClass pc2 =  new ProjectClass("book");
        pc2 .elevatorPitch();
        pc2.setName("book");
        pc2.setInitialCost(75.26);
        pc2.elevatorPitch();
        ProjectClass pc3 = new ProjectClass();
        pc3.setName("book");
        pc3.setDescription("Some book");
        pc3.setInitialCost(25.23);
        pc3.elevatorPitch();
       Portfolio port = new Portfolio();
       port.addToPortfolio(pc2);
       port.addToPortfolio(pc3);
       port.showPortfolio();





    }
}
