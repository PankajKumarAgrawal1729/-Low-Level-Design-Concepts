package FacadeDesignPattern.Example2;

/**
 * Client
 */
public class Client {

    public static void main(String[] args) {
        ACFacade obj = new ACFacade();
        obj.turnOnBtnClicked();
    }
}