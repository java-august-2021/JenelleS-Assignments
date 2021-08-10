public class ProjectTest {
    public static void main(String[] args) {
        Portfolio portfolio = new Portfolio();
        Project project = new Project();
        Project project2 = new Project("New project!");
        Project project3 = new Project("Work", "Life rn");
        Project project4 = new Project("Halloween Party", "Happy Birthday to my halloween baby!", 700);

        System.out.println(project.elevatorPitch());
        System.out.println(project2.elevatorPitch());
        System.out.println(project3.elevatorPitch());
        System.out.println(project4.elevatorPitch());

        portfolio.addProjects(project);
        portfolio.addProjects(project2);
        portfolio.addProjects(project3);
        portfolio.addProjects(project4);
        System.out.println(portfolio.getPortfolioCost());
        portfolio.showPortfolio();
    }
}
