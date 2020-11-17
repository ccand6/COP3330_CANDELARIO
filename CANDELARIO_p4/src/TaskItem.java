import java.util.*;


public class TaskItem {
    public static int Counter;
    Scanner input = new Scanner(System.in);
    private String TaskTitle;
    private String TaskDesc;
    private String TaskDate;
    public Object fullItem;


    public Object newItem() {
        Title();
        Description();
        Date();
        fullItem = TaskTitle + TaskDesc + TaskDate;
        return fullItem;
    }

    public void Title() {
            System.out.print("Task Title: ");
            TaskTitle = input.next();

            while(TaskTitle.length() < 1) {
                System.out.print("Task Title needs to be 1 or more characters long.\nTask Title: ");
                TaskTitle = "Task Title: " + input.next() + "\n";
            }
        }

    public void Description() {
        System.out.print("Task Description: ");
        TaskDesc = input.next();
        TaskDesc = "Task Description: " + input.next() + "\n";
        }


    public void Date() {

    }
}
