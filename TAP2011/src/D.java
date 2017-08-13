import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D {

    public static void main (String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String s = br.readLine();
        st = new StringTokenizer(s);

        int n = Integer.valueOf(st.nextToken());
        int m = Integer.valueOf(st.nextToken());

        long tot = 0;
        long sum = 0;
        int i;

        while (n != -1 && m !=-1){
            if(n==1){
                tot = Long.valueOf(br.readLine()) * m;
                System.out.println(tot);
            }
            else {
                s = br.readLine();
                st = new StringTokenizer(s);

                for (i = 0; i < n; i++) {
                    sum += Long.valueOf(st.nextToken());
                    tot += sum;
                }

                System.out.println(tot*m);
            }

            tot = 0;
            sum = 0;

            s = br.readLine();
            st = new StringTokenizer(s);
            n = Integer.valueOf(st.nextToken());
            m = Integer.valueOf(st.nextToken());
        }
    }
}
