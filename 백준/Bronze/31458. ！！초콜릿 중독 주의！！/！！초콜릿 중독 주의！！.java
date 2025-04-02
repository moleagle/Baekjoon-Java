import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			String s = br.readLine();

			for(int j = 0; j < s.length(); j++){
				if(s.charAt(j) == '0'){
					if(j < s.length()-1){
						if(j == 0 || (j % 2) == 0)
							System.out.println("1");
						else
							System.out.println("0");
						break;
					}
					if(j == 0 || (j % 2) == 0)
						System.out.println("0");
					else
						System.out.println("1");
				}else if(s.charAt(j) == '1'){
					if(j == 0 || (j % 2) == 0)
						System.out.println("1");
					else
						System.out.println("0");
				}
			}
		}
		br.close();
	}
}