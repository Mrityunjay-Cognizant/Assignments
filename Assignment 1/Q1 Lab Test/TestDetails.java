import java.util.*;

public class TestDetails {
    //Attributes
    private ArrayList<String> testDetails;
    private int minimumCost;
    private int maximumCost;

    //constructor
    TestDetails(){
        testDetails = new ArrayList<>();
    }

    //getter and setters
    void setMinimumCost(int minimumCost){
        this.minimumCost = minimumCost;
    }
    void setMaximumCost(int maximumCost){
        this.maximumCost = maximumCost;
    }
    //adding testDetails string to the detailsStrings
    public void addTestDetails(String input){
        testDetails.add(input);
    }


    public ArrayList<String> getTestsWithinGivenCostRange(){
        ArrayList<String> filteredRangedTest = new ArrayList<>();
        //we will use split and check the test within the given range and print them
        for(String key: testDetails){
            //check for the range cost
            String[] array = key.split(":");
            //now check the 2nd part and compare it with the range
            //also change it to int
            int currCost = Integer.parseInt(array[1]);

            if(currCost>= minimumCost && currCost<=maximumCost){
                filteredRangedTest.add(array[0]);
            }
        }
        return filteredRangedTest;
    }
}