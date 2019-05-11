package interfaces;

public interface State{

    /**开机 */
    void PowerOn();
    /**命令操作 */
    void RemoteOpr(int cmd);
    /**休眠 */
    void Sleep();
    /**关机 */
    void PowerOff();
    /**拔除电源电源适配器 */
    void cutPowerAdapter();
}