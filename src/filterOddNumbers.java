import java.util.List;
import java.util.stream.Collectors;

public class filterOddNumbers {

    /**
     * This method filters out the odd numbers from a given list of integers.
     * @param numbers This is the list of integers from which odd numbers are to be filtered out.
     * @return List<Integer> This returns a list of odd integers.
     */
    public static List<Integer> filterOddNumbers(List<Integer> numbers) {
        
        // Write your code here
        List ans = numbers.stream().filter(e -> e % 2 != 0)
                        .collect(Collectors.toList());
                        
        return ans;
    }
}
