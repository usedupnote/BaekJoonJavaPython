import java.io.*;
import java.util.*;

public class Main {		
	static int[] N = new int[2];
	
	public static void main(String[] args) throws Exception {
		// 기본 설정 부분
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < 2; i++) {
			sb = new StringBuilder();
			
			sb.append(st.nextToken());
			sb.reverse();
			N[i] = Integer.parseInt(sb.toString());
		}
		System.out.println(Math.max(N[0], N[1]));
	}
}