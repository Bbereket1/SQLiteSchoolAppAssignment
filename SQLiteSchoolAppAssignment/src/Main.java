import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

        /*
        Create an app using SQLite. It should have the following tables and columns:

        Table: classrooms
        _id (number)
        classroomName (text)
        primaryTeacher (number that represents the _id of the teacher)
        Table: teachers
        _id (number)
        firstName (text)
        lastName (text)
        classroom (number that represents the _id of the classroom they're in)
        Table: students
        _id (number)
        firstName (text)
        lastName (text)
        classroom (number that represents the _id of the classroom they're in)


        Create a Datasource class which contains the following methods:

        retrieve all classrooms
        retrieve all teachers
        retrieve all students
        create a classroom
        create a teacher
        create a student
        */

    public static final String DB_NAME = "school.db";
    //public static final String DB_PATH = "jdbc:sqlite:/c/Users/Bereket/ideaprojects/SQLiteSchoolAppAssignment/school.db";
    public static final String DB_PATH = "jdbc:sqlite:c:\\Users/Bereket/ideaprojects/SQLiteSchoolAppAssignment\\school.db";

    public static final String TABLE_CLASSROOM = "classroom";
    public static final String COLUMN_CLASSROOM_ID = "_id";
    public static final String COLUMN_CLASSROOM_CLASSROOMNAME = "classroomName";
    public static final String COLUMN_CLASSROOM_PRIMARYTEACHER = "primaryTeacher";

    public static final String TABLE_STUDENTS = "student";
    public static final String COLUMN_STUDENTS_ID = "_id";
    public static final String COLUMN_STUDENTS_FIRSTNAME = "firstName";
    public static final String COLUMN_STUDENTS_LASTNAME = "lastName";
    public static final String COLUMN_STUDENTS_CLASSROOM = "classroom";

    public static final String TABLE_TEACHERS = "teacher";
    public static final String COLUMN_TEACHERS_ID = "_id";
    public static final String COLUMN_TEACHERS_FIRSTNAME = "firstName";
    public static final String COLUMN_TEACHERS_LASTNAME = "lastName";
    public static final String COLUMN_TEACHERS_CLASSROOM = "classroom";


    public static void main(String[] args) {



       try {

            Connection conn = DriverManager.getConnection(DB_PATH);
            Statement statement = conn.createStatement();

               statement.execute("CREATE TABLE IF NOT EXISTS STUDENTS (id INTEGER, firstName TEXT, lastName TEXT , classroom TEXT)");
               statement.execute(" CREATE TABLE IF NOT EXISTS TEACHERS (id INTEGER, firstName TEXT, lastName TEXT , classroom TEXT)");
               statement.execute(" CREATE TABLE IF NOT EXISTS CLASSROOM (id INTEGER,  primaryTeacher TEXT, classRoomName TEXT)");

               statement.execute("INSERT INTO STUDENTS (id, firstName, lastName, classroom ) VALUES ('101' , 'Adam', 'wise', 'A')");
               statement.execute("INSERT INTO STUDENTS (id, firstName, lastName, classroom ) VALUES ('102' , 'Ben', 'white', 'A')");
               statement.execute("INSERT INTO STUDENTS (id, firstName, lastName, classroom ) VALUES ('103' , 'Walt', 'skillman', 'B')");
               statement.execute("INSERT INTO TEACHERS (id, firstName, lastName, classroom ) VALUES ('201' , 'Alen', 'cross', 'C')");
               statement.execute("INSERT INTO TEACHERS (id, firstName, lastName, classroom ) VALUES ('202' , 'Bear', 'Garden', 'A')");
               statement.execute("INSERT INTO TEACHERS (id, firstName, lastName, classroom ) VALUES ('203' , 'carlos', 'John', 'B ')");
               statement.execute("INSERT INTO CLASSROOM (id, primaryTeacher, classroomNamed) VALUES ('301' , 'Cross Alen', 'Junior')");
               statement.execute("INSERT INTO CLASSROOM (id, primaryTeacher, classroomNamed) VALUES ('302' , 'Betty while', 'Sinior')");
               statement.execute("INSERT INTO CLASSROOM (id, primaryTeacher, classroomNamed) VALUES ('303' , 'Anna Don', 'Head start')");


           // create  tables
          /*  statement.execute(" CREATE TABLE IF NOT EXISTS " + TABLE_STUDENTS + " ( " + COLUMN_STUDENTS_ID + " INTEGER PRIMARY KEY," + COLUMN_STUDENTS_FIRSTNAME + "TEXT,"
                    + COLUMN_STUDENTS_LASTNAME + " TEXT," + COLUMN_STUDENTS_CLASSROOM + " TEXT,");
            statement.execute(" CREATE TABLE IF NOT EXISTS " + TABLE_TEACHERS + "(" + COLUMN_TEACHERS_ID + " INTEGER PRIMARY KEY," +
                    COLUMN_TEACHERS_FIRSTNAME + " TEXT, " + COLUMN_TEACHERS_LASTNAME + "TEXT, " + COLUMN_TEACHERS_CLASSROOM + " TEXT, ");
            statement.execute(" CREATE TABLE IF NOT EXISTS " + TABLE_CLASSROOM + "(" + COLUMN_CLASSROOM_ID + " INTEGER PRIMARY KEY," +
                    COLUMN_CLASSROOM_CLASSROOMNAME + " TEXT, " + COLUMN_CLASSROOM_PRIMARYTEACHER + "TEXT, ");
            */

        } catch (SQLException e) {
            System.out.println("SQL EXCEPTION: " + e.getMessage());
            e.printStackTrace();

        }


      /*  private static void createStudent (Statement statement, String name){
            try {
                statement.execute("INSERT INTO " + TABLE_STUDENTS + "(" + COLUMN_STUDENTS_ID + ")" + "VALUES(");

            } catch (SQLException e) {
                System.out.println("ERROR creating students : " + e.getMessage());
                e.printStackTrace();

            }
            */


        }

}

