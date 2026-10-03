import java .util.Scanner;
class MuncipalWasteCollection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter vehicle number: ");
        int vehicleNumber = sc.nextInt();
        System.out.println("Vehicle number: " + vehicleNumber);

        System.out.println("Waste collected: ");
        double wasteCollected = sc.nextDouble();

        System.out.println("Number of collection points: ");
        int numberOfCollectionPoints = sc.nextInt();
        System.out.println("Collection points : " + numberOfCollectionPoints);

        System.out.println("Vehicle status: ");
        char vehicleStatus = sc.next().charAt(0);
        System.out.println("Vehicle status: " + vehicleStatus);

        System.out.println("Enter waste collected at point 1: ");
        double point1Waste = sc.nextDouble();
        System.out.println("Enter waste collected at point 2: ");
        double point2Waste = sc.nextDouble();

        double totalWaste = calculateTotalWaste(point1Waste, point2Waste);
        System.out.println("Total waste collected at collection points: " + totalWaste);

        if (wasteCollected >= 100 && Character.toUpperCase(vehicleStatus) == 'A') {
            System.out.println("Collection Target Achieved");
        } else {
            System.out.println("More Waste Collection Required");
        }

    }

    static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }
}