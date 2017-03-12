package basics.callback2;

/**
 * Created by Fisher on 2/4/2017.
 */
public class SuperCalculator {

    public void add(int a, int b, Callback callback) {


        new Thread(()->{

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                callback.onError(e);
            }
            int result = a + b;
            callback.onResult(result);


        }).start();
    }

    public AsyncJob add(int a, int b){

        return new AsyncJob(){

            @Override
            public void start(Callback callback) {

                new Thread(()->{
                    System.out.println("start processing");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        callback.onError(e);
                    }
                    int result = a + b;
                    callback.onResult(result);


                }).start();

            }
        };

    }


}
