import java.util.ArrayList;

public class Portfolio {
    private ArrayList<Project> projects;//used Project as a generic

    public Portfolio() {
        this.projects = new ArrayList<Project>();
    }

    public void addProjects(Project e) {// populates array list with the projects in the test file
        projects.add(e);
    }

    public int getPortfolioCost(){//calculates total cost of all projects
        int sum = 0;
        for (Project project : projects) {
            sum += project.getInitialCost();
        }
        return sum;
    }

    public void showPortfolio(){
        for (Project project : projects) {
            System.out.println("List of Projects: " + project.elevatorPitch());
        }
    }

    public ArrayList<Project> getProjects() {
        return this.projects;
    }

    public void setProjects(ArrayList<Project> projects) {
        this.projects = projects;
    }

}
