import java.util.*;

public class SkyscraperConstruction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of floors in the building: ");
        int N = scanner.nextInt();
        
        int[] floorSizes = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Enter the floor size given on day " +  ": ");
            floorSizes[i] = scanner.nextInt();
        }
        
        List<Integer> assembledFloors = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            System.out.println("Day " + (i+1)+" :");
            if (assembledFloors.isEmpty()) {
                assembledFloors.add(floorSizes[i]);
                System.out.println(floorSizes[i]);
            } else {
                int floorSize = floorSizes[i];
                int index = assembledFloors.size() - 1;
                while (index >= 0 && floorSize > assembledFloors.get(index)) {
                    System.out.print(assembledFloors.get(index) + " ");
                    index--;
                }
                assembledFloors.add(index + 1, floorSize);
                System.out.println(floorSize);
            }
        }
    }
}
