import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result = 0;
        while(N-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;

            for(int i=0; i<3; i++){
                sum+= Integer.parseInt(st.nextToken());
            }
            if(sum>=2){
                result++;
            }
        }
        System.out.println(result);
    }
}
