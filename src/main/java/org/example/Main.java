package org.example;

public class Main {

    public static void main(String[] args) {
        // Массив с массой моркови на каждой полянке
        int[] carrotWeights = {1, 2, 3, 4, 5};
        // Количество моркови на каждой полянке
        int[] carrotAmounts = {10, 10, 10, 10, 10}; // Пример количества, можно изменять

        // Переменная для подсчета общего количества перенесенной моркови
        int totalCarrotCarried = 0;

        // Заяц делает 10 ходок
        for (int i = 0; i < 10; i++) {
            // Ищем полянку с максимальной массой моркови, которую можно унести за одну ходку
            int maxIndex = -1;
            int maxWeight = 0;

            for (int j = 0; j < carrotWeights.length; j++) {
                if (carrotWeights[j] <= 5 && carrotAmounts[j] > 0 && carrotWeights[j] > maxWeight) {
                    maxWeight = carrotWeights[j];
                    maxIndex = j;
                }
            }

            // Если нашли подходящую полянку
            if (maxIndex != -1) {
                int carriedCarrots = Math.min(carrotAmounts[maxIndex], 5 / carrotWeights[maxIndex]) * carrotWeights[maxIndex];
                totalCarrotCarried += carriedCarrots;
                carrotAmounts[maxIndex] -= carriedCarrots / carrotWeights[maxIndex];
            }
        }

        // Выводим результат
        System.out.println("Total carrot carried: " + totalCarrotCarried + " kg");
    }
}
