import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read N
        int n = scanner.nextInt();
        
        // Create HashSet
        Set<Integer> set = new HashSet<>();
        
        // Read N integers
        for (int i = 0; i < n; i++) {
            set.add(scanner.nextInt());
        }
        
        // Print unique elements
        int count = 0;
        for (int num : set) {
            System.out.print(num);
            count++;
            if (count < set.size()) {
                System.out.print(" ");
            }
        }
        
        scanner.close();
    }
}
