import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int sum = 0;
		String[] str = new String[num];

		for (int i = 0; i < num; i++) {
			str[i] = br.readLine();
		}
		for(String s : str){
			int check = 0;
			char preAlpah;
			int[] arr = new int[s.length()];
			preAlpah = s.charAt(0);
			arr[0] = preAlpah;
			for(int i = 1; i < s.length(); i++){
				if(s.charAt(i) != preAlpah){
					for(int n : arr){
						if(n == s.charAt(i)){
							check++;
							break;
						}
					}
					if(check > 0){
						continue;
					}
					preAlpah = s.charAt(i);
					arr[i] = preAlpah;
				}
			}
			if(check == 0){
				sum++;
			}
		}
		System.out.println(sum);
	}
}