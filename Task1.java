// Урок 3. Коллекции JAVA: Введение
// 1) Пусть дан произвольный список целых чисел, удалить из него четные числа

package HW_03;
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array = RandomArray(10);
        PrintArray(array);
        DeleteEvenNum(array);
        PrintArray(array);
    }
    // Метод удаления четных чисел
    public static void DeleteEvenNum(ArrayList<Integer> list){
        int i = 0;
        while (i < list.size()){
            if(list.get(i) % 2 == 0) list.remove(i);
            else i++;
        }
    }
    // Метод вывода массива
    public static void PrintArray(ArrayList<Integer> arr){ 
        for(int element: arr) {
            System.out.print(element + " ");
            } 
            System.out.println();
    }
    // Метод генерирования случайных чисел
    public static ArrayList<Integer> RandomArray(int n) { 
        ArrayList <Integer> list = new ArrayList<>();
            for(int i = 0; i < n; i++){
                list.add((int)(Math.random()*150));
            }
            return list;
    } 
}