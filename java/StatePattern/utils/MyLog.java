package utils;

public class MyLog{

    private static boolean DEBUG = true;

    public static void d(String tag, String msg){
        
        if(DEBUG){
            System.out.println(tag+":"+msg);
        }

    }

}