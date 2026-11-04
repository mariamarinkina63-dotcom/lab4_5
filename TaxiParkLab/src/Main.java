/*Таксопарк. Определить иерархию легковых автомобилей. Создать таксопарк. Подсчитать стоимость автопарка.
Провести сортировку автомобилей парка по расходу топлива. Найти автомобиль в компании, соответствующий заданному
диапазону параметров скорости.*/

public class Main {
    public static void main(String[] args) {
        TaxiPark park = new TaxiPark();


        park.addCar(new Sedan("Toyota", "Camry", 2_500_000, 8.5, 210));
        park.addCar(new Hatchback("Kia", "Rio", 1_200_000, 6.2, 185));
        park.addCar(new SUV("Toyota", "Land Cruiser", 6_000_000, 14.5, 190));
        park.addCar(new Sedan("Hyundai", "Solaris", 1_100_000, 7.0, 195));


        park.calculateTotalCost();          // считаем общую стоимость
        park.sortByFuelConsumption();       // сортируем по расходу
        park.findCarsBySpeedRange(180, 200); // ищем машины со скоростью 180-200 км/ч
    }
}