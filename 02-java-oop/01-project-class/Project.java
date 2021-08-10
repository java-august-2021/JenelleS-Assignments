public class Project {
    private String projectName;
    private String projectDescription;
    private double initialCost;

    //constructor
    public Project() {
        this.projectName = "Website Construction";
        this.projectDescription = "Full-Stack Project";
        this.initialCost= 500.00;
    }

    //overloaded constructors
    public Project(String projectName) {
        this.projectName = projectName;
        this.projectDescription = "This is a generic description.";
    }

    public Project(String projectName, String projectDescription) {
        this.projectName = projectName;
        this.projectDescription = projectDescription;
    }

    public Project(String projectName, String projectDescription, double initialCost) {
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.initialCost = initialCost;
    }


    //Method
    public String elevatorPitch(){
        return this.projectName + " (" + this.initialCost + "): " + this.projectDescription;
    }

    //Getters  & Setters

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public double getInitialCost() {
        return initialCost;
    }

    public void setInitialCost(double initialCost) {
        this.initialCost = initialCost;
    }
}
