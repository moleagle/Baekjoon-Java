import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n+1];

		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		br.close();

		for(int i = 0; i < n; i++){
			if(arr[i] == 0){
				System.out.println("1" + " " + "0");
			}else{
				fibonacci(arr[i]);
			}
		}
	}

	public static void fibonacci(int n) {
		int[] arrZero = new int[n+1];
		int[] arrOne = new int[n+1];

		arrZero[0] = 1;
		arrOne[0] = 0;
		arrZero[1] = 0;
		arrOne[1] = 1;

		for(int i = 2; i <= n; i++) {
			arrZero[i] = arrOne[i-1];
			arrOne[i] = arrZero[i-1] + arrOne[i-1];
		}

		System.out.println(arrZero[n] + " " + arrOne[n]);
	}
}