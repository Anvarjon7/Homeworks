package de.telran.module_1.lesson_1.module_1.lesson_1.homework6.task1;

public class TransportDemo {
    public static void main(String[] args) {
        Transport[] transports = {new Transport("Airplane",400,2.5),
                                 new Transport("Bus",100,6),
                                 new Transport("Train",250,4)
        };

        TransportCalc transportCalc = new TransportCalc(transports);
        boolean minCost = false;
        boolean minTime = true;

        Transport bestTrans = transportCalc.findBestTrans(minCost,minTime);
        if (bestTrans != null){
            System.out.println("The best vehicle: " + bestTrans.getType() + " " + bestTrans.getTime() + " " + bestTrans.getCost());
        }else {
            System.out.println("Could not find suitable transport.");
        }

    }

}
