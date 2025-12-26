import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of emails");
    int noOfEmails = sc.nextInt();
    sc.nextLine(); //consume next line

    //Arrays for the spam scores
    //create array of noOfEmails size first
    int[] spamScores = new int[noOfEmails];

    System.out.println("Enter the spam scores");
    for(int i=0; i<noOfEmails; i++){
        spamScores[i] = sc.nextInt();
        //check for negative scores
        if(spamScores[i] < 0){
            System.out.println("Negative scores are not allowed");
            return;
        }
    }
    sc.nextLine(); //consumes next line

    //transform the array first according to the score >= 50 and score < 50
    for(int i =0; i<spamScores.length; i++){
        if(spamScores[i]>=50){
            spamScores[i] += 10;
        }
        else if(spamScores[i] < 5){ //case when after operation score is -ve
            spamScores[i] = 0;
        }

        else { //if i is < 50 and after operation it's not -ve
            spamScores[i] -= 5;
        }
    }

    //use hashmaps for spam score manipulations
    HashMap<Integer, Integer> scoreMap = new HashMap<>();

    for(int key: spamScores){
        scoreMap.put(key, scoreMap.getOrDefault(key, 0) + 1);
    }

    //now our hashmap is ready we only need to print the unique values
    int sum = 0;
    for(Map.Entry<Integer, Integer> m : scoreMap.entrySet()){
//        System.out.println(m.getKey() + " -> " + m.getValue());
        //check condn for unique elements only and return sum
        if(m.getValue() == 1){
            sum += m.getKey();
        }
    }

    if(sum ==0){
        System.out.println("No unique scores found after modification");
    }
    else{
        System.out.println(sum);
    }
}