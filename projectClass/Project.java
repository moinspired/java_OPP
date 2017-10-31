public class Project {
    private String name;
    private String description;
    private double initialCost;

    public Project() {}
    
    public Project(String name) { this.name = name;}
    
    public Project(String name, String description, double initialCost) { 
        this.name = name; 
        this.description = description;
        this.initialCost = initialCost;
    }

    //getters 
    public String getName(){ 
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }
    public Double getInitialCost(){ 
        return this.initialCost;
    }

    //Setters
    public void setName(String name){ 
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setInitialCost(double initialCost){
        this.initialCost = initialCost;
    }
}