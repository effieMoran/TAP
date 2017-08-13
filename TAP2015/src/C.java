import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String line;

        while ((line = br.readLine()) != null) {
            st = new StringTokenizer(line);
            int n = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            String match = br.readLine();
            int gameA = 0;
            int gameB = 0;
            int setA = 0;
            int setB = 0;

            for(int i = 0; i < match.length(); i++){
                if(match.charAt(i) == 'A'){
                    gameA++;
                }
                else {
                    gameB++;
                }
                if(gameA >= j || gameB >= j){
                    if(gameA >= j && (gameA - gameB) >=d){
                        setA++;
                        gameA = 0;
                        gameB = 0;
                    }
                    else if(gameB >= j && (gameB - gameA) >=d){
                        setB++;
                        gameA = 0;
                        gameB = 0;
                    }

                }
            }
            System.out.println(setA+ " " + setB);
        }
    }
}
