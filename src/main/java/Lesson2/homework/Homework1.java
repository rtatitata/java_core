package Lesson2.homework;

public class Homework1 {
    public static void main(String[] args) {

        //Задание №1

        double myHeight = 1.68;
        double myWeight = 58;
        double result = (myWeight)/(myHeight*myHeight);
        System.out.println("Индекс массы тела " + result);

        //Задание №2

        int ageChildren = 107;
        if (ageChildren <= 6) {
            System.out.println("Пошел в сад");
        } else if (ageChildren <= 11) {
            System.out.println("Пошел в младшую школу");
        } else if (ageChildren <= 17) {
            System.out.println("Пошел в среднюю школу");
        } else if (ageChildren > 17) {
            System.out.println("Пошел в универ");

        //Задание №3

        boolean chicken = false;
        boolean vegetables = true;
        boolean sour = true;
        boolean toast = true;
        boolean sausage = true;
        boolean eggs = true;

        boolean resultCaesar = chicken && vegetables && sour && toast;
        boolean resultOlivie = (chicken || sausage) && vegetables && eggs;
        boolean resultVegetables  = vegetables;

        if (resultCaesar) {
            System.out.println("Сделал цезарь");
        } else if (resultOlivie) {
            System.out.println("Сделал оливье");
        } else if (resultVegetables) {
            System.out.println("Сделал овощной салат");
        } else {
            System.out.println("Ничего нет");
        }
        }
    }
}
