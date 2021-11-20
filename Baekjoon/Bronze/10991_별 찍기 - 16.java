import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        int cnt = -1;
        for(int i=1; i<=N; i++){

            for(int j=1; j<=N-i; j++)
                sb.append(' ');

            sb.append('*');

            if(i==1) {
                sb.append('\n');
                continue;
            }
            cnt += 2;
            for(int j=1; j<=cnt; j++) {
                if(j%2==1) {
                    sb.append(' ');
                }else{
                    sb.append('*');
                }
            }
            sb.append('*');


            sb.append('\n');
        }

        System.out.println(sb);
    }

}
