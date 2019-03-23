package commands;

import baseInterfaces.Command;
import conctroledItems.*;


public class  LightOffCommand implements Command{

    private Light mLight;

    public LightOffCommand(Light light){

        mLight = light;
    }
    @Override
    public int execCommand(){

        return mLight.OffLight();
    }
    @Override
    public int undo(){

        return mLight.onLight();
    }
}