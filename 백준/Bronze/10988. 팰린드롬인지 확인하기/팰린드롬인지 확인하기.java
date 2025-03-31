import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = new String();
		str = br.readLine();
		int l = str.length() - 1;
		
		br.close();

		for(int i = 0; i < str.length(); i++) {
			if(i >= l){
				break;
			}
			if(str.charAt(i) == str.charAt(l)) {
				l--;
				continue;
			}else{
				System.out.println("0");
				return;
			}

		}
		System.out.println("1");
	}
}