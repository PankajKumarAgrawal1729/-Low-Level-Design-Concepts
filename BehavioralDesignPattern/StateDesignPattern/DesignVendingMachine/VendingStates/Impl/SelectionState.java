package BehavioralDesignPattern.StateDesignPattern.DesignVendingMachine.VendingStates.Impl;

import java.util.List;

import BehavioralDesignPattern.StateDesignPattern.DesignVendingMachine.Coin;
import BehavioralDesignPattern.StateDesignPattern.DesignVendingMachine.Item;
import BehavioralDesignPattern.StateDesignPattern.DesignVendingMachine.VendingMachine;
import BehavioralDesignPattern.StateDesignPattern.DesignVendingMachine.VendingStates.State;

public class SelectionState implements State{

    public SelectionState(){
        System.out.println("Currently Vending Machine at SelectionState");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        // get item of this codenumber
       Item item = machine.getInventory().getItem(codeNumber);

       // total amount paid by user
       int paidByUser = 0;

       for(Coin coin : machine.getCoinList()){
        paidByUser += coin.value;
       }

       // compare product price and amount paid by user
       if(item.getPrice() > paidByUser){
        System.out.println("Insufficient amount, Product you selected is of price: " + item.getPrice() + " and you paid " + paidByUser);
        refundFullMoney(machine);
        throw new Exception("Insufficient amount");
       }else if(paidByUser >= item.getPrice()){
        // if amount paid by user is greater than or equal to product price
        if(paidByUser > item.getPrice()){
            // refund the remaining amount
            getChange(paidByUser - item.getPrice());
        }
        machine.setVendingMachineState(new DispenseState(machine, codeNumber));
       }
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("You can not click on insert coin button in SelectionState");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        return;
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("Product can not be dispensed  in SelectionState");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        System.out.println("Return the change in the coin dispense tray: " + returnChangeMoney);
        return returnChangeMoney;
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("You can not insert coin in SelectionState");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        System.out.println("Returned the full amount back in the coin dispense tray");
        machine.setVendingMachineState(new IdleState(machine));
        return machine.getCoinList();
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("Inventory can not be updated in SelectionState");
    }
    
}
