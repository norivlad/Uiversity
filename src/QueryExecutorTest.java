import java.util.List;

public class QueryExecutorTest {
    private QueryExecutor executor;

    public QueryExecutorTest() {
        executor = new QueryExecutor();
    }

    public void testGetTeachersByDayAndClassroom() {
        List<Teacher> teachers = executor.getTeachersByDayAndClassroom("Monday", "608");
        if (teachers != null && !teachers.isEmpty()) {
            System.out.println("testGetTeachersByDayAndClassroom passed.");
        } else {
            System.out.println("testGetTeachersByDayAndClassroom failed.");
        }
    }

    public void testGetTeachersNotWorkingOnDay() {
        List<Teacher> teachers = executor.getTeachersNotWorkingOnDay("Monday");
        if (teachers != null) {
            System.out.println("testGetTeachersNotWorkingOnDay passed.");
        } else {
            System.out.println("testGetTeachersNotWorkingOnDay failed.");
        }
    }

    public void testGetDaysWithClassroomCount() {
        List<String> days = executor.getDaysWithClassroomCount(1);
        if (days != null && !days.isEmpty()) {
            System.out.println("testGetDaysWithClassroomCount passed.");
        } else {
            System.out.println("testGetDaysWithClassroomCount failed.");
        }
    }

    public void testGetDaysWithSubjectCount() {
        List<String> days = executor.getDaysWithSubjectCount(1);
        if (days != null) {
            System.out.println("testGetDaysWithSubjectCount passed.");
        } else {
            System.out.println("testGetDaysWithSubjectCount failed.");
        }
    }

    public void testMoveFirstClassToEnd() {
        executor.moveFirstClassToEnd("Monday", "Saturday");
        System.out.println("testMoveFirstClassToEnd executed.");
    }

    public static void main(String[] args) {
        QueryExecutorTest test = new QueryExecutorTest();
        test.testGetTeachersByDayAndClassroom();
        test.testGetTeachersNotWorkingOnDay();
        test.testGetDaysWithClassroomCount();
        test.testGetDaysWithSubjectCount();
        test.testMoveFirstClassToEnd();
    }
}