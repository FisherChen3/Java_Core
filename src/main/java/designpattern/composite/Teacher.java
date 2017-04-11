package designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fisher on 4/10/2017.
 */
public class Teacher implements ITeacher {
    private String teacherName;
    private String deptName;
    private List<ITeacher> controls;

    Teacher(String teacherName, String deptName) {
        this.teacherName = teacherName;
        this.deptName = deptName;
        controls = new ArrayList<ITeacher>();
    }

    public void add(Teacher teacher) {
        controls.add(teacher);
    }
    public void remove(Teacher teacher)
    {
        controls.remove(teacher);
    }
    public List<ITeacher> getControllingDepts()
    {
        return controls;
    }
    @Override
    public String getDetails() {
        return (teacherName + " is the " + deptName);
    }
}
