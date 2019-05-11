package machines;

import interfaces.State;
/**
 * 所有TV的基类
 */
public abstract class TV{

    /**当前TV所处的状态 */
    private State mCurState;

    /**获取当前TV所处于的状态 */
    public synchronized State getCurState(){
        return mCurState;
    }
    
    /**设置当前TV所处于的状态 */
    public synchronized void setCurState(State state){

         mCurState =  state;
    }
}