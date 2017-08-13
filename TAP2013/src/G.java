import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class G {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = "";
        StringTokenizer st;
        s = br.readLine();
        st = new StringTokenizer(s);
        int n = Integer.valueOf(st.nextToken());

        int[] lon = new int[n];
        int[] qua = new int[n];

        s = br.readLine();
        st = new StringTokenizer(s);
        int i =0;
        while(st.hasMoreTokens()){
            qua[i] = Integer.valueOf(st.nextToken());
            i++;
        }

        s = br.readLine();
        st = new StringTokenizer(s);
        i =0;
        while(st.hasMoreTokens()){
            lon[i] = Integer.valueOf(st.nextToken());
            i++;
        }

        Arrays.sort(lon);
        Arrays.sort(qua);

        int wars = 0;
        int l = 0;
        int q = 0;
        while(l < n){
            if(lon[l]>qua[q]){
                wars++;
                l++;
                q++;
            }
            else{
                l++;
            }
        }
        System.out.println(wars);
    }
}
