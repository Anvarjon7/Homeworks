package de.telran.module_1.lesson_1.module_1.lesson_1.homework6.task1;

public class TransportCalc  {
    private Transport[] transports;

    public TransportCalc(Transport[] transports) {
        this.transports = transports;
    }
    public Transport findBestTrans(boolean minCost,boolean minTime){
        if (transports.length == 0){
            return null;
        }
        Transport bestTrans = transports[0];
        for (int i = 1; i < transports.length; i++) {
            if ((minCost && transports[i].getCost() < bestTrans.getCost()) ||
               (minTime && transports[i].getTime() < bestTrans.getTime())){
                bestTrans = transports[i];
            }
        }
        return bestTrans;
    }
}
