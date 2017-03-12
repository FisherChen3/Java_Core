package basics.callback2;

/**
 * Created by Fisher on 2/4/2017.
 */
public class Student {

    private String name = null;

    public Student(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int calcADD(int a, int b) {
        return a + b;
    }

    private int useCalculator(int a, int b){
        return new Calculator().add(a,b);
    }

    public void useSuperCalculator(int a, int b){

        new SuperCalculator().add(a,b,new DoHomeWork());

    }

    public AsyncJob calcWithAsync(int a, int b){

        return new SuperCalculator().add(a,b);

    }

    public void fillBlank(int a, int b, int result) {
        System.out.println(name + "super计算器:" + a + " + " + b + " = " + result);
    }

    public class DoHomeWork implements Callback<Integer> {
        @Override
        public void onResult(Integer result) {
            System.out.println(name + "super计算器:"  + result);
        }

        @Override
        public void onError(Exception e) {
            System.out.println(name + "super计算器: error");
        }
    }
}
