package commands;

import baseInterfaces.Command;
import conctroledItems.Light;

public class LightOnCommand  implements Command{

    private Light mLight;

    public LightOnCommand(Light light){

        mLight = light;
    }
    
    @Override
    public int execCommand(){

        return mLight.onLight();
        
    }

}