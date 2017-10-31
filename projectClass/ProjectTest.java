public class ProjectTest {
    public static void main(String[] args){
        Project project1 = new Project("Singly Linked List");
        Project project2 = new Project("Zoo Keeper Part1");

        project1.setDescription("create your own implementation of a singly linked list");
        project1.setInitialCost(1000);
        System.out.print("Project Object: " + project1.getName() + "initial cost: $" + project1.getInitialCost());
        
    }
}