public class Main {
    public static void main(String[] args) {

        int currentBalance = 205; // Текущая сумма на счету клиента
        int depositAmount = 1900; // Сумма пополнения счета
        int bonusThreshold = 1000; // Пороговая сумма для начисления бонусов
        int bonusRate = 100; // Количество рублей за каждые полные 100 рублей пополнения
        int bonus = 0; // Количество бонусных рублей

        // Проверяем, превышает ли сумма пополнения порог
        if (depositAmount > bonusThreshold) {
            // Рассчитываем количество бонусных рублей
            bonus = (depositAmount - bonusThreshold) / bonusRate;
        }

        // Рассчитываем итоговый счет
        int totalBalance = currentBalance + depositAmount + bonus;

        // Выводим результат на экран
        System.out.println("Итоговый счет: " + totalBalance + " рублей");
        System.out.println("Количество бонусных рублей: " + bonus + " рублей");
    }
}