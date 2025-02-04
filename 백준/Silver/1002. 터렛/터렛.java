import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		int[][] in = new int[num][6];

		for(int i =0; i<num; i++){
			String[] input = br.readLine().split(" ");
			for(int j=0; j<6; j++){
				in[i][j] = Integer.parseInt(input[j]);
			}
		}
		br.close();

		for(int i =0; i<num; i++){
			double xm = in[i][0] - in[i][3];
			double ym = in[i][1] - in[i][4];
			int r1 = in[i][2];
			int r2 = in[i][5];
			int max;

			if(in[i][0] == in[i][3] && in[i][1] == in[i][4] && r1==r2){
				System.out.println("-1");
				continue;
			}

			if(r1 > r2){
				max = r1;
			}else{
				max = r2;
			}

			double r = Math.sqrt((Math.pow(xm, 2) + Math.pow(ym, 2)));

			if(max > r){
				if(r < Math.abs(r2 - r1)){
					System.out.println("0");
					continue;
				}
				if(r == Math.abs(r2 - r1)){
					System.out.println("1");
					continue;
				}
				if(r > Math.abs(r2 - r1)){
					System.out.println("2");
				}
			}else{
				if(r < r1+r2){
					System.out.println("2");
				}else if(r == r1+r2){
					System.out.println("1");
				}else if(r > r1+r2){
					System.out.println("0");
				}
			}

		}

	}
}