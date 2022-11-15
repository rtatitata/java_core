package Lesson2.conditions;

import java.net.SocketOption;

public class Conditions {
    public static void main(String[] args) {
        int x = 5;
        int y = 5;
        boolean resalt = x > y;

        // '=' сравнение (равно или нет), '!=' - значения не одинаковы
        // '>' - больше, '<' - меньше, '>=' - больше или равно, '<=' - меньше или равно
        if (true){
           System.out.println("x больше y");
        } else if (x == y) {
            System.out.println("x равен y");
        } else {
            System.out.println("x не больше y");
        }

         //Сын купи молоко и хлеб
        boolean isMilkBought = false;
        boolean isBreadBought = false;
        // Логическое "И" (AND) - если два значения true, то тогда true, иначе false
        boolean resaltForMom = isMilkBought && isBreadBought;
        //boolean resaltForMom = true && true;
        //boolean resaltForMom = true;
        if (resaltForMom) {
            System.out.println("Мальчик купил хлеб и молоко");
        } else if (isMilkBought) {
            System.out.printf("Мальчик не купил хлеб");
        } else if (isBreadBought) {
            System.out.println("Мальчик не купил молоко");
        } else {
            System.out.println("Мальчик не купил хлеб или и то и другое");
        }

        //Мама сказала купи или хлеб или молоко, а можно и то и то
        //Логическое или(OR) - если хотя бы одно значение true, тогда true, иначе false
        boolean resaltForMomOr = isMilkBought || isBreadBought;
        //boolean resaltForMomOr = true || true (true);
        //boolean resaltForMomOr = false || true (true);
        //boolean resaltForMomOr = false || false (false);

        //Сынок купи хлеб и что-то из сладсстей - например шоколад или конфеты
        boolean isBreadBought2 = true;
        boolean isChocoBought = true;
        boolean isCandyBought = false;
        boolean resaltForMom = isBreadBought2 && (isChocoBought || isCandyBought);

    }
}

