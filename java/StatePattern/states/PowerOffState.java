package states;

import interfaces.State;
import machines.TV;
import utils.MyLog;
import machines.TclTv;

public class PowerOffState implements State {

    private static String TAG = "PowerOffState";

    private TclTv mTv;

    public PowerOffState(TclTv tv){

        mTv = tv;
    }

    /**开机 */
    public void PowerOn(){
        
        MyLog.d(TAG, "PowerOn!!");
        /**进入开机状态 */
        mTv.setCurState(mTv.runningState);
    }
    /**命令操作 */
    public void RemoteOpr(int cmd){

        MyLog.d(TAG, "RemoteOpr!!.[cmd]"+cmd);
    }
    /**休眠 */
    public void Sleep(){

        MyLog.d(TAG, "Sleep");
    }
    /**关机 */
    public void PowerOff(){

        MyLog.d(TAG, "PowerOff!!");

        mTv.setCurState(mTv.noPowerState);
    }

    /**拔除电源电源适配器 */
    @Override
    public void cutPowerAdapter(){

        MyLog.d(TAG, "cutPowerAdapter:拔除电源适配器");
        mTv.setCurState(mTv.noPowerState);
    }
}
