import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of lab test details to be added");
    int labTestNos = sc.nextInt();
    sc.nextLine(); //consumes left over line

    System.out.println("Enter lab test details (testName:cost)");

    //making object for the LabtestInfo
    TestDetails l1 = new TestDetails();

    //loop to take n labtestNos inputs and add to array list
    for (int i = 0; i < labTestNos; i++) {
        l1.addTestDetails(sc.nextLine());
    }

    System.out.println("Enter the minimum cost");
    int minimumCost = sc.nextInt();
    l1.setMinimumCost(minimumCost);

    System.out.println("Enter the maximum cost");
    int maximumCost = sc.nextInt();
    l1.setMaximumCost(maximumCost);

    System.out.println("Test with cost between " + minimumCost + " and " + maximumCost + " INR: ");
    ArrayList<String> TestInRange = l1.getTestsWithinGivenCostRange();

    TestInRange.forEach(System.out::println);
}