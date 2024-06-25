package FacadeDesignPattern.Example2;

public class ACFacade {
    ACExternalUnit externalUnit;
    ACInternalUnit internalUnit;

    ACFacade(){
        externalUnit = new ACExternalUnit();
        internalUnit = new ACInternalUnit();
    }

    void turnOnBtnClicked(){
        internalUnit.acceptUserOnCmd();
        externalUnit.checkVoltage();
        externalUnit.consumeNitrogen();
        externalUnit.startCondensor();
    }
}
