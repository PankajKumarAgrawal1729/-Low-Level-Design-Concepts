package AdapterDesignPattern.Client;

import AdapterDesignPattern.Adaptee.WeightMachineForBabies;
import AdapterDesignPattern.Adapter.WeightMachineAdapterImpl;

public class Main {
    public static void main(String[] args) {
        WeightMachineAdapterImpl weightMachineAdapterImpl = new WeightMachineAdapterImpl(new WeightMachineForBabies());

        System.out.println("Weight is: " + weightMachineAdapterImpl.getWeightInKg());
    }
}
