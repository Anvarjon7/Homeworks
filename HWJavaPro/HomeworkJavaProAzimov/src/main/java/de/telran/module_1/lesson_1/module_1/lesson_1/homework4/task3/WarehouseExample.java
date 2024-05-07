package de.telran.module_1.lesson_1.module_1.lesson_1.homework4.task3;

public class WarehouseExample {
    public static void main(String[] args) {

        Loader loader = new Loader();
        loader.loadGoods();
        loader.unloadGoods();
        System.out.println();

        Storekeeper storekeeper = new Storekeeper();
        storekeeper.createPickingTask();
        storekeeper.createPlacementTask();
        storekeeper.determineStorageLocation();
        storekeeper.receiveGoods();
        storekeeper.releaseGoods();
        System.out.println();

        Picker picker = new Picker();
        picker.pickGoods();
        picker.placeGoodsOnShelf();
    }
}
