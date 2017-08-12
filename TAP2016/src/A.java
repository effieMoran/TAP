import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null) {
            if(line.indexOf('i') >= 0){
                System.out.println('N');
            }
            else {
                System.out.println('S');
            }
        }

    }
}
