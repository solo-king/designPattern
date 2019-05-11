package machines;

import states.NoPowerState;
import states.PowerOffState;
import states.RunningState;
import states.SleepState;
import interfaces.State;
import machines.TV;

/**TCL牌的TV */
public class TclTv extends TV implements State {
    
    
    public State powerOffState  = new PowerOffState(this);
    public State noPowerState   = new NoPowerState(this);
    public State runningState   = new RunningState(this);
    public State sleepState     = new SleepState(this);
    
    public TclTv(){

        this.init(noPowerState);
    }

    private void init( State state ){

        setCurState(state);
    }

    

    /**开机 */
    public void PowerOn(){

        getCurState().PowerOn();
    }
    /**命令操作 */
    public void RemoteOpr(int cmd){

        getCurState().RemoteOpr(cmd);
    }
    /**休眠 */
    public void Sleep(){

        getCurState().Sleep();
    }
    /**关机 */
    public void PowerOff(){

        getCurState().PowerOff();
    }
    /**拔除电源电源适配器 */
    public void cutPowerAdapter(){

        getCurState().cutPowerAdapter();
    }
}