interface Job {

String getPosition();

void setPosition(String position);

String getEmpID();

void setEmpID(String empID);
}

interface Person {

String getName();

void setName(String name);

int getAge();

void setAge(int age);
}

class Employee implements Job, Person {

private String name;

private int age;

private String position;

private String empID;

private ArrayList<Project> myProjects;

public Employee(String name, int age, String position, String empID) {

this.name = name;

this.age = age;

this.position = position;

this.empID = empID;

this.myProjects = new ArrayList<>();

}

@Override

public String getPosition() {

return position;

}

@Override

public void setPosition(String position) {

this.position = position;

}

@Override

public String getEmpID() {

return empID;

}

@Override

public void setEmpID(String empID) {

this.empID = empID;

}

@Override

public String getName() {

return name;

}

@Override

public void setName(String name) {

this.name = name;

}

@Override

public int getAge() {

return age;

}

@Override

public void setAge(int age) {

this.age = age;

}

public void addProject(Project project) {

myProjects.add(project);

}

public void showDetails() {

System.out.println("********************************");

System.out.println("Name: " + name);

System.out.println("position: " + position);

System.out.println("EmpID: " + empID);

System.out.println("Projects");

for (Project project : myProjects) {

System.out.println(project.getProject());

}

}
}

class Project {

private String projectName;

private String description;

public Project(String projectName, String description) {

this.projectName = projectName;

this.description = description;

}

public String getProject() {

return projectName + ": " + description;

}
}

public class Main {

public static void main(String[] args) {

Employee tom = new Employee("Tom", 25, "UX/UI", "0001");

tom.addProject(new Project("Web A", "Developing a web application"));

tom.addProject(new Project("Mobile app A", "Developing a mobile app"));

Employee tim = new Employee("Tim", 30, "FrontEnd", "0002");

tim.addProject(new Project("Web A", "Developing a web application"));

System.out.println(tom.showDetails());

System.out.println(tim.showDetails());

}

}
