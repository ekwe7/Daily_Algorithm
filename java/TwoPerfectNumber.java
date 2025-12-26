import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoPerfectNumber {
    public void main(String... ekwe){
        int[] numbers = {2, 11, 15, 4, 5, 7};
        int target = 9;

        int[] result = twoPerfectNumber(numbers, target);
        System.out.println(Arrays.toString(result));
    }

    public int[] twoPerfectNumber(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int index = 0; index < numbers.length; index++) {
            int numberMatch = target - numbers[index];

            if (map.containsKey(numberMatch)) {
                return new int[]{map.get(numberMatch), index};
            }
            map.put(numbers[index], index);
        }
    return new int[] {};
    }
}
