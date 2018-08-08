import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//this is test commit in testBranch
public class student {
    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;
    private String position;
    private BigDecimal salary;
    private List<String> skills;

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Staff staff;

    /*public String toString(){//overriding the toString() method
        student ni=new student();
        StringBuffer sb= new StringBuffer();
        sb.append(skills)
                .append("-");
        return sb.toString();
    }*/
}
