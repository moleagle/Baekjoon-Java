import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		String s;

		while((s = br.readLine()) != null) {
			int un=0, ln=0,nn=0, sn=0;
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (Character.isUpperCase(c))
					un++;
				if (Character.isLowerCase(c))
					ln++;
				if (Character.isDigit(c))
					nn++;
				if (c == ' ')
					sn++;
			}
			sb.append(ln).append(" ").append(un).append(" ").append(nn).append(" ").append(sn).append("\n");
		}
		System.out.println(sb.toString());

		br.close();

	}
}