// Interface Job
interface Job {
  String getPosition();
  void setPosition(String position);
  String getEmpID();
  void setEmpID(String empID);
}

// Interface Person
interface Person {
  String getName();
  void setName(String name);
  int getAge();
  void setAge(int age);
}

// Class Employee
class Employee implements Job, Person {
  private String name;
  private double age;
  private String position;
  private String empID;
  private ArrayList<Project> myProject;

  Employee() {
    this.myProject = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public String getEmpID() {
    return empID;
  }

  public void setEmpID(String empID) {
    this.empID = empID;
  }

  public void AddProject(Project project) {
    myProject.add(project);
  }

  public void ShowDetails() {
    System.out.println("********************************");
    System.out.println("Name: " + name);
    System.out.println("position: " + position);
    System.out.println("EmpID: " + empID);
    System.out.println("Projects");
    for (Project project : myProject) {
      System.out.println(project.getProject());
    }
  }
}

// Class Project
class Project {
  private String projectName;
  private String description;

  Project(String projectName, String description) {
    this.projectName = projectName;
    this.description = description;
  }

  public String getProject() {
    return projectName + ": " + description;
  }
}

// Main
public class Main {
  public static void main(String[] args) {
    // Create Employee objects
    Employee tom = new Employee();
    tom.setName("Tom");
    tom.setAge(25);
    tom.setPosition("UX/UI");
    tom.setEmpID("0001");

    Employee tim = new Employee();
    tim.setName("Tim");
    tim.setAge(20);
    tim.setPosition("FontEnd");
    tim.setEmpID("0002");

    // Create Project objects
    Project webA = new Project("Web A", "Developing a web application");
    Project mobileA = new Project("Mobile app A", "Developing a mobile app");

    // Add Projects to Employee objects
    tom.AddProject(webA);
    tom.AddProject(mobileA);
    tim.AddProject(webA);

    // Show details of Employee objects
    tom.ShowDetails();
    tim.ShowDetails();
  }
}
