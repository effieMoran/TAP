import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B {
    public static void main (String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String s = br.readLine();
        st = new StringTokenizer(s);
        int n = Integer.valueOf(st.nextToken());
        double[] a = new double[n];
        double[] p = new double[n];

        s = br.readLine();
        st = new StringTokenizer(s);
        int i = 0;
        double tot = 0;
        double max = 0;
        int pos = 0;
        while(st.hasMoreTokens()){
            a[i] = Integer.valueOf(st.nextToken());

            tot += a[i];
            if(a[i] >max){max = a[i]; pos = i;}
            i++;
        }

        for(i =0; i < n; i++){
            p[i] = a[i]*100/tot;
        }

        boolean result = true;
        if(p[pos] >= 45){
            result = true;
        }
        else if(p[pos] < 40){
            result = false;
        }
        else{
            for(i =0; i < n; i++){
                if(i != pos && p[pos]-p[i] < 10){
                    result = false;
                }
            }
        }

        System.out.println(result ? 1: 2);
    }
}
