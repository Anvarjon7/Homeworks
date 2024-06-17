package de.telran.hometasks.homework4;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter balance: ");
        int bankAccount = scanner.nextInt();

        int days = dayToWithdrawMoney(bankAccount);

        System.out.println("It will take " + days + " to withdraw your money");
    }
    public static int dayToWithdrawMoney(int balance){
        int days = 0;
        while (balance > 0){
            int div = 2;
            while (div <= balance && balance % div != 0){
                div++;
            }
            balance -= div;
            days++;
        }
    return days;
    }

}

// 1 уровень сложности: У вас на банковском счету N долларов.
//         Вы хотите снять все, но банк разрешает снять только сумму,
//         которая является делителем текущей суммы на счету и меньше текущей суммы.
//         Если вы снимаете максимально возможную сумму каждый день,
//         сколько дней вам понадобится, чтобы забрать все свои деньги из банка?
//         Примечание: если оставшаяся сумма равна 1, вы можете снять ее.
//
//         Ввод:  N = 21
//         Выход:  7
//         Объяснение:  N = 21
//         Снято 7, осталось = 14
//         Снято 7, осталось = 7
//         Снято 1, осталось = 6
//         Снято 3, осталось = 3
//         Снято 1, осталось = 2
//         Снято 1, Осталось = 1
//         Снято 1, осталось = 0