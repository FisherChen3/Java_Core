package basics.callback2;

/**
 * Created by Fisher on 2/4/2017.
 */
public class Test {

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        Student s = new Student("xiao ming");
        // ayncJob is a temporary object which can start the job later
        // in this pattern, the job will not start immediately, it will only return this object for now
        // after we pass the callback object (which is the consumer object who implement Callback interface) to it, it will be able to run the job by start() method
        AsyncJob<Integer> job = s.calcWithAsync(1,1);
        System.out.println("job completed");
        job.start(s.new DoHomeWork());  // student.DoHomeWork is the implement of Callback
    }

}
