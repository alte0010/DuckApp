package nl.jzegers.bus;

import java.util.Stack;

public class BusStation {
    private Stack<Nameable> station = new Stack<Nameable>();

    public void arrives(Bus bus) {
        emptyBus(bus);
        fillBus(bus);
    }

    private void emptyBus(Bus bus) {
        for(String name : bus.getNames()) {
            Nameable deported = bus.getOut(name);
            station.push(deported);
        }
    }

    private void fillBus(Bus bus) {
        while(!station.isEmpty()) {
            Nameable stacked = station.pop();
            bus.getIn(stacked);
        }
    }
}
