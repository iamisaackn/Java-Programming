import java.util.*;

// Creating an Interface
interface Marks {

 // Abstract Setters
 void setCat1();
 void setCat2();
 void setAsign();
 void setExam();

 // Abstract Getters
 int getCat1();
 int getCat2();
 int getAsign();
 int getExam();

 String grading(double m);
}

// Class Subject Makes use of the Interface
class Subject implements Marks {
 String code;
 String sname;
 int cat1, cat2, asign, exam;

 public void setCode(String c) { code = c; }
 public void setName(String n) { sname = n; }
 public String getCode() { return code; }
 public String getName() { return sname; }

 // Implementing the abstract set methods in interface Marks
 public void setCat1() {
  cat1 = (int) Math.ceil(Math.random() * 15);
 }

 public void setCat2() {
  cat2 = (int) Math.ceil(Math.random() * 10);
 }

 public void setAsign() {
  asign = (int) Math.ceil(Math.random() * 15);
 }

 public void setExam() {
  exam = (int) Math.ceil(Math.random() * 60);
 }

 // Implementing the abstract get methods in interface Marks
 public int getCat1() { return cat1; }
 public int getCat2() { return cat2; }
 public int getAsign() { return asign; }
 public int getExam() { return exam; }

 public String grading(double m) {
  String gde;
  if (m >= 70) {
   gde = "A";
  } else if (m >= 60) {
   gde = "B";
  } else if (m >= 50) {
   gde = "C";
  } else if (m >= 40) {
   gde = "D";
  } else {
   gde = "F";
  }
   return gde;
  }
}

// Class Student Inherits everything in Class Subject
class Student extends Subject {
    int stnum;
    String stname;
    
    Subject[] sbj = new Subject[7]; // In a semester a student may undertake 7 units

    public void setNumber(int n) { stnum = n; }
    public void setStName(String nm) { stname = nm; }
    public int getNumber() { return stnum; }
    public String getStName() { return stname; }
}

// Class InterfaceExample is the main class to make use of the Classes above
public class InterfaceExample {
    static Scanner scan = new Scanner(System.in);
    // Array of 7 subject names
    static String subjects[] = {"OOP1", "Operating System", "Networking", "OOP2", "Internet Technology", "Java Servelets", "Database Administration"};
    // Array of 7 subject codes
    static String codes[] = {"CMT001", "CMT002", "CMT007", "CMT003", "CMT004", "CMT005", "CMT006"};

    // The main function
    public static void main(String[] args) {
        // Variable to be used in processing the marks
        int c1, c2, asign, exm, tcats, total;
        Student st = new Student(); // Creating a student Object who is undertaking the units
        System.out.println("Enter the Student Reg Number");
        st.setNumber(scan.nextInt());
        System.out.println("Enter the Name of the Student");
        st.setStName(scan.next());
        System.out.println("St Number:\t" + st.getNumber() + "\t" + "St Name:\t" + st.getStName());

        // Setting Subject exam values.
        // Every student takes up 7 units and therefore we must capture the marks for the seven units
        for (int i = 0; i < 7; i++) {
            st.sbj[i] = new Subject();
            st.sbj[i].setCode(codes[i]);
            st.sbj[i].setName(subjects[i]);
            st.sbj[i].setCat1();
            st.sbj[i].setCat2();
            st.sbj[i].setAsign();
            st.sbj[i].setExam();
        }

        // Obtain the largest length of unit name to use it for formatted output
        int len = "Database Administration".length();

        // Processing the marks
        System.out.println("CODE\tName\tCat1\tCat2\tASIGN\tTCATS\tEXAM\tAGG\tGRADE");
        for (int j = 0; j < 7; j++) {
            c1 = st.sbj[j].getCat1();
            c2 = st.sbj[j].getCat2();
            asign = st.sbj[j].getAsign();
            exm = st.sbj[j].getExam();
            tcats = c1 + c2 + asign;
            total = tcats + exm;
            String sbname = String.format("%" + -(len) + "s", st.sbj[j].getName()).replace(' ', ' ');
            System.out.println(st.sbj[j].getCode() + "\t" + sbname + "\t" + c1 + "\t" + c2 + "\t" + asign + "\t" + tcats + "\t" + exm + "\t" + total + "\t" + st.sbj[j].grading(total));
        }
    }
}

