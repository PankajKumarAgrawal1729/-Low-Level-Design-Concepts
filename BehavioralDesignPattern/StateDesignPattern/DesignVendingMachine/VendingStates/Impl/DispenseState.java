package BehavioralDesignPattern.StateDesignPattern.DesignVendingMachine.VendingStates.Impl;

import java.util.List;

import BehavioralDesignPattern.StateDesignPattern.DesignVendingMachine.Coin;
import BehavioralDesignPattern.StateDesignPattern.DesignVendingMachine.Item;
import BehavioralDesignPattern.StateDesignPattern.DesignVendingMachine.VendingMachine;
import BehavioralDesignPattern.StateDesignPattern.DesignVendingMachine.VendingStates.State;

public class DispenseState implements State{

    public DispenseState(VendingMachine machine, int codeNumber) throws Exception{
        System.out.println("Currently Vending Machine in dispenmseState");
        dispenseProduct(machine, codeNumber);
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("Product can not be choosen in dispenseStatus");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("Insert coin button can not clicked in dispenseStatus");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("Product selection button can not clicked in dispenseStatus");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        System.out.println("Products has been dispense");
        Item item = machine.getInventory().getItem(codeNumber);
        machine.getInventory().updateSoldOutItem(codeNumber);
        machine.setVendingMachineState(new IdleState(machine));
        return item;
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("Change can not returned in dispenseStatus");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("coin can not be inserted in dispenseStatus");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        throw new Exception("Refund can not be happen in dispenseStatus");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("Inventory can not be updated in DispenseState");
    }
    
}
