package states;

import machines.TclTv;
import machines.TV;
import utils.MyLog;
import interfaces.State;

public class NoPowerState implements State{
    private static String TAG = "NoPowerState";

    private TclTv mTv;

    public NoPowerState(TclTv tv){

        mTv = tv;
    }
    /**开机 */
    @Override
    public void PowerOn(){
        MyLog.d(TAG, "PowerOn:准备接入电源，进入PowerOffState");
        /**切换当前状态到电源关机状态 */
        mTv.setCurState(mTv.powerOffState);
    }
    /**命令操作 */
    @Override
    public void RemoteOpr(int cmd){
        MyLog.d(TAG, "RemoteOpr:请先接入电源.后再操作[cmd]"+cmd);
    }
    /**休眠 */
    @Override
    public void Sleep(){
        MyLog.d(TAG, "Sleep:请先接入电源");
    }
    /**关机 */
    @Override
    public void PowerOff(){

        MyLog.d(TAG, "PowerOff:请先接入电源");
    }

    /**拔除电源电源适配器 */
    @Override
    public void cutPowerAdapter(){

        MyLog.d(TAG, "cutPowerAdapter:拔除电源适配器");
        mTv.setCurState(mTv.noPowerState);
    }
}