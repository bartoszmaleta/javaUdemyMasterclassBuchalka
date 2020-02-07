package otherTutorials.inhertinaceTutorialsPoint.teacherExample;

class Teacher {
    String designation = "Teacher";
    String collegeName = "Beginnersbook";

    void does() {
        System.out.println("Teaching");
    }
}

public class PhysicsTeacher extends Teacher {
    String mainSubject = "Physics";
    String bla = "bla12";

    public static void main(String args[]) {
        PhysicsTeacher obj = new PhysicsTeacher();
        System.out.println(obj.collegeName);
        System.out.println(obj.designation);
        System.out.println(obj.mainSubject);

        String qwe = obj.bla;
        System.out.println(qwe);

        obj.does();
    }
}