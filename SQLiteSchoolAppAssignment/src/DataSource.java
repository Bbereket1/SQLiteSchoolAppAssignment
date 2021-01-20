/*

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataSource extends Main{

    public static void main(String[] args) {

        try {

            Connection conn = DriverManager.getConnection(DB_PATH);
            Statement statement = conn.createStatement();
            //statement.execute("CREATE TABLE IF N OT EXISTS STUDENTS (id INTEGER, firstName TEXT, lastName TEXT , classroom TEXT)");

            // create  tables
            statement.execute(" CREATE TABLE IF NOT EXISTS " + TABLE_STUDENTS + " ( " + COLUMN_STUDENTS_ID + " INTEGER PRIMARY KEY," + COLUMN_STUDENTS_FIRSTNAME + "TEXT,"
                    + COLUMN_STUDENTS_LASTNAME + " TEXT," + COLUMN_STUDENTS_CLASSROOM + " TEXT,");

            statement.execute("INSERT INTO STUDENT (_id, firstName, lastName, classroom ) VALUES ('ab101' , 'berekett', 'Btsr', 'A')");

            statement.execute(" CREATE TABLE IF NOT EXISTS " + TABLE_TEACHERS + "(" + COLUMN_TEACHERS_ID + " INTEGER PRIMARY KEY," +
                    COLUMN_TEACHERS_FIRSTNAME + " TEXT, " + COLUMN_TEACHERS_LASTNAME + "TEXT, " + COLUMN_TEACHERS_CLASSROOM + " TEXT, ");

            statement.execute("INSERT INTO TEACHERS (_id, firstName, lastName, classroom ) VALUES ('ab101' , 'berekett', 'Btsr', 'A')");

            statement.execute(" CREATE TABLE IF NOT EXISTS " + TABLE_CLASSROOM + "(" + COLUMN_CLASSROOM_ID + " INTEGER PRIMARY KEY," +
                    COLUMN_CLASSROOM_CLASSROOMNAME + " TEXT, " + COLUMN_CLASSROOM_PRIMARYTEACHER + "TEXT, ");

            statement.execute("INSERT INTO CLASSROOM (_id, classroomName, primaryName) VALUES ('ab101' , 'berekett', 'Btsr', 'A')");

        } catch (SQLException e) {
            System.out.println("SQL EXCEPTION: " + e.getMessage());
            e.printStackTrace();

        }


      */
/*  private static void createStudent (Statement statement, String name){
            try {
                statement.execute("INSERT INTO " + TABLE_STUDENTS + "(" + COLUMN_STUDENTS_ID + ")" + "VALUES(");

            } catch (SQLException e) {
                System.out.println("ERROR creating students : " + e.getMessage());
                e.printStackTrace();

            }

       *//*



}
}
*/
