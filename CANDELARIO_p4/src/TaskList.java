import java.util.*;

public class TaskList {
    ArrayList<Object> tasklist = new ArrayList<>();
    TaskItem ti = new TaskItem();

    public void beginFile() {
        Object start = "Current Tasks ------------" ;
            tasklist.add(start);
        }

    public void showList() {
        System.out.print(tasklist);
    }

    public void addItem() {

        tasklist.add(ti.newItem());
    }
}
