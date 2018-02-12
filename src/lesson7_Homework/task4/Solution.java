package lesson7_Homework.task4;

/**
 * Created by Tania on 03.02.2016.
 */
/*
  Дано текст. Убрать лишние пробелы, расставить знаки препинания. Пример: «Я длинное предложение Я второе предложение.»
  -> «Я длинное предложение. Я второе предложение.»
 */
public class Solution {
    public static void main(String[] args) {
        final String text = "I am      very bad text Please   fix me.";
        String[] words = text.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                sb.append(words[i]);
                if (i + 1 < words.length && words[i + 1].length() > 0 && Character.isUpperCase(words[i + 1].charAt(0))
                        && (!words[i].endsWith("."))) {
                    sb.append(". ");
                }else sb.append(' ');
            }
        }
        System.out.println(sb.toString());


    }
}
