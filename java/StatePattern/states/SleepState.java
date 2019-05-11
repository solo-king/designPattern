package states;

import interfaces.State;
import machines.TV;
import utils.MyLog;
import machines.TclTv;

public class SleepState implements State{

    private static String TAG = "SleepState";
    private TclTv mTv;

    public SleepState(TclTv tv){

        mTv = tv;
    }

    /**开机 */
    public void PowerOn(){
        MyLog.d(TAG, "PowerOn");
        mTv.setCurState(mTv.runningState);
    }
    /**命令操作 */
    public void RemoteOpr(int cmd){

        MyLog.d(TAG, "RemoteOpr:请开机后再执行命令");
    }
    /**休眠 */
    public void Sleep(){

        MyLog.d(TAG, "Sleep:当前就在该模式!!");
    }
    /**关机 */
    public void PowerOff(){

        MyLog.d(TAG, "PowerOff");
        mTv.setCurState(mTv.powerOffState);

    }
    /**拔除电源电源适配器 */
    public void cutPowerAdapter(){

        MyLog.d(TAG, "cutPowerAdapter");
        mTv.setCurState(mTv.noPowerState);
    }
}