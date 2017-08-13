import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class E {

    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String code;
        int n = Integer.valueOf(br.readLine());
        for(int i = 0; i < n; i++){
            code = br.readLine();
            HashSet<String> digits;

            int index = 0;
            do {
                digits = new HashSet<String>();
                index++;
                for (int j=0; j + index <= code.length(); j++) {
                    digits.add(code.substring(j,j+index));
                }
            } while (digits.size() == ((int) Math.pow(2,index)));
            System.out.println(index);
        }
    }
}
