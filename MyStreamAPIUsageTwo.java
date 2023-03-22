import java.util.*;
import java.util.stream.Collectors;

class StudentClass {
    private int roll;
    private String name;
    public StudentClass(int r, String n) {
        this.roll = r;
        this.name = n;
    }
    public int getRoll() {
        return this.roll;
    }
    public String getName() {
        return this.name;
    }
}

class MyStreamAPIUsageTwo {

    public static void sortByRoll(List<StudentClass> StudentClasss) {
        System.out.println("\n\nSorting by Roll in Ascending Order => " + StudentClasss);
        StudentClasss.stream().sorted(Comparator.comparing(StudentClass::getRoll)).collect(Collectors.toList()).forEach(st -> System.out.print(st.getName() + "<=>" + st.getRoll() + "\t"));

        System.out.println("\n\nSorting by Roll in Descending Order => " + StudentClasss);
        StudentClasss.stream().sorted(Comparator.comparing(StudentClass::getRoll).reversed()).collect(Collectors.toList()).forEach(st -> System.out.print(st.getName() + "<=>" + st.getRoll() + "\t"));
    }

    public static void sortByName(List<StudentClass> StudentClasss) {
        System.out.println("\n\nSorting by Name in Ascending Order => " + StudentClasss);
        StudentClasss.stream().sorted(Comparator.comparing(StudentClass::getName)).collect(Collectors.toList()).forEach(st -> System.out.print(st.getName() + "<=>" + st.getRoll() + "\t"));

        System.out.println("\n\nSorting by Name in Descending Order => " + StudentClasss);
        StudentClasss.stream().sorted(Comparator.comparing(StudentClass::getName).reversed()).collect(Collectors.toList()).forEach(st -> System.out.print(st.getName() + "<=>" + st.getRoll() + "\t"));
    }

    public static void start() {
        System.out.println("\n\nInside Second Stream API Module");
        StudentClass s1 = new StudentClass(10,"Sachin");
        StudentClass s3 = new StudentClass(40,"Virat");
        StudentClass s4 = new StudentClass(20,"Dhoni");
        StudentClass s2 = new StudentClass(30,"Zaheer");
        List<StudentClass> StudentClasss = new ArrayList<>();
        StudentClasss.add(s1); StudentClasss.add(s2); StudentClasss.add(s3); StudentClasss.add(s4); 
        sortByName(StudentClasss);
        sortByRoll(StudentClasss);
        System.out.println("");
    }
}
