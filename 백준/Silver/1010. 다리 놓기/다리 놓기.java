import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(br.readLine());
        int num[][] = new int[l][2];

        for (int i = 0; i < l; i++) {
            String[] buffer = br.readLine().split(" ");
            num[i][0] = Integer.parseInt(buffer[0]);
            num[i][1] = Integer.parseInt(buffer[1]);
        }
        br.close();

        for(int i = 0; i < l; i++){
            int n = num[i][0];
            int m = num[i][1];
            BigInteger result = new BigInteger("1");
            BigInteger temp = new BigInteger("1");

            while(n > 0){
                result = result.multiply(BigInteger.valueOf(m));
                temp = temp.multiply(BigInteger.valueOf(n));
                n--;
                m--;
            }
            result = result.divide(temp);
            System.out.println(result);
        }
    }
}