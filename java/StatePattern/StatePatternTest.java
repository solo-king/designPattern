import machines.TclTv;
import states.NoPowerState;
import states.PowerOffState;
import states.RunningState;
import states.SleepState;

/**
 * 项目描述:
 *  电视机的状态模式,电视机有如下状态
 *      1.未插电源(NoPowerState)
 *      2.休眠(SleepState)
 *      3.运行模式(RunningState)
 *      4.关机(PowerOffState)  
 * 状态切换限制:
 * NoPowerState支持的状态切换:
 *                       NoPowerState
 *                           |
 *                     PowerOffState
 * SleepState支持的状态切换:
 *                       SleepState
 *                           |
 *                --------------------------
 *               /           |              \
 *      NoPowerState    RunningState    PowerOffState
 * 
 * RunningState 的状态切换:
 *                              RunningState
 *                                  |
 *                      ---------------------------
 *                      /           |              \
 *              NoPowerState    SleepState      PowerOffState
 * 
 * PowerOffState 的状态切换:
 *                              PowerOffState
 *                                  |
 *                      -------------
 *                      /           |       
 *              NoPowerState    RunningState
 */
public class StatePatternTest{

    public static void main(String[] args){
        /**实例化电视机 */
        TclTv mTclTv = new TclTv();
        /**接入电源,进入关机状态*/
        mTclTv.PowerOn();
        /**开机进入运行状态 */
        mTclTv.PowerOn();
        /**在运行模式下执行命令,后休眠 */
        mTclTv.RemoteOpr(25);
        mTclTv.Sleep();
        /**关机 */
        mTclTv.PowerOff();
        /** 拔除电源适配器*/
        mTclTv.cutPowerAdapter();
    }
}