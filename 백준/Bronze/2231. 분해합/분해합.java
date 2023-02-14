import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String st = br.readLine();
		int N = Integer.parseInt(st);
		int size = st.length();
		int result = 0;
		
		for (int i = N - (size * 9); i < N; i++) {
			int check = i;
			
			for (int j = 0; j < Integer.toString(i).length(); j++) {
				check += (i / (int)Math.pow(10, j)) % 10;
			}
			if(N == check) {
				result = i;
				break;
			}
		}
		System.out.println(result);
		br.close();
	}
}