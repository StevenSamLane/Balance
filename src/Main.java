public class Main {
    public static void main(String[] args) {

        int initialAmount = -350; // начальная сумма на счету клиента
        int topUpAmount = 1500; // сумма пополнения счета

        int bonus = 0; // инициализируем переменную для хранения суммы бонуса

// Проверяем, превысила ли сумма пополнения порог в 1000 рублей
        if (topUpAmount > 1000) {
            bonus = topUpAmount / 100; // рассчитываем сумму бонуса
        }

        int totalAmount = initialAmount + topUpAmount + bonus; // рассчитываем итоговый счет
        System.out.println("Итоговая сумма на счету клиента: " + totalAmount + " рублей");
        System.out.println("Сумма бонуса: " + bonus + " рублей");
    }
}
