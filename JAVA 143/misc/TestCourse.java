public class TestCourse {
    public static void main( String[] args ) {
        Course course1 = new Course( "Data Structures" );
        course1.addStudent( "Peter Jones" );
        course1.addStudent( "Kim Smith" );
        course1.addStudent( "Anne Kennedy" );
        
        Course course2 = new Course( "Database Systems" );
        course2.addStudent( "Peter Jones" );
        course2.addStudent( "Jane Smith" );

        test1(course1);
        test1(course2);
    }
    public static void test1( Course course ) {
        System.out.println( "Number of students in " + course.getCourseName() + ": " + course.getNumberOfStudents() );
        String[] students = course.getStudents();
        printClassList(students);
    }

    public static void printClassList( String[] classList ) {
        for ( int i = 0; i < classList.length - 1; i++ ) {
        System.out.print( classList[ i ] + ", " );
        }
        if ( classList.length > 0 ) {
            System.out.println( classList[ classList.length - 1 ] );
        }
    }
}

public class Course {
    // course cannot have more students than the following number
    public static final int MAX_ENROLLMENT = 100;

    private String courseName; // name of the course
    private String[] students; // names of students enrolled in this course
    private int numberOfStudents; // number of students currently enrolled

    public Course( String courseName ) {
        this.courseName = courseName;
        students = new String[ MAX_ENROLLMENT ];
        numberOfStudents = 0;
    }

    public void addStudent( String student ) {
    // After adding at next available slot,
    // increment the number of students.
        students[ numberOfStudents++ ] = student;
        // TODO: make sure we don't add too many students.
    }
    public String[] getStudents() {
        return students;
    // TODO return copy with no nulls.
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }
    public void dropStudent( String student ) {
    // TODO
    }
}