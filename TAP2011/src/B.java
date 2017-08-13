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

        String n =st.nextToken();
        String m = st.nextToken();

        int i;
        while (!n.equals("*") && !m.equals("*")){

            if(m.equals(n)){
                System.out.println(0);
            }
            else{
                char[] t1 = n.toCharArray();
                char[] t2 = m.toCharArray();

                int cont = 0;
                int ant = 0;

                for (i = 0; i < t1.length; i++) {

                    if(t1[i] != t2[i] && ant == 0){
                        cont++;
                        ant = 1;
                    }
                    else if(t1[i] == t2[i]){
                        ant = 0;
                    }
                }
                System.out.println(cont);
                cont = 0;
                ant = 0;

            }

            s = br.readLine();
            st = new StringTokenizer(s);
            n =st.nextToken();
            m = st.nextToken();
        }

    }
}
