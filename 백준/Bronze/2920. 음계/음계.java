import java.io.*;
import java.util.*;

public class Main {		
	static int N;
	static int compare;
	static String result;
	
	public static void main(String[] args) throws Exception {
		// 기본 설정 부분
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		compare = Integer.parseInt(st.nextToken());
		
		if (compare == 8 || compare == 1) {
			if (compare == 8) {
				result = "descending";
			} else {
				result = "ascending";
			}
			
			for (int i = 1; i < 8; i++) {
				N = Integer.parseInt(st.nextToken());

				if (Math.abs(compare - N) != 1) {
					result = "mixed";
					break;
				}
				compare = N;
			}	
		} else {
			result = "mixed";
		}
		System.out.println(result);
	}
}