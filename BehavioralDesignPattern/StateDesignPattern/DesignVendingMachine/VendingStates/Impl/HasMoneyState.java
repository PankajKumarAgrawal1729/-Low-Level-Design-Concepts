package BehavioralDesignPattern.StateDesignPattern.DesignVendingMachine.VendingStates.Impl;

import java.util.List;

import BehavioralDesignPattern.StateDesignPattern.DesignVendingMachine.Coin;
import BehavioralDesignPattern.StateDesignPattern.DesignVendingMachine.Item;
import BehavioralDesignPattern.StateDesignPattern.DesignVendingMachine.VendingMachine;
import BehavioralDesignPattern.StateDesignPattern.DesignVendingMachine.VendingStates.State;

public class HasMoneyState implements State {

    public HasMoneyState() {
        System.out.println("Currently Vending Machine is in Has Money State");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
       throw new Exception("You need to click on start product selection button first");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        return;
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
       machine.setVendingMachineState(new SelectionState());
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("Product can not dispense in hasMoneyState");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("You can not get change in hasMoneyState");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        System.out.println("Accepted the coin.");
        machine.getCoinList().add(coin);
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        System.out.println("Returned the full amount back in the coin dispense tray");
        machine.setVendingMachineState(new IdleState(machine));
        return machine.getCoinList();
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("You can not update inventory in hasMoneyState");
    }

}
