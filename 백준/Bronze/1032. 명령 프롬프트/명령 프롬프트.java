import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		String[] str = new String[num];

		for(int i = 0; i < num; i++) {
			str[i] = br.readLine();
		}

		if(num == 1){
			System.out.println(str[0]);
			return;
		}

		int l = str[0].length();
		char[] result = new char[l];

		for(int i = 0; i < l; i++){
				for(int j = 0; j < num-1; j++) {
					if(str[j].charAt(i) == str[j+1].charAt(i)){
						result[i] = str[j].charAt(i);
						continue;
					}else{
						result[i] = '?';
						break;
				}
			}
		}
		System.out.println(result);
	}
}