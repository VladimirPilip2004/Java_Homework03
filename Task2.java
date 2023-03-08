// Урок 3. Коллекции JAVA: Введение
// 2) Задан Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.

package HW_03;
import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        System.out.println("Начальный список: "); // Задаём список
        array.add(77);
        array.add(119);
        array.add(87);
        array.add(101);
        array.add(-33);        
        array.add(69);
        array.add(-77);
        array.add(14);
        array.add(-55);
        array.add(38);
        array.add(1);

        for(int i = 0; i < array.size(); i++){
            System.out.print(array.get(i) + " "); // Выводим списока в терминал
        }
        System.out.println("\n");
        System.out.printf("Максимальное число: %d \n", MaxNum(array));
        System.out.printf("Минимальное число: %d \n", MinNum(array));
        System.out.printf("Среднее арифметическое: %.1f \n", ArithmeticMean(array));
    }

    // Метод вычисления максимального числа из заданного списка
    public static int MaxNum(ArrayList<Integer> arr){
        int max = arr.get(0);
        for(int element : arr){
            if(element > max) max = element;
        }
        return max;
    }
    
    // Метод вычисления минимального числа из заданного списка
    public static int MinNum(ArrayList<Integer> arr){
        int min = arr.get(0);
        for(int element : arr){
            if(element < min) min = element;
        }
        return min;
    }
    
    // Метод вычисления среднего арифметического числа
    public static Double ArithmeticMean(ArrayList<Integer> arr){
        int sum = 0;
        for(int element : arr){
            sum += element;
        }
        Double am = Double.valueOf(sum)/Double.valueOf(arr.size());
        return am;
    }
}