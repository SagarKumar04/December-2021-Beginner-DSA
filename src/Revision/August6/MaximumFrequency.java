package Revision.August6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaximumFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int input;
        int maximumFrequency = 0;
        int maximumValue = 0;
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for(int i = 0; i < n; i++) {
            input = scanner.nextInt();

            int frequency = 1;
            if(frequencyMap.containsKey(input)) {
                frequency = frequencyMap.get(input);
                frequency = frequency + 1;
            }

            frequencyMap.put(input, frequency);

            if(frequency > maximumFrequency) {
                maximumFrequency = frequency;
                maximumValue = input;
            }
            else if(frequency == maximumFrequency) {
                if(input > maximumValue) {
                    maximumValue = input;
                }
            }
        }

        System.out.println(maximumValue);
    }
}
