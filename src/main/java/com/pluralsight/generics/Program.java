package com.pluralsight.generics;

public class Program
{
    public static void main(String[] args)
    {
        SwapBox<String> words = new SwapBox<>("coffee", "tea");
        SwapBox<Integer> scores = new SwapBox<>(85, 92);
        SwapBox<Double> prices = new SwapBox<>(4.99, 9.49);

        displayBox("Words", words);
        displayBox("Scores", scores);
        displayBox("Prices", prices);


    }

    public static <T> void displayBox(String label, SwapBox<T> box)
    {
        System.out.println(label + "before swap: " + box.describe());
        box.swap();
        System.out.println(label + "after swap: " + box.describe() + "\n");
    }
}
