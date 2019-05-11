package states;

import machines.TclTv;
import machines.TV;
import utils.MyLog;
import interfaces.State;

public class RunningState implements State{

    private static String TAG = "RunningState";

    private TclTv mTv;

    public RunningState(TclTv tv){

        mTv = tv;
    }

    /**开机 */
    @Override
    public void PowerOn(){

        MyLog.d(TAG, "PowerOn:已经开机");
    }
    /**命令操作 */
    @Override
    public void RemoteOpr(int cmd){

        MyLog.d(TAG, "RemoteOpr:执行命令:[cmd]"+cmd);
    }
    /**休眠 */
    @Override
    public void Sleep(){

        MyLog.d(TAG, "Sleep");
        mTv.setCurState(mTv.sleepState);
    }
    /**关机 */
    @Override
    public void PowerOff(){

        MyLog.d(TAG, "PowerOff");
        mTv.setCurState(mTv.powerOffState);
    }
    /**拔除电源电源适配器 */
    @Override
    public void cutPowerAdapter(){

        MyLog.d(TAG, "cutPowerAdapter");
        mTv.setCurState(mTv.noPowerState);
    }
}