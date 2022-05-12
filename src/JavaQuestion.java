class Student{
    String name;
    int number;
    double gpa;

    public Student(String name, int number, double gpa) {
        this.name = name;
        this.number = number;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public double getGpa() {
        return gpa;
    }

    public String toString(){
        return "Name : "+getName()+", Number : "+getNumber()+", GPA : "+getGpa();
    }
}

class StudentDB{
    Student[] students;
    enum FindGPAParam{LOWER_THAN, HIGHER_THAN}

    public StudentDB() {
        this.students = new Student[3];
        this.students[0] = new Student("0", 0, 0);
        this.students[1] = new Student("0", 0, 0);
        this.students[2] = new Student("0", 0, 0);
    }

    public void add(Student student){
        for(int i = 0; i < students.length; i++){
            if(students[i].name.equals("0")){
                students[i].name = student.getName();
                students[i].number = student.getNumber();
                students[i].gpa = student.getGpa();
                break;
            }
        }
    }

    public void add(String name, int number, double gpa){
        for(int i = 0; i < students.length; i++){
            if(students[i].name.equals("0")){
                students[i].name = name;
                students[i].number = number;
                students[i].gpa = gpa;
                break;
            }
        }
    }

    public Student findBy(String name){
        for(int i = 0; i < students.length; i++){
            if(students[i].getName().equals(name)){
                return students[i];
            }
        }
        return null;
    }

    public Student findBy(int number){
        for(int i = 0; i < students.length; i++){
            if(students[i].getNumber() == number){
                return students[i];
            }
        }
        return null;
    }

    public Student findBy(double gpa){
        for(int i = 0; i < students.length; i++){
            if(students[i].getGpa() == gpa){
                return students[i];
            }
        }
        return null;
    }

    public Student findBy(FindGPAParam param, double gpa){
        if(param == FindGPAParam.LOWER_THAN){
            for(int i = 0; i < students.length; i++){
                if(students[i].getGpa() < gpa){
                    return students[i];
                }
            }
            return null;
        }

        else if(param == FindGPAParam.HIGHER_THAN){
            for(int i = 0; i < students.length; i++){
                if(students[i].getGpa() > gpa){
                    return students[i];
                }
            }
            return null;
        }

        else
            return null;
    }
}

public class JavaQuestion {

    public static void main(String[] args) {
        StudentDB studentDB = new StudentDB();
        Student student1 = new Student("김지우", 201911111, 4.01);

        studentDB.add(student1);
        studentDB.add("이민준", 201922222, 3.85);
        studentDB.add("박서윤", 201933333, 3.90);

        for(int i = 0; i < studentDB.students.length; i++){
            System.out.println(studentDB.students[i].toString());
        }

        System.out.println("============");

        System.out.println(studentDB.findBy("김지우").toString());
        System.out.println(studentDB.findBy(201922222).toString());
        System.out.println(studentDB.findBy(3.90).toString());
        System.out.println(studentDB.findBy(StudentDB.FindGPAParam.HIGHER_THAN, 3.95).toString());
        System.out.println(studentDB.findBy(StudentDB.FindGPAParam.LOWER_THAN, 3.95).toString());
    }
}
