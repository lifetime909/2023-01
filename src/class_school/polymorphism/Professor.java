package class_school.polymorphism;

public class Professor extends Comparable {
    private String name;
    private String professorsNum;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getProfessorsNum() {
        return professorsNum;
    }
    public void setProfessorsNum(String professorsNum) {
        this.professorsNum = professorsNum;
    }

    public Professor(String name, String professorsNum){
        this.name = name;
        this.professorsNum = professorsNum;
    }

    @Override
    public int compareTo (Comparable anotherVal) {
        Professor professor = (Professor)anotherVal;

        String youString = professor.getName();

        return professorsNum.compareTo(youString);
    }

    @Override
    public String toString() {
        return "[이름 : " + name + ", 교번 : " + professorsNum + "]";
    }
}