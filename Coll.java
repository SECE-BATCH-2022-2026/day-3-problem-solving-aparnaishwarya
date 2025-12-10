import java.util.*;

public class Coll {
    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();



        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ;
        sc.nextLine() ; 

        for(int i=0;i<n;i++){
            String name = sc.nextLine() ;
            int age = sc.nextInt() ; 
            sc.nextLine() ; 
            students.add(new Student(name,age));

        }

        // students.add(new Student("Aparna", 20));
        // students.add(new Student("Ishwarya", 21));
        // students.add(new Student("Aparna", 20)); 

        System.out.println(students.size()); 
        for (Student s : students) {
            System.out.println(s.name + " - " + s.age);
        }
    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

