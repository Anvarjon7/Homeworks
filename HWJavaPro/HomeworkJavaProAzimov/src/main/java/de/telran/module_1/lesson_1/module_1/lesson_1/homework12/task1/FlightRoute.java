package de.telran.module_1.lesson_1.module_1.lesson_1.homework12.task1;

import java.util.HashMap;
import java.util.Map;

public class FlightRoute {
    public static Map<String,String> findRoute(String[][] tickets){
        Map<String,String> stringMap = new HashMap<>();
        for (String[] ticket : tickets) {
            stringMap.put(ticket[0],ticket[1]);
        }
        String start = null;
        for (String[] ticket : tickets){
            if (!stringMap.containsValue(ticket[0])){
                start = ticket[0];
                break;
            }
        }
        String current = start;
        while (current != null){
            String next = stringMap.get(current);
            System.out.println(current + " -> " + next);
            current = next;
        }
        return stringMap;
    }

    public static void printRoute(Map<String,String> stringMap){
        for (Map.Entry<String,String> stringEntry : stringMap.entrySet()){
//            System.out.println(stringEntry.getKey() + " -> " + stringEntry.getValue());
        }
    }

    public static void main(String[] args) {
        String[][] tickets = {  {"Berlin", "London"},
                                {"Tokyo", "Seoul"},
                                {"Mumbai", "Berlin"},
                                {"Seoul", "Mumbai"}
        };

        Map<String,String> routeMap = findRoute(tickets);

        printRoute(routeMap);
    }
}
