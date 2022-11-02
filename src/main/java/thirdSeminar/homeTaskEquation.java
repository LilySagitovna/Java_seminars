package thirdSeminar;

import java.util.ArrayList;
import java.util.List;

public class homeTaskEquation {
    static List<Integer> num_index;
    static char[] arrayEquation;

    public static void main(String[] args) {
        String equation = "2? + ?5 = 69".replace(" ", "");
        num_index = new ArrayList<>();
        arrayEquation = equation.toCharArray();

        for (int i = 0; i < arrayEquation.length; i++) {
            if (arrayEquation[i] == '?') {
                num_index.add(i);
            }
        }
        creatingCombination(new ArrayList<>(), 9, num_index.size());
    }

    private static void creatingCombination(List<Integer> combination, int n, int k) {
        if (combination.size() == k) {
            equationResult(combination);
            return;
        }
        for (int i = 0; i <= n; i++) {
            combination.add(i);
            creatingCombination(combination, n, k);
            combination.remove(combination.size() - 1);
        }
    }

    private static void equationResult(List<Integer> combination) {
        String result = "";
        for (int i = 0; i < combination.size(); i++) {
            char x = Integer.toString(combination.get(i)).charAt(0);
            arrayEquation[num_index.get(i)] = x;
        }
        for (int i = 0; i < arrayEquation.length; i++) {
            if (arrayEquation[i] == '+') {
                result += '=';
            } else {
                result += arrayEquation[i];
            }
        }
        String[] arr = result.split("=");
        int sum = 0;
        int res = Integer.parseInt(arr[arr.length - 1]);
        for (int i = 0; i < arr.length - 1; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        if (sum == res) {
            System.out.printf("Уравнение %s + %s = %s верно\n", arr[0], arr[1], res);
        }
    }
}


//Задано уравнение вида q + w = e, q, w, e >= 0.
//Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
//Требуется восстановить выражение до верного равенства.
//Предложить хотя бы одно решение или сообщить, что его нет.

//Чтобы решить задачу, нужно уметь генерировать все перестановки с повторениями.
//Сначала разбираем эту задачу: https://leetcode.com/problems/combinations/,
// решение даю: https://pastebin.com/neJjW69i.
// В задаче генерируются перестановки без повторений, нужно немного подкоректировать,
// чтобы были повторения, 11, 12 ... 20, 21... 30, 31...

//Как решать задачу. Выражение дается на вход в виде строки, может быть сколько угодно пробелов.
//Мы их все убираем. Метод replace. Переводим все в массив символов, чтобы могли вместо вопросов ставить символ,
//помним строки неизменяемы. Запоминаем индексы вопросов.
//Используем массив переменной длины для сохранения мест, где стоят вопросы.
//Далее начинаем генерировать комбинации. Длина комбинаций - кол-во вопросов.
//В момент, когда готова комбинация - запускаем функцию проверки, которая на место вопросов подставит
//числа из комбинации. После подстановки делаем из массива символов строку, разделяем ее по знаку =,
//перед этим заменив + на =. Получаем массив строк из трех элементов.
// Переводим эти элементы в числа и проверяем, что a + b == c.

//class Solution {
//    List<List<Integer>> ans; // переменная класса
//
//    public List<List<Integer>> combine(int n, int k) {
//        ans = new ArrayList<>();
//        helper(0, new ArrayList<>(), n, k);
//        return ans;
//    }
//
//    private void helper(int prev, List<Integer> comb, int n, int k) {
//        if (comb.size() == k) {
//            ans.add(new ArrayList<>(comb));
//            return;
//        }
//
//        for (int i = prev + 1; i <= n; i++) {
//            comb.add(i);
//            helper(i, comb, n, k);
//            comb.remove(comb.size() - 1);
//        }
//    }
//}

//77. Combinations
//    Given two integers n and k, return all possible combinations of k numbers chosen from the range [1, n].
//
//        You may return the answer in any order.
//
//
//
//        Example 1:
//
//        Input: n = 4, k = 2
//        Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
//        Explanation: There are 4 choose 2 = 6 total combinations.
//        Note that combinations are unordered, i.e., [1,2] and [2,1] are considered to be the same combination.
//        Example 2:
//
//        Input: n = 1, k = 1
//        Output: [[1]]
//        Explanation: There is 1 choose 1 = 1 total combination.
//
//
//        Constraints:
//
//        1 <= n <= 20
//        1 <= k <= n