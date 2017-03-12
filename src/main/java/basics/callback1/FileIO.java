package basics.callback1;

/**
 * Created by Fisher on 2/3/2017.
 */
public class FileIO {

    public interface IFileIOCallback{

        void onResult(boolean isSave);

    }


//    public boolean saveStrToFile(String fileName,String content){
//
//        try{
//
//            File file = getExistsFile(fileName);
//            writeStrToFile(content,file);
//            return true;
//        } catch(IOException e){
//            e.printStackTrace();
//            return false;
//        }
//    }

    //  注意这里已经不用返回boolean了， 值不是通过方法传递了
//    public void saveStrToFile(final String fileName, String str, final IFileIOCallback callback){
//
//        new Thread(()->{
//
//            try{
//                File file = getExistsFile(fileName);
//                writeStrToFile(str,file);
//                // 这个onResult的方法是一个contract between FileIO and XiaoZhang, 否则就算有实例也不知道调用哪个方法
//                // xiaozhang提前告诉 FileIO他有这么一个方法
//                callback.onResult(true);
//            } catch(IOException e){
//                e.printStackTrace();
//                callback.onResult(false);
//            }
//
//        }).start();
//
//    }
}
