import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        int[] die = { 1, 2, 3, 4, 5, 6 };
        ArrayList<Integer> combinations = new ArrayList<>();
        for (int eyes1 : die) {
            for (int eyes2 : die) {
                combinations.add(eyes1);
                if (eyes1 != eyes2) {
                    combinations.add(eyes2);
                }
                combinations.add(eyes1 + eyes2);
            }
        }
        int[][] occurences = new int[9][2];
        float[] probability = new float[9];
        for (int i = 0; i < occurences.length; i++) {
            occurences[i][0] = i + 1;
            occurences[i][1] = Collections.frequency(combinations, i + 1);
            probability[i] = ((float) occurences[i][1]) / (float) combinations.size();
            System.out.println(occurences[i][0] + ", " + (probability[i] * 100) + "%");
        }

    }
}
