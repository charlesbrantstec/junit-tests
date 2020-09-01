import java.util.ArrayList;


public class Student {
    public long id;
    public String name;
    public ArrayList<Integer> grades;

    public Student(long id, String name, ArrayList<Integer> grades) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        double sum = 0;
        for (Integer x : this.grades) {
            sum += x;
        }
        return sum / this.grades.size();
    }


}
