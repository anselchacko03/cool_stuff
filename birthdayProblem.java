import java.util.*;

public class birthdayProblem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter # of people in the room: ");
        int n = sc.nextInt();
        System.out.print("Enter # of test runs: ");
        int t = sc.nextInt();
        sc.close();

        System.out.println(test(n, t));
    }

    public static String test(int n, int t){
        //Hashmap that maps the number of days in each month
        //leap year not taken into account
        HashMap<Integer, Integer> hm = new HashMap<>(){{
            put(1, 31);
            put(2, 28);
            put(3, 31);
            put(4, 30);
            put(5, 31);
            put(6, 30);
            put(7, 31);
            put(8, 31);
            put(9, 30);
            put(10, 31);
            put(11, 30);
            put(12, 31);
        }};
        int match = 0;

        //Creates randomized array for each person in the room
        for(int a = 0; a < t; a++){
            String[] bd = new String[n];
            for(int i = 0; i < bd.length; i++){
                int month = 1+(int)(Math.random()*12);
                int day = 1+(int)(Math.random()*hm.get(month));
                bd[i] = month + "/" + day;;
            }

            //Searches array of birthdays to see if there is a match
            boolean found = false;
            for(int i = 0; i < bd.length; i++){
                for(int j = i+1; j < bd.length; j++){
                    if(bd[i].equals(bd[j])){
                        found = true;
                        break;
                    }
                }
            }
            if(found) match++;
        }
        //Returns what percent of the test runs had a matching birthday
        return ((double)(match)/t)*100 + "%";
    }
}
